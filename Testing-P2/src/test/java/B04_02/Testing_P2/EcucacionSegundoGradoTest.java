package B04_02.Testing_P2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EcucacionSegundoGradoTest {

	@Test
	public void testCalcularRaicesConDiscriminantePositivo() throws Exception {
		EcuacionSegundoGrado ecuacion = new EcuacionSegundoGrado();
		double a = 1;
		double b = 1;
		double c = -6;

		double[] raices = ecuacion.calcularRaices(a, b, c);
		// Estos valores deben de tener dos resultados (El 2 y el -3)
		assertEquals(2.0, raices[0], 0.001);
		assertEquals(-3.0, raices[1], 0.001);
	}

	@Test
	public void testCalcularRaicesConDiscriminanteCero() throws Exception {
		EcuacionSegundoGrado ecuacion = new EcuacionSegundoGrado();
		double a = 1;
		double b = -4;
		double c = 4;

		double[] raices = ecuacion.calcularRaices(a, b, c);
		// Estos valores solo deben de tener un resultado (El 2)
		assertEquals(2.0, raices[0], 0.001);
	}

	@Test(expected = Exception.class) // Para indicar que se espera que se lance una excepcion
	public void testCalcularRaicesConDiscriminanteNegativo() throws Exception {
		EcuacionSegundoGrado ecuacion = new EcuacionSegundoGrado();
		double a = 2;
		double b = 3;
		double c = 2;
		// Estos valores solo pueden tener valores imaginarios
		double[] raices = ecuacion.calcularRaices(a, b, c);
	}
	
	@Test
	public void testCalcularRaicesConDiscriminantePositivoMCDC() throws Exception {
		EcuacionSegundoGrado ecuacion = new EcuacionSegundoGrado();
		double a = 2;
		double b = 6;
		double c = 4;

		double[] raices = ecuacion.calcularRaices(a, b, c);
		// Estos valores deben de tener dos resultados (El 2 y el -3)
		assertEquals(-1.0, raices[0], 0.001);
		assertEquals(-2.0, raices[1], 0.001);
	}

	@Test
	public void testCalcularRaicesConDiscriminanteCeroMCDC() throws Exception {
		EcuacionSegundoGrado ecuacion = new EcuacionSegundoGrado();
		double a = 2.25;
		double b = 6;
		double c = 4;

		double[] raices = ecuacion.calcularRaices(a, b, c);
		// Estos valores solo deben de tener un resultado (El 2)
		assertEquals(-1.3333, raices[0], 0.001);
	}

	@Test(expected = Exception.class) // Para indicar que se espera que se lance una excepcion
	public void testCalcularRaicesConDiscriminanteNegativoMCDC() throws Exception {
		EcuacionSegundoGrado ecuacion = new EcuacionSegundoGrado();
		double a = 3;
		double b = 6;
		double c = 4;
		// Estos valores solo pueden tener valores imaginarios
		double[] raices = ecuacion.calcularRaices(a, b, c);
	}
	
	@Test
	public void testCalcularRaicesValores0() throws Exception{
		EcuacionSegundoGrado ecuacion = new EcuacionSegundoGrado();
		double a = 0;
		double b = 0;
		double c = 0;
		double[] raices = ecuacion.calcularRaices(a, b, c);
		assertTrue(Double.isNaN(raices[0]));
	}
	
	@Test(expected = Exception.class)
	public void testCalcularRaicesValores1() throws Exception {
		EcuacionSegundoGrado ecuacion = new EcuacionSegundoGrado();
		double a = 1;
		double b = 1;
		double c = 1;

		double[] raices = ecuacion.calcularRaices(a, b, c);
	}
	
	@Test(expected = Exception.class)
	public void testCalcularRaicesValoresMenos1() throws Exception {
		EcuacionSegundoGrado ecuacion = new EcuacionSegundoGrado();
		double a = -1;
		double b = -1;
		double c = -1;

		double[] raices = ecuacion.calcularRaices(a, b, c);
	}
	
	@Test(expected = Exception.class)
	public void testCalcularRaicesValoresMenos500000() throws Exception {
		EcuacionSegundoGrado ecuacion = new EcuacionSegundoGrado();
		double a = -500000;
		double b = -500000;
		double c = -500000;

		double[] raices = ecuacion.calcularRaices(a, b, c);
	}
	
	@Test(expected = Exception.class)
	public void testCalcularRaicesValores500000() throws Exception {
		EcuacionSegundoGrado ecuacion = new EcuacionSegundoGrado();
		double a = 500000;
		double b = 500000;
		double c = 500000;

		double[] raices = ecuacion.calcularRaices(a, b, c);
	}
	
	@Test(expected = Exception.class)
	public void testCalcularRaicesValoresLimitePositivo() throws Exception {
		EcuacionSegundoGrado ecuacion = new EcuacionSegundoGrado();
		double a = Math.pow(1.79, 308) + 1;
		double b = Math.pow(1.79, 308) + 1;
		double c = Math.pow(1.79, 308) + 1;

		double[] raices = ecuacion.calcularRaices(a, b, c);
	}
	
	@Test(expected = Exception.class)
	public void testCalcularRaicesValoresLimiteNegatico() throws Exception {
		EcuacionSegundoGrado ecuacion = new EcuacionSegundoGrado();
		double a = Math.pow(-1.79, 308) - 1;
		double b = Math.pow(-1.79, 308) - 1;
		double c = Math.pow(-1.79, 308) - 1;

		double[] raices = ecuacion.calcularRaices(a, b, c);
	}
}
