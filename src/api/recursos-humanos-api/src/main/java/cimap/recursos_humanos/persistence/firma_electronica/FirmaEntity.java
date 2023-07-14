package cimap.recursos_humanos.persistence.firma_electronica;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "firma", schema = "firma_electronica")
public class FirmaEntity {

	@Id
	@Column(name = "id_firma")
	private Long idFirma;	

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_documento")
	private DocumentoEntity documento;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_identificacion")
	private IdentificacionEntity identificacion;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_certificado")
	private CertificadoEntity certificado;
	
	@Column(name = "fecha_firma")
	private Date fechaFirma;
	
	@Column(name = "fecha_hora_firma")
	private Date fechaHoraFirma;	
		
	@Column(name = "unidad")
	private String unidad;	
	
	@Column(name = "cargo")
	private String cargo;	
		
	@Column(name = "funcion")
	private String funcion;
	
	@Column(name = "cadena_original")
	private String cadenaOriginal;
	
	@Column(name = "selloDigital")
	private String selloDigital;
}
