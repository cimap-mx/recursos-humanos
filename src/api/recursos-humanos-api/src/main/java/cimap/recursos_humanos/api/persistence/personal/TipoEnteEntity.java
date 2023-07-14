package cimap.recursos_humanos.api.persistence.personal;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipo_ente", schema = "recursos_humanos")
public class TipoEnteEntity implements Serializable{

	private static final long serialVersionUID = -5586802409803942552L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tipo_ente")
	private Integer idTipoEnte;

	@Column(name = "ente")
	private String ente;

	public Integer getIdTipoEnte() {
		return idTipoEnte;
	}

	public void setIdTipoEnte(Integer idTipoEnte) {
		this.idTipoEnte = idTipoEnte;
	}

	public String getEnte() {
		return ente;
	}

	public void setEnte(String ente) {
		this.ente = ente;
	}
	
	

}
