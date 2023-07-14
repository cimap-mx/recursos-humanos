package cimap.recursos_humanos.api.service.personal.plazas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cimap.recursos_humanos.api.persistence.personal.PlazaEntity;
import cimap.recursos_humanos.api.persistence.personal.PlazaRepository;

@Service
public class PlazaService {

	@Autowired
	private PlazaRepository plazaRepository;
	
	public Integer agregar(PlazaRequest plaza) {
		
		PlazaEntity plazaEntity = new PlazaEntity();
		
		return null;
	}
}
