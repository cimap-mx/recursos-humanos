package cimap.recursos_humanos.api.persistence.firma_electronica;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import cimap.recursos_humanos.api.persistence.archivos.ArchivoEntity;

@Entity
@Table(name = "archivo_firma", schema = "firma_electronica")
public class ArchivoDocumentoEntity {

	
	@Id
	@Column(name = "id_archivo")
	private Long idArchivo;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_documento")
	private DocumentoEntity documento;
	
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_tipo_archivo")
	private TipoArchivoEntity tipoArchivo;


	public Long getIdArchivo() {
		return idArchivo;
	}


	public void setIdArchivo(Long idArchivo) {
		this.idArchivo = idArchivo;
	}


	public DocumentoEntity getDocumento() {
		return documento;
	}


	public void setDocumento(DocumentoEntity documento) {
		this.documento = documento;
	}


	public TipoArchivoEntity getTipoArchivo() {
		return tipoArchivo;
	}


	public void setTipoArchivo(TipoArchivoEntity tipoArchivo) {
		this.tipoArchivo = tipoArchivo;
	}
	
	
	
}
