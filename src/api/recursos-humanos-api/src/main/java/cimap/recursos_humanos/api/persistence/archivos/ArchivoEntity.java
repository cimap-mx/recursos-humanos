package cimap.recursos_humanos.api.persistence.archivos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "archivo", schema = "archivos")
public class ArchivoEntity {

	@Id
	@Column(name = "id_archivo")
	private Long idArchivo;
}
