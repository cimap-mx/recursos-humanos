package cimap.recursos_humanos.api.service.personal.organigrama;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cimap.recursos_humanos.api.persistence.personal.OrganigramaEntity;
import cimap.recursos_humanos.api.persistence.personal.OrganigramaRepository;

@Service
public class OrganigramaService {

	@Autowired
	private OrganigramaRepository organigramaRepository;
	
	@Autowired
	private OrganigramaFactory organigramaFactory;
	
	public List<Organigrama> unidades() {
		
		List<Integer> tipos = new ArrayList<>();
		tipos.add(Tipo.UNIDAD);
		
		List<OrganigramaEntity> organigramaEntityList = organigramaRepository.findByIdTipoIn(tipos);		
		
		return organigramaFactory.convertir(organigramaEntityList);
	}
	
	public List<Organigrama> plazas() {
		
		List<Integer> tipos = new ArrayList<>();
		tipos.add(Tipo.UNIDAD);
		tipos.add(Tipo.PUESTO);
		
		List<OrganigramaEntity> organigramaEntityList = organigramaRepository.findByIdTipoIn(tipos);		
		
		return organigramaFactory.convertir(organigramaEntityList);
	}
	
	
	public List<Organigrama> puestos() {
		
		List<Integer> tipos = new ArrayList<>();
		tipos.add(Tipo.UNIDAD);
		tipos.add(Tipo.PLAZA);
		
		List<OrganigramaEntity> organigramaEntityList = organigramaRepository.findByIdTipoIn(tipos);		
		
		return organigramaFactory.convertir(organigramaEntityList);
	}
	
	public List<Organigrama> responsables() {
		
		List<Integer> tipos = new ArrayList<>();
		tipos.add(Tipo.UNIDAD);
		tipos.add(Tipo.PUESTO);
		
		List<OrganigramaEntity> organigramaEntityList = organigramaRepository.findByIdTipoIn(tipos);		
		
		return organigramaFactory.convertir(organigramaEntityList);
	}
	
	
}
