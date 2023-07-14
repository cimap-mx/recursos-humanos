package cimap.recursos_humanos.api.personal.unidades;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import cimap.recursos_humanos.persistence.personal.UnidadEntity;

@Component
public class UnidadFactory {

	
	public Unidad convertir(UnidadEntity entity) {
		
		Integer idUnidad = entity.getIdUnidad();
		Integer idPadre = null;
		
		if(entity.getPadre() != null) {
			idPadre = entity.getPadre().getIdUnidad();
		}
		
		String abreviatura = entity.getAbreviatura();
		String nombre = entity.getNombre();
		
		Unidad unidad = new Unidad();
		unidad.setIdUnidad(idUnidad);
		unidad.setIdPadre(idPadre);
		unidad.setClave(clave);
		unidad.setAbreviatura(abreviatura);
		unidad.setNombre(nombre);
		
		return unidad;
	}
	
	public List<Unidad> convertir(List<UnidadEntity> unidadEntityList) {
		
		
		List<Unidad> resultado = new ArrayList<>();
		for(UnidadEntity unidadEntity : unidadEntityList) {
			Unidad unidad = convertir(unidadEntity);
		}
		
		return resultado;
	}
}
