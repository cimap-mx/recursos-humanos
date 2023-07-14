package cimap.recursos_humanos.api.persistence.admin.seguridad;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sesion", schema = "recursos_humanos")
public class SesionEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8210334471214184570L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "id_Usuario")
	private int idUsuario;

	@Column(name = "token")
	private String token;

	@Column(name = "fecha_creacion")
	private Date fechaCreacion;

	@Column(name = "fecha_vencimiento")
	private Date fechaVencimiento;

	@Column(name = "ip")
	private String ip;

	@Column(name = "version_plataforma")
	private String versionPlataforma;

	@Column(name = "plataforma")
	private PlataformaEnum plataforma;
	
	@Column(name = "tipo_inicio")
	private TipoInicioEnum tipoInicio;


	@Column(name = "ejercicio")
	private int ejercicio;

	@Column(name = "estado")
	private SesionEstatusEnum estado;

	
	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getVersionPlataforma() {
		return versionPlataforma;
	}

	public void setVersionPlataforma(String versionPlataforma) {
		this.versionPlataforma = versionPlataforma;
	}

	public PlataformaEnum getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(PlataformaEnum plataforma) {
		this.plataforma = plataforma;
	}

	public SesionEstatusEnum getEstado() {
		return estado;
	}

	public void setEstado(SesionEstatusEnum estado) {
		this.estado = estado;
	}

	public int getEjercicio() {
		return ejercicio;
	}

	public void setEjercicio(int ejercicio) {
		this.ejercicio = ejercicio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public TipoInicioEnum getTipoInicio() {
		return tipoInicio;
	}

	public void setTipoInicio(TipoInicioEnum tipoInicio) {
		this.tipoInicio = tipoInicio;
	}

		
	

	
	
}
