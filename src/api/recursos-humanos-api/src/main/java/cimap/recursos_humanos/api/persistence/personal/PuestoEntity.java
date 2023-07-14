package cimap.recursos_humanos.api.persistence.personal;

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
@Table(name="puesto", schema = "personal")
public class PuestoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_puesto")
	private Integer idPuesto;	
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "base")
	private Integer base;
	
	@Column(name = "eventuales")
	private Integer eventuales;	
	
	@Column(name="plazas")
	private Integer plazas;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_unidad")
	private UnidadEntity unidad;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_organigrama")
	private OrganigramaEntity organigrama;
	
	@Column(name="responsable")
	private Boolean responsable;

	public Integer getIdPuesto() {
		return idPuesto;
	}

	public void setIdPuesto(Integer idPuesto) {
		this.idPuesto = idPuesto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getBase() {
		return base;
	}

	public void setBase(Integer base) {
		this.base = base;
	}

	public Integer getEventuales() {
		return eventuales;
	}

	public void setEventuales(Integer eventuales) {
		this.eventuales = eventuales;
	}

	public Integer getPlazas() {
		return plazas;
	}

	public void setPlazas(Integer plazas) {
		this.plazas = plazas;
	}

	public UnidadEntity getUnidad() {
		return unidad;
	}

	public void setUnidad(UnidadEntity unidad) {
		this.unidad = unidad;
	}

	public OrganigramaEntity getOrganigrama() {
		return organigrama;
	}

	public void setOrganigrama(OrganigramaEntity organigrama) {
		this.organigrama = organigrama;
	}

	public Boolean getResponsable() {
		return responsable;
	}

	public void setResponsable(Boolean responsable) {
		this.responsable = responsable;
	}
	
	
}
