package cimap.recursos_humanos.persistence.personal;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="nivel_puesto",schema = "recursos_humanos")
public class NivelPuestoEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7834844529173645143L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_nivel_puesto")
	private Integer idNivelPuesto;
	
	@Column(name = "nivel")
	private String nivel;
	
	@Column(name = "id_ejercicio")
	private Integer idEjercicio;

	
	public Integer getIdNivelPuesto() {
		return idNivelPuesto;
	}

	public void setIdNivelPuesto(Integer idNivelPuesto) {
		this.idNivelPuesto = idNivelPuesto;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public Integer getIdEjercicio() {
		return idEjercicio;
	}

	public void setIdEjercicio(Integer idEjercicio) {
		this.idEjercicio = idEjercicio;
	}
	
	
	
	

}
