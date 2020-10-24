package ejercicio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class GuiVincularPolicia extends JFrame {
	JButton vincular;
	JComboBox<String> com, policias;

	public GuiVincularPolicia() {
		setLayout(new FlowLayout());

		add(new JLabel("Comisarías: "));
		com = new JComboBox<String>();
		for (int i = 0; i < GuiComisaria.comisarias.size(); i++)
			com.addItem(GuiComisaria.comisarias.get(i).getNombre());
		add(com);

		add(new JLabel("Policías: "));
		policias = new JComboBox();
		for (int i = 0; i < GuiPolicia.p.size(); i++)
			policias.addItem(String.valueOf(GuiPolicia.p.get(i).getCedula()));
		add(policias);

		vincular = new JButton("Vincular");
		add(vincular);
		vincular.addActionListener(new boton1());

		setSize(350, 150);
		setVisible(true);
		setTitle("Vincular policía");
	}

	class boton1 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			for (int i = 0; i < GuiComisaria.comisarias.size(); i++) {
				if ((GuiComisaria.comisarias.get(i).getNombre()).equals(com.getSelectedItem())) {
					for (int j = 0; j < GuiPolicia.p.size(); j++) {
						if (String.valueOf(GuiPolicia.p.get(j).getCedula()).equals(policias.getSelectedItem())) {
							GuiComisaria.comisarias.get(i).setPolicia(GuiPolicia.p.get(j));
							JOptionPane.showMessageDialog(null, "El policía con cédula " + policias.getSelectedItem() + " fué vinculado a la comisaría " + com.getSelectedItem());
						}
					}
				}
			}
		}
	}
}
