package www.unlam.edu.ar;

public class CuentaGanado {
	
	private Integer cantidad=0;
	
	public void Contar() {
		cantidad=cantidad+1;
	}
		
	public Integer mostrarCantidad() {
		return cantidad;
	}
	
	public void resetearCuenta() {
		cantidad=0;
	}
	
	public Integer inicializarContador() {
		return cantidad = 0;
	}
}