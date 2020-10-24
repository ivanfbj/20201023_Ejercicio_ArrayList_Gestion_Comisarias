package ejercicio;

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
		registrarpolicia.addActionListener(new menu1());

		registrararma = new JMenuItem("Registrar arma");
		registros.add(registrararma);
		registrararma.addActionListener(new menu2());

		registrarcomisaria = new JMenuItem("Registrar comisaría");
		registros.add(registrarcomisaria);
		registrarcomisaria.addActionListener(new menu3());

		registros.add(new JSeparator());
		vincularpolicia = new JMenuItem("Vincular policia");
		registros.add(vincularpolicia);
		vincularpolicia.addActionListener(new menu4());

		asignararma = new JMenuItem("Asignar arma");
		registros.add(asignararma);
		asignararma.addActionListener(new menu5());

		listarcomisarias = new JMenuItem("Listar comisarías");
		informes.add(listarcomisarias);
		listarcomisarias.addActionListener(new menu6());

		setSize(1350, 700);
		setVisible(true);
		setTitle("Gestión de comisarías");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		GuiPrincipal ventana = new GuiPrincipal();
	}

	class menu1 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			GuiPolicia ventana2 = new GuiPolicia();
		}
	}

	class menu2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			GuiArma ventana3 = new GuiArma();
		}
	}

	class menu3 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			GuiComisaria ventana4 = new GuiComisaria();
		}
	}

	class menu4 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			GuiVincularPolicia ventana5 = new GuiVincularPolicia();
		}
	}

	class menu5 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			GuiAsignarArma ventana6 = new GuiAsignarArma();
		}
	}

	class menu6 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String cad = "";
			for (int i = 0; i < GuiComisaria.comisarias.size(); i++) {
				cad += "Comisaría " + GuiComisaria.comisarias.get(i).getNombre() + "\n" + GuiComisaria.comisarias.get(i).toString() + "\n";
			}
			JOptionPane.showMessageDialog(null, cad);
		}
	}

}
