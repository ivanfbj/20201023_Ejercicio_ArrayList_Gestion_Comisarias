package ejercicio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class GuiAsignarArma extends JFrame {
	JButton asignar;
	JComboBox<String> com, armas;

	public GuiAsignarArma() {
		setLayout(new FlowLayout());

		add(new JLabel("Comisarías: "));
		com = new JComboBox<String>();
		for (int i = 0; i < GuiComisaria.comisarias.size(); i++)
			com.addItem(GuiComisaria.comisarias.get(i).getNombre());
		add(com);

		add(new JLabel("Armas: "));
		armas = new JComboBox();
		for (int i = 0; i < GuiArma.a.size(); i++)
			armas.addItem(String.valueOf(GuiArma.a.get(i).getCodigo()));
		add(armas);

		asignar = new JButton("Asignar");
		add(asignar);
		asignar.addActionListener(new boton1());

		setSize(350, 150);
		setVisible(true);
		setTitle("Asignar arma");
	}

	class boton1 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			for (int i = 0; i < GuiComisaria.comisarias.size(); i++)
				if ((GuiComisaria.comisarias.get(i).getNombre()).equals(com.getSelectedItem()))
					for (int j = 0; j < GuiArma.a.size(); j++)
						if ((String.valueOf(GuiArma.a.get(j).getCodigo())).equals(armas.getSelectedItem())) {
							GuiComisaria.comisarias.get(i).setArma(GuiArma.a.get(j));
							JOptionPane.showMessageDialog(null, "El arma " + GuiArma.a.get(j).getCodigo() + " fué asignada a la comisaría " + com.getSelectedItem());
						}
		}
	}
}
