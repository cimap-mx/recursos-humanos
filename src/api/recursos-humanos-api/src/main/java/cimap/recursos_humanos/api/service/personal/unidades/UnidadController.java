package cimap.recursos_humanos.api.service.personal.unidades;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("personal/unidades/")
public class UnidadController {
	
	@Autowired
	UnidadService unidadService;
	
	@GetMapping("lista")
	public List<Unidad> obtenerLista(){
		return unidadService.obtenerLista();
	}
	
	@PostMapping("agregar")
	public Integer agregar(@RequestBody UnidadRequest unidad) {
		return unidadService.agregar(unidad);
	}
	
	@PostMapping("guardarSubnivel")
	public Integer guardarSubnivel(@RequestBody UnidadSubnivel unidad) {
		return unidadService.guardarSubnivel(unidad);
	}
	
	@PostMapping("modificar")
	public Integer modificar(@RequestBody Unidad unidad) {
		return unidadService.modificar(unidad);
	}
	
	@DeleteMapping("eliminar/{idUnidad}")
	public Boolean eliminar(@PathVariable Integer idUnidad) {
		return unidadService.eliminar(idUnidad);
	}
	
	@GetMapping("elementosPadre/{idUnidad}")
	public List<Unidad> obtenerListaPadre(@PathVariable Integer idUnidad){
		return unidadService.obtenerListaElementosPadre(idUnidad);
	}
	
}
