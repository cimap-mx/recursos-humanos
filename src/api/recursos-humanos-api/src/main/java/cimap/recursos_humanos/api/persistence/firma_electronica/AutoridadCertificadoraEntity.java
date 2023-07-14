package cimap.recursos_humanos.api.persistence.firma_electronica;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "autoridad_certificadora", schema = "firma_electronica")
public class AutoridadCertificadoraEntity {

	
	@Id
	@Column(name = "id_autoridad_certificadora")
	private Integer idAutoridadCertificadora;
	
	@Column(name = "nombre")
	private String nombre;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_certificado")
	private CertificadoEntity certificado;

	public Integer getIdAutoridadCertificadora() {
		return idAutoridadCertificadora;
	}

	public void setIdAutoridadCertificadora(Integer idAutoridadCertificadora) {
		this.idAutoridadCertificadora = idAutoridadCertificadora;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public CertificadoEntity getCertificado() {
		return certificado;
	}

	public void setCertificado(CertificadoEntity certificado) {
		this.certificado = certificado;
	}

	
	
}
