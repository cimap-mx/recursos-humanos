package cimap.recursos_humanos.persistence.firma_electronica;

import org.springframework.data.jpa.repository.JpaRepository;

import cimap.recursos_humanos.persistence.admin.seguridad.SesionEntity;

public interface ArchivoDocumentoRepository extends JpaRepository<ArchivoDocumentoEntity, Integer> {

}
