package cimap.recursos_humanos.persistence.personal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="responsable_unidad", schema = "personal")
public class ResponsableUnidadEntity {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_responsable_unidad")
	private Integer id_responsable_unidad;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_empleado")
	private EmpleadoEntity empleado;
	
	
}
