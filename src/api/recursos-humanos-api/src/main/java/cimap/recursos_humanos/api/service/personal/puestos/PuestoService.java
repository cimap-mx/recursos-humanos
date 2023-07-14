package cimap.recursos_humanos.api.service.personal.puestos;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cimap.recursos_humanos.api.persistence.personal.OrganigramaEntity;
import cimap.recursos_humanos.api.persistence.personal.OrganigramaRepository;
import cimap.recursos_humanos.api.persistence.personal.PlazaEntity;
import cimap.recursos_humanos.api.persistence.personal.PlazaRepository;
import cimap.recursos_humanos.api.persistence.personal.PuestoEntity;
import cimap.recursos_humanos.api.persistence.personal.PuestoRepository;
import cimap.recursos_humanos.api.persistence.personal.UnidadEntity;
import cimap.recursos_humanos.api.persistence.personal.UnidadRepository;
import cimap.recursos_humanos.api.service.personal.organigrama.Tipo;

@Service
public class PuestoService {

	@Autowired
	private PuestoRepository puestoRepository;
	
	@Autowired
	private UnidadRepository unidadRepository;
	
	@Autowired
	private PlazaRepository plazaRepository;
	
	@Autowired
	private OrganigramaRepository organigramaRepository;
	
	public Integer agregar(PuestoRequest puesto) {
		
		Integer numero = puesto.getNumero();
		String nombre = puesto.getNombre();
		Boolean responsable = puesto.getResponsable();
		
		Integer idUnidad = puesto.getIdUnidad();
		Integer plazas = puesto.getPlazas();
		
		UnidadEntity unidadEntity = unidadRepository.findById(idUnidad).get();
		
		String clave = null;// unidadEntity.getClave() + "." + StringUtils.leftPad(numero.toString(), 2, "0");		
		
		PuestoEntity puestoEntity = new PuestoEntity();
		puestoEntity.setUnidad(unidadEntity);
		puestoEntity.setNombre(nombre);
		puestoEntity.setPlazas(plazas);
		puestoEntity.setResponsable(responsable);
		
		puestoRepository.save(puestoEntity);
		
		OrganigramaEntity organigramaPadreEntity = organigramaRepository.findByUnidad(unidadEntity);		
		
		Integer nivel = organigramaPadreEntity.getNivel() + 1;		
		// Long numPuestos = organigramaRepository.countByPadre(organigramaPadreEntity);
		String indice = null;// organigramaPadreEntity.getClave() + "." + StringUtils.leftPad(numero.toString(), 2, "0");
		
		OrganigramaEntity organigramaEntity = new OrganigramaEntity();
	//	organigramaEntity.setClave(indice);
		organigramaEntity.setIdTipo(Tipo.PUESTO);
		organigramaEntity.setNombre(nombre);
		organigramaEntity.setPadre(organigramaPadreEntity);
		organigramaEntity.setPuesto(puestoEntity);
		organigramaEntity.setNivel(nivel);
		
		organigramaRepository.save(organigramaEntity);
		
	
		return puestoEntity.getIdPuesto();
	}
	
	
}
