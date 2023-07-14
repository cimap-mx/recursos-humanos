package cimap.recursos_humanos.api.personal.empleados;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cimap.recursos_humanos.persistence.personal.EmpleadoPuestoRepository;
import cimap.recursos_humanos.persistence.personal.EmpleadoRepository;
import cimap.recursos_humanos.persistence.personal.PuestoRepository;
import cimap.recursos_humanos.persistence.personal.UnidadRepository;

@Service
public class EmpleadoService {

	@Autowired
	EmpleadoRepository empleadoRepository;

	@Autowired
	EmpleadoPuestoRepository empleadoPuestoRepository;

	@Autowired
	PuestoRepository puestoRepository;

	@Autowired
	UnidadRepository unidadRepository;

	public Empleado obtenerPorCurp(String curp) {

		
		return null;
	}

	public List<Empleado> obtenerLista() {
		
		return null;
	}

	public Empleado obtenerPorId(Integer idEmpleado) {
		
		return null;

	}

	public Integer modificar(Empleado empleado) {
		return null;
	}
}
