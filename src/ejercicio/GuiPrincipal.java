package ejercicio;
/*
 * Se desea diseñar un programa para almacenar la información de funcionamiento de las comisarías de una región.
 * 
 *  En cada comisaría trabaja una serie de polic�as que tienen una cédula, nombre, función y nivel ejecutivo.
 *  Cada comisaría cuenta con un arsenal de armas. Cada arma está identificada por un código único, y una descripción.
 *  Implemente las clases de objetos y las interfaces gráficas de usuario necesarias.
 * 
 * */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class GuiPrincipal extends JFrame {

	JMenuBar barra;
	JMenu registros, informes;
	JMenuItem registrarpolicia, registrararma, registrarcomisaria, vincularpolicia, asignararma, listarcomisarias;
	ArrayList<Comisaria> comisarias = new ArrayList<Comisaria>();

	public GuiPrincipal() {
		FlowLayout F = new FlowLayout();
		F.setAlignment(0);
		setLayout(F);

		barra = new JMenuBar();
		add(barra);

		registros = new JMenu("Registros");
		barra.add(registros);

		informes = new JMenu("Informes");
		barra.add(informes);

		registrarpolicia = new JMenuItem("Registrar Policía");
		registros.add(registrarpolicia);
		registrarpolicia.addActionListener(new AccionRegistrarPolica());

		registrararma = new JMenuItem("Registrar arma");
		registros.add(registrararma);
		registrararma.addActionListener(new AccionRegistrarArma());

		registrarcomisaria = new JMenuItem("Registrar comisar�a");
		registros.add(registrarcomisaria);
		registrarcomisaria.addActionListener(new AccionRegistrarComisaria());

		registros.add(new JSeparator());
		vincularpolicia = new JMenuItem("Vincular policia");
		registros.add(vincularpolicia);
		vincularpolicia.addActionListener(new AccionVincularPolicia());

		asignararma = new JMenuItem("Asignar arma");
		registros.add(asignararma);
		asignararma.addActionListener(new AccionAsignarArma());

		listarcomisarias = new JMenuItem("Listar comisarías");
		informes.add(listarcomisarias);
		listarcomisarias.addActionListener(new AccionListarComisarias());

		setSize(1350, 700);
		setVisible(true);
		setTitle("Gestión de comisarías");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		GuiPrincipal ventana = new GuiPrincipal();
	}

	class AccionRegistrarPolica implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			GuiPolicia ventana2 = new GuiPolicia();
		}
	}

	class AccionRegistrarArma implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			GuiArma ventana3 = new GuiArma();
		}
	}

	class AccionRegistrarComisaria implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			GuiComisaria ventana4 = new GuiComisaria();
		}
	}

	class AccionVincularPolicia implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			GuiVincularPolicia ventana5 = new GuiVincularPolicia();
		}
	}

	class AccionAsignarArma implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			GuiAsignarArma ventana6 = new GuiAsignarArma();
		}
	}

	class AccionListarComisarias implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String cad = "";
			for (int i = 0; i < GuiComisaria.comisarias.size(); i++) {
				cad += "Comisaría " + GuiComisaria.comisarias.get(i).getNombre() + "\n" + GuiComisaria.comisarias.get(i).toString() + "\n";
			}
			JOptionPane.showMessageDialog(null, cad);
		}
	}

}
