package cimap.recursos_humanos.persistence.admin.seguridad;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;




public interface SesionRepository extends JpaRepository<SesionEntity, Integer> {
	
	
	List<SesionEntity> findByIdUsuarioAndEjercicioAndEstado(int idUsuario,int ejercicio, SesionEstatusEnum estado );
	
	

}
