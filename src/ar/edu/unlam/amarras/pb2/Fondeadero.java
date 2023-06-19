package ar.edu.unlam.amarras.pb2;

import java.util.ArrayList;

public class Fondeadero {
	private Integer cantidadMaxAmarras;
	private ArrayList<Yate> amarrados = new ArrayList<Yate>();

	public Fondeadero(Integer cantidadMaxAmarras) {
		this.cantidadMaxAmarras = cantidadMaxAmarras;
	}

	public Integer getCantidadDeAmarras() {
		return this.cantidadMaxAmarras;
	}

	public Boolean amarrarYate(Yate yate) throws NoHayAmarrasDisponiblesException {
		if (amarrados.size() < cantidadMaxAmarras) {
			return amarrados.add(yate);
		}
		throw new NoHayAmarrasDisponiblesException();
	}

	public void desamarrarYate(Yate yate) {
		this.amarrados.remove(yate);

	}

	public Integer getCantidadDeAmarrasOcupadas() {
		return this.amarrados.size();
	}

	public Integer getCantidadDeAmarrasLibres() {
		Integer libres = cantidadMaxAmarras - getCantidadDeAmarrasOcupadas();
		return libres;
	}

	public Double getPrecioAmarre(Yate yate) {
		Double precioYate = calcularPrecioYate(yate);
		Double precioEslora = calcularPrecioEslora(yate);

		return precioYate + precioEslora;

	}

	private Double calcularPrecioEslora(Yate yate) {
		if (yate.getEslora() <= 20) {
			return 2000.0;
		}
		return 3000.0;
	}

	private Double calcularPrecioYate(Yate yate) {
		if (yate instanceof Motor) {
			return 10000.0;
		}
		return 9000.0;
	}

	public Double getRecaudacionTotal() {
		Double total = 0.0;

		for (Yate y : amarrados) {
			total += getPrecioAmarre(y);
		}
		
		return total;
	}

}
