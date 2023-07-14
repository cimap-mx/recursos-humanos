package cimap.recursos_humanos.api.service.personal.organigrama;

public class Organigrama {

	
	private Integer idOrganigrama;
	
	private String clave;
	
	private String nombre;
	
	private Integer idPadre;
	
	private Integer plazas;
	
	private String responsable;
	
	private String encargado;

	public Integer getIdOrganigrama() {
		return idOrganigrama;
	}

	public void setIdOrganigrama(Integer idOrganigrama) {
		this.idOrganigrama = idOrganigrama;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getIdPadre() {
		return idPadre;
	}

	public void setIdPadre(Integer idPadre) {
		this.idPadre = idPadre;
	}

	public Integer getPlazas() {
		return plazas;
	}

	public void setPlazas(Integer plazas) {
		this.plazas = plazas;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

	public String getEncargado() {
		return encargado;
	}

	public void setEncargado(String encargado) {
		this.encargado = encargado;
	}

	
	
}
