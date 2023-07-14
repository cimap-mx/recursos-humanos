package cimap.recursos_humanos.api.service.personal.puestos;

public class PuestoRequest {
	
	private Integer idUnidad;
	
	private Integer idJerarquia;
	
	private String nombre;
	
	private Integer numero;
	
	private Boolean responsable;
	
	private Integer plazas;

	public Integer getIdUnidad() {
		return idUnidad;
	}

	public void setIdUnidad(Integer idUnidad) {
		this.idUnidad = idUnidad;
	}

	public Integer getIdJerarquia() {
		return idJerarquia;
	}

	public void setIdJerarquia(Integer idJerarquia) {
		this.idJerarquia = idJerarquia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Boolean getResponsable() {
		return responsable;
	}

	public void setResponsable(Boolean responsable) {
		this.responsable = responsable;
	}

	public Integer getPlazas() {
		return plazas;
	}

	public void setPlazas(Integer plazas) {
		this.plazas = plazas;
	}

	
}
