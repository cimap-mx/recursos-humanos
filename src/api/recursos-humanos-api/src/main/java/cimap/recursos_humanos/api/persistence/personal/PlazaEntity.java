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
@Table(name="plaza", schema = "personal")
public class PlazaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_plaza")
	private Integer idPlaza;	
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_puesto")
	private PuestoEntity puesto;	
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_organigrama")
	private OrganigramaEntity organigrama;	
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_empleado")
	private EmpleadoEntity empleado;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_tipo_asignacion")
	private TipoAsignacionEntity tipoAsignacion;	
	
	@Column(name="cargo")
	private String cargo;
	
	@Column(name="titular")
	private Boolean titular;
	
	@Column(name="activo")
	private Boolean activo;

	public Integer getIdPlaza() {
		return idPlaza;
	}

	public void setIdPlaza(Integer idPlaza) {
		this.idPlaza = idPlaza;
	}

	public PuestoEntity getPuesto() {
		return puesto;
	}

	public void setPuesto(PuestoEntity puesto) {
		this.puesto = puesto;
	}

	public OrganigramaEntity getOrganigrama() {
		return organigrama;
	}

	public void setOrganigrama(OrganigramaEntity organigrama) {
		this.organigrama = organigrama;
	}

	public EmpleadoEntity getEmpleado() {
		return empleado;
	}

	public void setEmpleado(EmpleadoEntity empleado) {
		this.empleado = empleado;
	}

	public TipoAsignacionEntity getTipoAsignacion() {
		return tipoAsignacion;
	}

	public void setTipoAsignacion(TipoAsignacionEntity tipoAsignacion) {
		this.tipoAsignacion = tipoAsignacion;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Boolean getTitular() {
		return titular;
	}

	public void setTitular(Boolean titular) {
		this.titular = titular;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
	
	
	
}
