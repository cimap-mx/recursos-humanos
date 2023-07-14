package cimap.recursos_humanos.api.persistence.personal;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipo_administracion", schema = "recursos_humanos")
public class TipoAdministracionEntity implements Serializable{
	
	private static final long serialVersionUID = -171283423875611344L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tipo_administracion")
	private Integer idTipoAdministracion;
	@Column(name = "tipo_administracion")
	private String tipoAdministracion;
	

	public Integer getIdTipoAdministracion() {
		return idTipoAdministracion;
	}

	public void setIdTipoAdministracion(Integer idTipoAdministracion) {
		this.idTipoAdministracion = idTipoAdministracion;
	}

	public String getTipoAdministracion() {
		return tipoAdministracion;
	}

	public void setTipoAdministracion(String nombre) {
		this.tipoAdministracion = nombre;
	}


}
