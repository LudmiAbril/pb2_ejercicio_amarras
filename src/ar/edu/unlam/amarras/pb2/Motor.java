package ar.edu.unlam.amarras.pb2;

public class Motor extends Yate {
	private Double Desplazamiento;
	private String Propulsión;
	private Integer Potencia;
	private Integer Velocidad;
	private Integer Autonomía;

	public Motor(String nombre, String dueño, Double manga, Double calado, Double eslora, Integer tripulación,
			Double peso, Double desplazamiento, String propulsión, Integer potencia, Integer velocidad,
			Integer autonomía) {
		super(nombre, dueño, manga, calado, eslora, tripulación, peso);
		Desplazamiento = desplazamiento;
		Propulsión = propulsión;
		Potencia = potencia;
		Velocidad = velocidad;
		Autonomía = autonomía;
	}

	public Double getDesplazamiento() {
		return Desplazamiento;
	}

	public String getPropulsión() {
		return Propulsión;
	}

	public Integer getPotencia() {
		return Potencia;
	}

	public Integer getVelocidad() {
		return Velocidad;
	}

	public Integer getAutonomía() {
		return Autonomía;
	}
	
	

}
