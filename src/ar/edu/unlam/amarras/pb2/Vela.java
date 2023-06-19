package ar.edu.unlam.amarras.pb2;

public class Vela extends Yate {
	private Double Altura_mástil;
	private Double Superficie_Vélica_Mayor;
	private Double Superficie_total;
	
	public Vela(String nombre, String dueño, Double manga, Double calado, Double eslora, Integer tripulación,
			Double peso, Double altura_mástil, Double superficie_Vélica_Mayor, Double superficie_total) {
		super(nombre, dueño, manga, calado, eslora, tripulación, peso);
		Altura_mástil = altura_mástil;
		Superficie_Vélica_Mayor = superficie_Vélica_Mayor;
		Superficie_total = superficie_total;
	}

	public Double getAltura_mástil() {
		return Altura_mástil;
	}

	public Double getSuperficie_Vélica_Mayor() {
		return Superficie_Vélica_Mayor;
	}

	public Double getSuperficie_total() {
		return Superficie_total;
	}
	
	
	
}
