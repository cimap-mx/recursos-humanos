package cimap.recursos_humanos.persistence.firma_electronica;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "organismo", schema = "firma_electronica")
public class OrganismoEntity {

	
	@Id
	@Column(name = "id_organismo")
	private Integer idOrganismo;
	
	@Column(name = "nombre")
	private String nombre;

	public Integer getIdOrganismo() {
		return idOrganismo;
	}

	public void setIdOrganismo(Integer idOrganismo) {
		this.idOrganismo = idOrganismo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
