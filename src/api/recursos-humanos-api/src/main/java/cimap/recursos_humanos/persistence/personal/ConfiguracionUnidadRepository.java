package cimap.recursos_humanos.persistence.personal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ConfiguracionUnidadRepository extends JpaRepository<ConfiguracionUnidadEntity, Integer>{

	List<ConfiguracionUnidadEntity> findByEjercicioInicial(int ejercicio);
	
	ConfiguracionUnidadEntity findByIdConfiguracionUnidad (int id);
	
	@Query(value="SELECT * FROM recursos_humanos.configuracion_unidad AS c "
			+ "WHERE c.ejercicio_inicial =:ejercicio", nativeQuery = true)
	ConfiguracionUnidadEntity ConfiguracionUnidadEjercicioInicial(Integer ejercicio);
}