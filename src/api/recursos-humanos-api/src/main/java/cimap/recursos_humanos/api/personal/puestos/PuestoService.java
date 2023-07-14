package cimap.recursos_humanos.api.personal.puestos;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cimap.recursos_humanos.api.personal.organigrama.Tipo;
import cimap.recursos_humanos.persistence.personal.OrganigramaEntity;
import cimap.recursos_humanos.persistence.personal.OrganigramaRepository;
import cimap.recursos_humanos.persistence.personal.PlazaEntity;
import cimap.recursos_humanos.persistence.personal.PuestoEntity;
import cimap.recursos_humanos.persistence.personal.PlazaRepository;
import cimap.recursos_humanos.persistence.personal.PuestoRepository;
import cimap.recursos_humanos.persistence.personal.UnidadEntity;
import cimap.recursos_humanos.persistence.personal.UnidadRepository;

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
		
		String clave = unidadEntity.getClave() + "." + StringUtils.leftPad(numero.toString(), 2, "0");		
		
		PuestoEntity puestoEntity = new PuestoEntity();
		puestoEntity.setUnidad(unidadEntity);
		puestoEntity.setNombre(nombre);
		puestoEntity.setPlazas(plazas);
		puestoEntity.setResponsable(responsable);
		
		puestoRepository.save(puestoEntity);
		
		OrganigramaEntity organigramaPadreEntity = organigramaRepository.findByUnidad(unidadEntity);		
		
		Integer nivel = organigramaPadreEntity.getNivel() + 1;		
		// Long numPuestos = organigramaRepository.countByPadre(organigramaPadreEntity);
		String indice = organigramaPadreEntity.getClave() + "." + StringUtils.leftPad(numero.toString(), 2, "0");
		
		OrganigramaEntity organigramaEntity = new OrganigramaEntity();
		organigramaEntity.setClave(indice);
		organigramaEntity.setIdTipo(Tipo.PUESTO);
		organigramaEntity.setNombre(nombre);
		organigramaEntity.setPadre(organigramaPadreEntity);
		organigramaEntity.setPuesto(puestoEntity);
		organigramaEntity.setNivel(nivel);
		
		organigramaRepository.save(organigramaEntity);
		
	
		return puestoEntity.getIdPuesto();
	}
	
	
}
