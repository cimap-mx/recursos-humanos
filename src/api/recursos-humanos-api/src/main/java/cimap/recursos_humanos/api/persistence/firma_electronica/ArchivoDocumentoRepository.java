package cimap.recursos_humanos.api.persistence.firma_electronica;

import org.springframework.data.jpa.repository.JpaRepository;

import cimap.recursos_humanos.api.persistence.admin.seguridad.SesionEntity;

public interface ArchivoDocumentoRepository extends JpaRepository<ArchivoDocumentoEntity, Integer> {

}
