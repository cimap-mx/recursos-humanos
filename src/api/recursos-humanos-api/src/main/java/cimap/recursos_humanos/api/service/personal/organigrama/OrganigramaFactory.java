package cimap.recursos_humanos.api.service.personal.organigrama;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import cimap.recursos_humanos.api.persistence.personal.OrganigramaEntity;

@Component
public class OrganigramaFactory {

	public Organigrama convertir(OrganigramaEntity organigramaEntity) {
		
		Integer idOrganigrama = organigramaEntity.getIdOrganigrama();
		String clave = null;//organigramaEntity.getClave();
		String nombre = organigramaEntity.getNombre();
		Integer idPadre = null;
		if(organigramaEntity.getPadre() != null) {
			idPadre = organigramaEntity.getPadre().getIdOrganigrama();
		}
		
		Integer plazas = null;
		if(organigramaEntity.getPuesto() != null) {
			plazas = organigramaEntity.getPuesto().getPlazas();
		}
		
		String responsable = null;
		
		
		if(organigramaEntity.getPlaza() != null) {
			responsable = organigramaEntity.getPlaza().getEmpleado().getNombreCompleto();
		}
		
		
		Organigrama organigrama = new Organigrama();
		organigrama.setIdOrganigrama(idOrganigrama);
		organigrama.setClave(clave);
		organigrama.setNombre(nombre);
		organigrama.setIdPadre(idPadre);
		organigrama.setPlazas(plazas);
		organigrama.setResponsable(responsable);
		
		
		return organigrama;
	}
	
	public List<Organigrama> convertir(List<OrganigramaEntity> organigramaEntityList) {
		
		List<Organigrama> resultado = new ArrayList<>();
		
		for(OrganigramaEntity organigramaEntity : organigramaEntityList) {
			
			Organigrama organigrama = convertir(organigramaEntity);
			resultado.add(organigrama);
		}
		
		return resultado;
	}
}
