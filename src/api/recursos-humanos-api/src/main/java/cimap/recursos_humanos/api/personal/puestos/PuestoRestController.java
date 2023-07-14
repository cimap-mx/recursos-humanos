package cimap.recursos_humanos.api.personal.puestos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("personal/puestos")
public class PuestoRestController {

	
	@Autowired
	private PuestoService puestoService;
	
	
}
