package cimap.recursos_humanos.api.persistence.personal;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sector", schema = "recursos_humanos")
public class SectorEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2492353144792271726L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_sector")
	private Integer id;
	
	@Column(name="sector")
	private String sector;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}
	
	
	
}
