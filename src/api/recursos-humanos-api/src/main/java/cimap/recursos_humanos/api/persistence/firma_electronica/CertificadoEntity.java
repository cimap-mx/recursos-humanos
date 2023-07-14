package cimap.recursos_humanos.api.persistence.firma_electronica;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "certificado", schema = "firma_electronica")
public class CertificadoEntity {

	
	@Id
	@Column(name = "id_certificado")
	private Long idCertificado;
	
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_autoridad_certificadora")
	private AutoridadCertificadoraEntity autoridadCertificadora;


	public Long getIdCertificado() {
		return idCertificado;
	}


	public void setIdCertificado(Long idCertificado) {
		this.idCertificado = idCertificado;
	}


	public AutoridadCertificadoraEntity getAutoridadCertificadora() {
		return autoridadCertificadora;
	}


	public void setAutoridadCertificadora(AutoridadCertificadoraEntity autoridadCertificadora) {
		this.autoridadCertificadora = autoridadCertificadora;
	}
	
	
}
