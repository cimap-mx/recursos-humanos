package cimap.recursos_humanos.persistence.personal;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UnidadRepository extends JpaRepository<UnidadEntity, Integer>{
	/*List<UnidadEntity> findByIdRaiz(Integer idRaiz);
    
    List<UnidadEntity> findByTipoAdministracion(TipoAdministracionEntity entityModificar);
    
    @Query(value="SELECT * FROM recursos_humanos.unidad AS u WHERE u.descripcion_nivel = 'T'", nativeQuery = true)
    List<UnidadEntity> findByEjercicioFiscalIdEjercicioFiscal(Integer idEjercicioFiscal);

    @Query(value="SELECT * FROM recursos_humanos.unidad AS u WHERE u.descripcion_nivel = 'T'", nativeQuery = true)
	List<UnidadEntity> listaPrimerNivelUnidad();
    */
    List<UnidadEntity> findByIdPadre(Integer idRaiz);
    
    Long countByPadre(UnidadEntity unidad);

}
