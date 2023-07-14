package cimap.recursos_humanos.api.service.personal.organigrama;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("personal/organigrama")
public class OrganigramaController {

	@Autowired
	private OrganigramaService organigramaService;
	
	@GetMapping("unidades")
	public List<Organigrama> unidades() {
		
		return organigramaService.unidades();
	}	
	
	@GetMapping("puestos")
	public List<Organigrama> puestos() {
		
		return organigramaService.puestos();
	}
	
	@GetMapping("plazas")
	public List<Organigrama> plazas() {
		
		return organigramaService.plazas();
	}
	
	@GetMapping("responsables")
	public List<Organigrama> responsables() {
		
		return organigramaService.puestos();
	}
	
}
