package cimap.recursos_humanos.api.persistence.personal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipo_asignacion", schema = "personal")
public class TipoAsignacionEntity {

	
	@Id
	@Column(name = "id_tipo_asignacion")
	private String idTipoAsignacion;
	
	@Column(name = "nombre")
	private String nombre;

	public String getIdTipoAsignacion() {
		return idTipoAsignacion;
	}

	public void setIdTipoAsignacion(String idTipoAsignacion) {
		this.idTipoAsignacion = idTipoAsignacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
