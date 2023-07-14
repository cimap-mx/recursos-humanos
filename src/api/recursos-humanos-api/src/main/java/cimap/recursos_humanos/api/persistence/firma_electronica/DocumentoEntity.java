package cimap.recursos_humanos.api.persistence.firma_electronica;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "documento", schema = "firma_electronica")
public class DocumentoEntity {

	@Id
	@Column(name = "idDocumento")
	private Long idDocumento;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_organismo")
	private OrganismoEntity organismo;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "hash")
	private String hash;
	
	@Column(name = "fecha_documento")
	private Date fechaDocumento;
	
	@Column(name = "fecha_hora_documento")
	private Date fechaHoraDocumento;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_estatus")
	private EstatusDocumentoEntity estatus;

	public Long getIdDocumento() {
		return idDocumento;
	}

	public void setIdDocumento(Long idDocumento) {
		this.idDocumento = idDocumento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public Date getFechaDocumento() {
		return fechaDocumento;
	}

	public void setFechaDocumento(Date fechaDocumento) {
		this.fechaDocumento = fechaDocumento;
	}

	public Date getFechaHoraDocumento() {
		return fechaHoraDocumento;
	}

	public void setFechaHoraDocumento(Date fechaHoraDocumento) {
		this.fechaHoraDocumento = fechaHoraDocumento;
	}

	public EstatusDocumentoEntity getEstatus() {
		return estatus;
	}

	public void setEstatus(EstatusDocumentoEntity estatus) {
		this.estatus = estatus;
	}
	
	

}
