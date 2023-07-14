package cimap.recursos_humanos.api.persistence.personal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoPuestoRepository extends JpaRepository<EmpleadoPuestoEntity, Integer> {

	List<EmpleadoPuestoEntity> findByUnidadIdUnidad(Integer idUnidad);
	
	EmpleadoPuestoEntity findByEmpleadoIdEmpleado(Integer idEmplaedo);
	
}
