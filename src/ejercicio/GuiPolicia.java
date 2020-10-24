package ejercicio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class GuiPolicia extends JFrame {
	JButton guardar, cancelar;
	JTextField cedula, nombre, funcion, nivel;
	static ArrayList<Policia> p = new ArrayList();

	public GuiPolicia() {
		setLayout(new FlowLayout());

		add(new JLabel("Cédula: "));
		cedula = new JTextField(18);
		add(cedula);

		add(new JLabel("Nombre: "));
		nombre = new JTextField(18);
		add(nombre);

		add(new JLabel("Función: "));
		funcion = new JTextField(18);
		add(funcion);

		add(new JLabel("Nivel ejecutivo: "));
		nivel = new JTextField(18);
		add(nivel);

		guardar = new JButton("Guardar");
		add(guardar);
		guardar.addActionListener(new boton1());

		cancelar = new JButton("Cancelar");
		add(cancelar);
		cancelar.addActionListener(new boton2());

		setSize(320, 220);
		setVisible(true);
		setTitle("Registrar policía");

	}

	class boton1 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Policia pol = new Policia(Long.parseLong(cedula.getText()), nombre.getText(), funcion.getText(), nivel.getText());
			p.add(pol);
			cedula.setText(null);
			nombre.setText(null);
			funcion.setText(null);
			nivel.setText(null);
			JOptionPane.showMessageDialog(null, "La información del policía se almacenó correctamente");
		}
	}

	class boton2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			cedula.setText(null);
			nombre.setText(null);
			funcion.setText(null);
			nivel.setText(null);
		}
	}
}
