package cimap.recursos_humanos.persistence.personal;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoEnteRepository extends JpaRepository<TipoEnteEntity, Integer> {

	TipoEnteEntity findByIdTipoEnte(Integer idTipoEnte);
}
