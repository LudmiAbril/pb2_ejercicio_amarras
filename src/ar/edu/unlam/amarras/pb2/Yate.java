package ar.edu.unlam.amarras.pb2;

public class Yate {
	private String Nombre;
	private String Dueño;
	private Double Manga;
	private Double Calado;
	private Double Eslora;
	private Integer Tripulación;
	private Double Peso;

	public Yate(String nombre, String dueño, Double manga, Double calado, Double eslora, Integer tripulación,
			Double peso) {
		Nombre = nombre;
		Dueño = dueño;
		Manga = manga;
		Calado = calado;
		Eslora = eslora;
		Tripulación = tripulación;
		Peso = peso;
	}

	public String getNombre() {
		return Nombre;
	}

	public String getDueño() {
		return Dueño;
	}

	public Double getManga() {
		return Manga;
	}

	public Double getCalado() {
		return Calado;
	}

	public Double getEslora() {
		return Eslora;
	}

	public Integer getTripulación() {
		return Tripulación;
	}

	public Double getPeso() {
		return Peso;
	}
	
	

}
