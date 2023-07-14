package cimap.recursos_humanos.persistence.personal;

import java.io.Serializable;
import java.util.Date;

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
@Table(name="empleado_puesto",schema = "recursos_humanos")
public class EmpleadoPuestoEntity implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5024927960007273354L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_empleado_puesto")
	private Integer idEmpleadoPuesto;
	
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_empleado")
	private EmpleadoEntity empleado;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_puesto")
	private PuestoEntity puesto;
	
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_unidad")
	private UnidadEntity unidad;
	
	@Column(name="descripcion_firma")
	private String descripcionFirma;
	
	@Column(name="fecha_inicio")
	private Date fechaInicio;

	@Column(name="fecha_fin")
	private Date fechFin;

	public Integer getIdEmpleadoPuesto() {
		return idEmpleadoPuesto;
	}


	public void setIdEmpleadoPuesto(Integer idEmpleadoPuesto) {
		this.idEmpleadoPuesto = idEmpleadoPuesto;
	}


	public EmpleadoEntity getEmpleado() {
		return empleado;
	}


	public void setEmpleado(EmpleadoEntity empleado) {
		this.empleado = empleado;
	}


	public PuestoEntity getPuesto() {
		return puesto;
	}


	public void setPuesto(PuestoEntity puesto) {
		this.puesto = puesto;
	}


	public UnidadEntity getUnidad() {
		return unidad;
	}


	public void setUnidad(UnidadEntity unidad) {
		this.unidad = unidad;
	}


	public String getDescripcionFirma() {
		return descripcionFirma;
	}


	public void setDescripcionFirma(String descripcionFirma) {
		this.descripcionFirma = descripcionFirma;
	}


	public Date getFechaInicio() {
		return fechaInicio;
	}


	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}


	public Date getFechFin() {
		return fechFin;
	}


	public void setFechFin(Date fechFin) {
		this.fechFin = fechFin;
	}


	@Override
	public String toString() {
		return "EmpleadoPuestoEntity [idEmpleadoPuesto=" + idEmpleadoPuesto + ", empleado=" + empleado + ", puesto="
				+ puesto + ", unidad=" + unidad + ", descripcionFirma=" + descripcionFirma + ", fechaInicio="
				+ fechaInicio + ", fechFin=" + fechFin + "]";
	}

	
}
