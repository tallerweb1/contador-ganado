package www.unlam.edu.ar;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import www.unlam.edu.ar.CuentaGanado;

public class ContadorDeGanadoTest {

	@Test
	public void testQuePuedaContar() {
		CuentaGanado miContador = new CuentaGanado();
		Integer cantidadEsperada = 1;
		
		miContador.Contar();
		Integer cantidadObtenida = miContador.mostrarCantidad();
		
		miContador = null;
	}
	
	@Test
	public void testQuePuedaAlCrearloMuestre() {
		CuentaGanado miContador = new CuentaGanado();
		Integer cantidadEsperada = 1;
		
		miContador.Contar();
		Integer cantidadObtenida = miContador.mostrarCantidad();

		assertEquals(cantidadEsperada, cantidadObtenida);
	}
	
	@Test
	public void testQuePuedaAlCrearloMuestreCero() {
		CuentaGanado miContador = new CuentaGanado();
		Integer cantidadEsperada = 0;
		
		Integer cantidadObtenida = miContador.mostrarCantidad();

		assertEquals(cantidadEsperada, cantidadObtenida);
		
	}
	
	@Test
	public void testQuePuedaAlCrearloResetearlo() {
		CuentaGanado miContador = new CuentaGanado();
		Integer cantidadEsperada = 0;
		
		miContador.Contar(); // +1 a la cantidad
		Integer cantidadObtenida = miContador.mostrarCantidad();
		
		cantidadObtenida = miContador.inicializarContador(); // pone en 0 la cantidad
		
		assertEquals(cantidadEsperada, cantidadObtenida);
		
	}
	

	

}