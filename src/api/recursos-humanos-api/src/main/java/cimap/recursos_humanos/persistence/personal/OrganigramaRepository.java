package cimap.recursos_humanos.persistence.personal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganigramaRepository extends JpaRepository<OrganigramaEntity, Integer>{

	List<OrganigramaEntity> findByIdTipoIn(List<Integer> tipos);

	OrganigramaEntity findByUnidad(UnidadEntity padreEntity);
	
	Long countByPadre(OrganigramaEntity organigrama);
}
