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
import java.sql.Date;

@Entity
@Table(name="configuracion_unidad", schema = "recursos_humanos")
public class ConfiguracionUnidadEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_configuracion_unidad")
	private Integer idConfiguracionUnidad;
	
	@Column(name="nivel_presupuestal")
	private Integer nivelPresupuestal;
	
	@Column(name="nivel1")
	private String nivel1;
	
	@Column(name="nivel2")
	private String nivel2;
	
	@Column(name="nivel3")
	private String nivel3;
	
	@Column(name="nivel4")
	private String nivel4;
	
	@Column(name="nivel5")
	private String nivel5;
	
	@Column(name="ejercicio_inicial")
	private Integer ejercicioInicial;
	
	@Column(name="ejercicio_final")
	private Integer ejercicioFinal;

	public Integer getIdConfiguracionUnidad() {
		return idConfiguracionUnidad;
	}

	public void setIdConfiguracionUnidad(Integer idConfiguracionUnidad) {
		this.idConfiguracionUnidad = idConfiguracionUnidad;
	}

	public Integer getNivelPresupuestal() {
		return nivelPresupuestal;
	}

	public void setNivelPresupuestal(Integer nivelPresupuestal) {
		this.nivelPresupuestal = nivelPresupuestal;
	}

	public String getNivel1() {
		return nivel1;
	}

	public void setNivel1(String nivel1) {
		this.nivel1 = nivel1;
	}

	public String getNivel2() {
		return nivel2;
	}

	public void setNivel2(String nivel2) {
		this.nivel2 = nivel2;
	}

	public String getNivel3() {
		return nivel3;
	}

	public void setNivel3(String nivel3) {
		this.nivel3 = nivel3;
	}
	
	public String getNivel4() {
		return nivel4;
	}

	public void setNivel4(String nivel4) {
		this.nivel4 = nivel4;
	}

	public String getNivel5() {
		return nivel5;
	}

	public void setNivel5(String nivel5) {
		this.nivel5 = nivel5;
	}

	public Integer getEjercicioInicial() {
		return ejercicioInicial;
	}

	public void setEjercicioInicial(Integer ejercicioInicial) {
		this.ejercicioInicial = ejercicioInicial;
	}

	public Integer getEjercicioFinal() {
		return ejercicioFinal;
	}

	public void setEjercicioFinal(Integer ejercicioFinal) {
		this.ejercicioFinal = ejercicioFinal;
	}
	
}
