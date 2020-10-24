package ejercicio;

public class Arma {

	private int codigo;
	private String descripcion;

	public Arma(int codigo, String descripcion) {
		this.codigo = codigo;
		this.descripcion = descripcion;
	}

	public int getCodigo() {
		return codigo;
	}

	@Override
	public String toString() {
		return "Código=" + codigo + ", Descripción=" + descripcion + "\n";
	}

}
