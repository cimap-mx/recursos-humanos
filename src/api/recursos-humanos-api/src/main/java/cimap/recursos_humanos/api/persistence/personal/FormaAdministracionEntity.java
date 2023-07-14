package cimap.recursos_humanos.api.persistence.personal;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="forma_administracion", schema = "recursos_humanos")
public class FormaAdministracionEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5601925751356967803L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_forma_administracion")
	private Integer idFormaAdministracion;

	@Column(name = "forma_administracion")
	private String formaAdministracion;

	public Integer getIdFormaAdministracion() {
		return idFormaAdministracion;
	}

	public void setIdFormaAdministracion(Integer idFormaAdministracion) {
		this.idFormaAdministracion = idFormaAdministracion;
	}

	public String getFormaAdministracion() {
		return formaAdministracion;
	}

	public void setFormaAdministracion(String formaAdministracion) {
		this.formaAdministracion = formaAdministracion;
	}
	
	
	
}
