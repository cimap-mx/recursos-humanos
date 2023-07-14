package cimap.recursos_humanos.api.personal.empleados;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("recursosHumanos/personal/empleados/")
public class EmpleadoRestController {

	@Autowired EmpleadoService empleadoService;
	
	@GetMapping("lista")
	public List<Empleado> obtenerLista(){
		return empleadoService.obtenerLista();
	}
	
	@GetMapping("porCurp/{curp}")
	public Empleado obtenerPorCurp(@PathVariable String curp){
		return empleadoService.obtenerPorCurp(curp);
	}
	
	
	@GetMapping("porId/{idEmpleado}")
	public Empleado obtenerPorCurp(@PathVariable Integer idEmpleado){
		return empleadoService.obtenerPorId(idEmpleado);
	}
	
	
	@PostMapping("modificar")
	public Integer modificarEmpleado(@RequestBody Empleado empleado){
		return empleadoService.modificar(empleado);
	}
	
	
	
}
