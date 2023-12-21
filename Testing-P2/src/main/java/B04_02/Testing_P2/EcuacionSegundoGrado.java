package B04_02.Testing_P2;

public class EcuacionSegundoGrado {
	public double[] calcularRaices(double a, double b, double c) throws Exception {
		double discriminante = b * b - 4 * a * c;
		if (discriminante > 0) {
			double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
			double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
			return new double[] { x1, x2 };
		} else if (discriminante == 0) {
			double x = -b / (2 * a);
			return new double[] { x };
		} else {
			throw new Exception("La ecuacion no tiene raices reales.");
		}
	}
}
