package cimap.recursos_humanos.persistence.firma_electronica;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estatus_documento", schema = "firma_electronica")
public class EstatusDocumentoEntity {

	
	@Id
	@Column(name = "id_estatus")
	private String idEstatus;
	
	@Column(name = "nombre")
	private String nombre;

	public String getIdEstatus() {
		return idEstatus;
	}

	public void setIdEstatus(String idEstatus) {
		this.idEstatus = idEstatus;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
