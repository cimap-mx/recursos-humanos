package cimap.recursos_humanos.api.persistence.firma_electronica;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "identificacion", schema = "firma_electronica")
public class IdentificacionEntity {

	
	@Id
	@Column(name = "id_identificacion")
	private Integer idIdentificacion;
	
	@Column(name = "nombre")
	private String nombre;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_certificado")
	private CertificadoEntity certificado;

	
}
