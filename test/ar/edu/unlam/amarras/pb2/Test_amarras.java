package ar.edu.unlam.amarras.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_amarras {

	@Test
	public void queSeCreeElFondeadero() {
		Fondeadero fondeadero = new Fondeadero(70);
		Integer obtenido = fondeadero.getCantidadDeAmarras();
		Integer deseado = 70;

		assertEquals(obtenido, deseado);
	}

	@Test
	public void queSePuedaAmarrarUnYate() throws NoHayAmarrasDisponiblesException {
		Fondeadero fondeadero = new Fondeadero(70);
		Yate motor = new Motor("AZ1", "Adrés Borgeat", 18.87, 5.15, 119.0, 37, 5500.0, 5959.0,
				"2 × motores diésel MAN RK2805", 9000, 23, 6500);

		assertTrue(fondeadero.amarrarYate(motor));

	}

	@Test(expected = NoHayAmarrasDisponiblesException.class)
	public void queSeNoPuedaAmarrarUnYateSiNoHayAmarras() throws NoHayAmarrasDisponiblesException {
		Fondeadero fondeadero = new Fondeadero(1);
		Yate motor = new Motor("AZ1", "Adrés Borgeat", 18.87, 5.15, 119.0, 37, 5500.0, 5959.0,
				"2 × motores diésel MAN RK2805", 9000, 23, 6500);

		Yate vela = new Vela("XXR", "Sebastian Pardo", 6.90, 2.7, 13.45, 5, 1400.0, 21.5, 85.0, 133.0);

		fondeadero.amarrarYate(motor);
		fondeadero.amarrarYate(vela);
	}

	@Test
	public void queSePuedaObtenerLaCantidadDeAmarrasOcupadas() throws NoHayAmarrasDisponiblesException {
		Fondeadero fondeadero = new Fondeadero(70);
		Yate motor = new Motor("AZ1", "Adrés Borgeat", 18.87, 5.15, 119.0, 37, 5500.0, 5959.0,
				"2 × motores diésel MAN RK2805", 9000, 23, 6500);

		fondeadero.amarrarYate(motor);

		assertEquals((Integer) 1, fondeadero.getCantidadDeAmarrasOcupadas());

	}

	@Test
	public void queSePuedaDesamarrarUnYate() throws NoHayAmarrasDisponiblesException {
		Fondeadero fondeadero = new Fondeadero(70);
		Yate motor = new Motor("AZ1", "Adrés Borgeat", 18.87, 5.15, 119.0, 37, 5500.0, 5959.0,
				"2 × motores diésel MAN RK2805", 9000, 23, 6500);

		fondeadero.amarrarYate(motor);
		assertEquals((Integer) 1, fondeadero.getCantidadDeAmarrasOcupadas());
		
		fondeadero.desamarrarYate(motor);
		assertEquals((Integer) 0, fondeadero.getCantidadDeAmarrasOcupadas());
	}

	@Test
	public void queSePuedaObtenerLaCantidadDeAmarrasLibres() throws NoHayAmarrasDisponiblesException {
		Fondeadero fondeadero = new Fondeadero(70);
		Yate motor = new Motor("AZ1", "Adrés Borgeat", 18.87, 5.15, 119.0, 37, 5500.0, 5959.0,
				"2 × motores diésel MAN RK2805", 9000, 23, 6500);

		fondeadero.amarrarYate(motor);

		assertEquals((Integer) 69, fondeadero.getCantidadDeAmarrasLibres());

	}

	@Test
	public void queSePuedaObtenerElPrecioDeAmarreParaYateMotor() throws NoHayAmarrasDisponiblesException {
		Fondeadero fondeadero = new Fondeadero(70);
		Yate motor = new Motor("AZ1", "Adrés Borgeat", 18.87, 5.15, 119.0, 37, 5500.0, 5959.0,
				"2 × motores diésel MAN RK2805", 9000, 23, 6500);

		Double obtenido = fondeadero.getPrecioAmarre(motor);
		Double esperado = 13000.0;

		assertEquals(esperado, obtenido);

	}

	@Test
	public void queSePuedaObtenerElPrecioDeAmarreParaYateVela() throws NoHayAmarrasDisponiblesException {
		Fondeadero fondeadero = new Fondeadero(70);
		Yate vela = new Vela("XXR", "Sebastian Pardo", 6.90, 2.7, 13.45, 5, 1400.0, 21.5, 85.0, 133.0);

		Double obtenido = fondeadero.getPrecioAmarre(vela);
		Double esperado = 11000.0;

		assertEquals(esperado, obtenido);

	}

	@Test
	public void queSePuedaObtenerLaRecaudacionTotal() throws NoHayAmarrasDisponiblesException {
		Fondeadero fondeadero = new Fondeadero(70);
		Yate vela = new Vela("XXR", "Sebastian Pardo", 6.90, 2.7, 13.45, 5, 1400.0, 21.5, 85.0, 133.0);
		Yate motor = new Motor("AZ1", "Adrés Borgeat", 18.87, 5.15, 119.0, 37, 5500.0, 5959.0,
				"2 × motores diésel MAN RK2805", 9000, 23, 6500);

		fondeadero.amarrarYate(vela);
		fondeadero.amarrarYate(motor);

		Double obtenido = fondeadero.getRecaudacionTotal();
		Double esperado = 24000.0;

		assertEquals(esperado, obtenido);

	}

}
