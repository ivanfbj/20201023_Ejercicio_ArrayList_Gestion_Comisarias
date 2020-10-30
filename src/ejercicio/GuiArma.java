package ejercicio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class GuiArma extends JFrame {
	JButton guardar, cancelar;
	JTextField codigo;
	JTextArea descripcion;
	static ArrayList<Arma> a = new ArrayList();

	public GuiArma() {
		setLayout(new FlowLayout());

		add(new JLabel("C�digo: "));
		codigo = new JTextField(18);
		add(codigo);

		add(new JLabel("Descripción: "));
		descripcion = new JTextArea(3, 18);
		add(descripcion);
		guardar = new JButton("Guardar");
		add(guardar);
		guardar.addActionListener(new boton1());

		cancelar = new JButton("Cancelar");
		add(cancelar);
		cancelar.addActionListener(new boton2());

		setSize(320, 180);
		setVisible(true);
		setTitle("Registrar arma");
	}

	class boton2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			codigo.setText(null);
			descripcion.setText(null);
		}
	}

	class boton1 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Arma ar = new Arma(Integer.parseInt(codigo.getText()), descripcion.getText());
			a.add(ar);
			codigo.setText(null);
			descripcion.setText(null);
			JOptionPane.showMessageDialog(null, "La información del arma se almacenó correctamente");
		}
	}
}
