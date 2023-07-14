package cimap.recursos_humanos.persistence.firma_electronica;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_archivo", schema = "firma_electronica")
public class TipoArchivoEntity {

	@Id
	@Column(name = "id_tipo_archivo")
	private String idTipoArchivo;
	
	@Column(name = "nombre")
	private String nombre;

	public String getIdTipoArchivo() {
		return idTipoArchivo;
	}

	public void setIdTipoArchivo(String idTipoArchivo) {
		this.idTipoArchivo = idTipoArchivo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
