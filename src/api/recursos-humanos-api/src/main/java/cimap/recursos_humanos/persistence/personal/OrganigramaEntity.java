package cimap.recursos_humanos.persistence.personal;

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
@Table(name="organigrama",schema = "personal")
public class OrganigramaEntity {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_organigrama")
	private Integer idOrganigrama;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_padre")
	private OrganigramaEntity padre;
	
	@Column(name="indice")
	private String indice;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="id_tipo")
	private Integer idTipo;
	
	@Column(name = "nivel")
	private Integer nivel;
	
	@Column(name = "numero_indice")
	private Integer numeroIndice;	
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_unidad")
	private UnidadEntity unidad;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_puesto")
	private PuestoEntity puesto;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_plaza")
	private PlazaEntity plaza;

	public Integer getIdOrganigrama() {
		return idOrganigrama;
	}

	public void setIdOrganigrama(Integer idOrganigrama) {
		this.idOrganigrama = idOrganigrama;
	}

	public OrganigramaEntity getPadre() {
		return padre;
	}

	public void setPadre(OrganigramaEntity padre) {
		this.padre = padre;
	}

	public String getIndice() {
		return indice;
	}

	public void setIndice(String indice) {
		this.indice = indice;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(Integer idTipo) {
		this.idTipo = idTipo;
	}

	public Integer getNivel() {
		return nivel;
	}

	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}

	public Integer getNumeroIndice() {
		return numeroIndice;
	}

	public void setNumeroIndice(Integer numeroIndice) {
		this.numeroIndice = numeroIndice;
	}

	public UnidadEntity getUnidad() {
		return unidad;
	}

	public void setUnidad(UnidadEntity unidad) {
		this.unidad = unidad;
	}

	public PuestoEntity getPuesto() {
		return puesto;
	}

	public void setPuesto(PuestoEntity puesto) {
		this.puesto = puesto;
	}

	public PlazaEntity getPlaza() {
		return plaza;
	}

	public void setPlaza(PlazaEntity plaza) {
		this.plaza = plaza;
	}
	
	
}