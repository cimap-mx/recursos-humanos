package cimap.recursos_humanos.api.personal.unidades;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cimap.recursos_humanos.api.personal.organigrama.Tipo;
import cimap.recursos_humanos.persistence.personal.OrganigramaEntity;
import cimap.recursos_humanos.persistence.personal.OrganigramaRepository;
import cimap.recursos_humanos.persistence.personal.UnidadEntity;
import cimap.recursos_humanos.persistence.personal.UnidadRepository;

@Service
public class UnidadService {
	
	@Autowired
	private UnidadRepository unidadRepository;
	
	@Autowired
	private OrganigramaRepository organigramaRepository;
	
	@Autowired
	private UnidadFactory unidadFactory;

	public List<Unidad> obtenerLista() {
		
		List<UnidadEntity> listaUnidadEntity = unidadRepository.findAll();

		return unidadFactory.convertir(listaUnidadEntity);
	}

	public Integer agregar(UnidadRequest unidad) {

		String nombre = unidad.getNombre();
		String abreviatura = unidad.getAbreviatura();
		Integer numero = unidad.getNumero();
		Integer nivel = 1;

		Integer idPadre = unidad.getIdPadre();
		UnidadEntity padreEntity = null;
		String clave = StringUtils.leftPad(numero.toString(), 2, "0");

		UnidadEntity unidadEntity = new UnidadEntity();

		// Cambiar al nodo padre
		if (idPadre != null) {
			padreEntity = unidadRepository.findById(idPadre).get();
			
			nivel = padreEntity.getNivel() + 1;
			unidadEntity.setPadre(padreEntity);
			
			clave = padreEntity.getClave() + "." + clave;
		}
		
		
		if(nivel == 1) {
			unidadEntity.setClaveNivel1(numero);
		} else if(nivel == 1) {
			unidadEntity.setClaveNivel2(numero);
		}
		

		unidadEntity.setClave(clave);
		unidadEntity.setNombre(nombre);
		unidadEntity.setAbreviatura(abreviatura);
				
		unidadRepository.save(unidadEntity);
		
		OrganigramaEntity organigramaPadreEntity = null;
		
		if(padreEntity != null) {
			organigramaPadreEntity = organigramaRepository.findByUnidad(padreEntity);
		}		
		
		OrganigramaEntity organigramaEntity = new OrganigramaEntity();
		organigramaEntity.setClave(clave);
		organigramaEntity.setIdTipo(Tipo.UNIDAD);
		organigramaEntity.setNombre(nombre);
		organigramaEntity.setPadre(organigramaPadreEntity);
		organigramaEntity.setUnidad(unidadEntity);
		organigramaEntity.setNivel(nivel);
		organigramaEntity.setClaveNivel1(claveNivel1);
		organigramaEntity.setClaveNivel2(claveNivel2);
		organigramaEntity.setClaveNivel3(claveNivel3);
		organigramaEntity.setClaveNivel4(claveNivel4);
		organigramaEntity.setClaveNivel5(claveNivel5);
		
		organigramaRepository.save(organigramaEntity);

		return unidadEntity.getIdUnidad();
	}

	public Integer modificar(Unidad unidad) {
		UnidadEntity entity = unidadRepository.getOne(unidad.getIdUnidad());
		entity.setClave(unidad.getClave());
		entity.setNombre(unidad.getNombre());
		entity.setAbreviatura(unidad.getAbreviatura());
	//	entity.setIdPadre(unidad.getIdPadre());
		unidadRepository.save(entity);
		return entity.getIdUnidad();
	}

	public Boolean eliminar(Integer idUnidad) {
		UnidadEntity entity = unidadRepository.getOne(idUnidad);
		unidadRepository.delete(entity);
		return true;
	}

	
	public Integer guardarSubnivel(UnidadSubnivel unidad) {
		return null;
	}

	public List<Unidad> obtenerListaElementosPadre(Integer idUnidad) {
		
		/*
		// TODO Auto-generated method stub
		List<Unidad> listResult = new ArrayList<>();
		UnidadEntity unidadEntity = unidadRepository.findById(idUnidad).orElseThrow(null);
		listResult.add(new Unidad(unidadEntity));
		Integer idPadre = unidadEntity.getIdPadre();
		while (idPadre != null) {
			unidadEntity = unidadRepository.findById(idPadre).orElseThrow(null);
			listResult.add(new Unidad(unidadEntity));
			idPadre = unidadEntity.getIdPadre();
		}
		return listResult;
		
		*/
		
		return null;
	}
}
