package ejercicio;

import java.util.ArrayList;

public class Comisaria {

	String nombre;
	ArrayList<Policia> p;
	ArrayList<Arma> a;

	Comisaria(String n) {
		nombre = n;
		p = new ArrayList<Policia>();
		a = new ArrayList<Arma>();
	}

	public void setPolicia(Policia p) {
		this.p.add(p);
	}

	public void setArma(Arma a) {
		this.a.add(a);
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {

		String c = "Los policias son \n";
		for (int i = 0; i < p.size(); i++) {
			c += p.get(i) + "\n";
		}
		c += "Las armas son \n";
		for (int i = 0; i < a.size(); i++) {
			c += a.get(i) + "\n";

		}
		return c;
	}

}
