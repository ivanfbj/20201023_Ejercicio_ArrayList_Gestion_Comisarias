package ejercicio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class GuiComisaria extends JFrame {
	JButton guardar, cancelar;
	JTextField nombre;
	static ArrayList<Comisaria> comisarias = new ArrayList<Comisaria>();

	public GuiComisaria() {
		setLayout(new FlowLayout());

		add(new JLabel("Nombre: "));
		nombre = new JTextField(18);
		add(nombre);

		guardar = new JButton("Guardar");
		add(guardar);
		guardar.addActionListener(new boton1());

		cancelar = new JButton("Cancelar");
		add(cancelar);
		cancelar.addActionListener(new boton2());

		setSize(320, 150);
		setVisible(true);
		setTitle("Registrar comisar�a");
	}

	class boton1 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Comisaria com = new Comisaria(nombre.getText());
			comisarias.add(com);
			nombre.setText(null);
			JOptionPane.showMessageDialog(null, "La información de la comisaría se almacenó correctamente");
		}
	}

	class boton2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			nombre.setText(null);
		}
	}
}
