package ejercicio;

public class Policia {

	private long cedula;
	private String nombre;
	private String funcion;
	private String nivel;

	public Policia(long cedula, String nombre, String funcion, String nivel) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.funcion = funcion;
		this.nivel = nivel;
	}

	public long getCedula() {
		return cedula;
	}

	@Override
	public String toString() {
		return "Cédula=" + cedula + ", Nombre=" + nombre + ", Función=" + funcion + ", Nivel ejecutivo=" + nivel + "\n";
	}

}
