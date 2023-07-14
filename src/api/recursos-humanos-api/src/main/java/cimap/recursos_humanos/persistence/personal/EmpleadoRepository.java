package cimap.recursos_humanos.persistence.personal;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<EmpleadoEntity, Integer>{

	
	EmpleadoEntity findByCurp(String curp);
	
}
