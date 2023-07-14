package cimap.recursos_humanos.api.persistence.personal;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepository  extends JpaRepository<UsuarioEntity, Integer>{

	
	List<UsuarioEntity> findByNombreCompletoIgnoreCaseContaining(String nombre);
	Optional<UsuarioEntity> findOneByEmail(String email);
	
	
	
}
