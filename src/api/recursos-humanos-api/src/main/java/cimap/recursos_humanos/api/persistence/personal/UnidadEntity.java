package cimap.recursos_humanos.api.persistence.personal;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "unidad", schema = "personal")
public class UnidadEntity implements Serializable {

	private static final long serialVersionUID = 3277816458407947533L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_unidad")
	private Integer idUnidad;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "abreviatura")
	private String abreviatura;
	
	@Column(name = "nivel")
	private Integer nivel;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_padre")
	private UnidadEntity padre;
	
	

	public Integer getIdUnidad() {
		return idUnidad;
	}

	public void setIdUnidad(Integer idUnidad) {
		this.idUnidad = idUnidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAbreviatura() {
		return abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}

	public UnidadEntity getPadre() {
		return padre;
	}

	public void setPadre(UnidadEntity padre) {
		this.padre = padre;
	}

	public Integer getNivel() {
		return nivel;
	}

	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}

	
	
}

