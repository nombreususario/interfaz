package view;

import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import control.Comands;
import control.Control;

public class NewFIle extends JDialog{
	private JPanel panel;
	private JTextField text;
	private JLabel label;
	private JButton acept,cancel;
	public NewFIle(Control control) {
		this.setTitle("create file");
		this.setSize(300, 200);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(HIDE_ON_CLOSE);
		this.initComponetes(control);
		this.setVisible(true);
	}
	public void initComponetes(Control control) {
		panel=new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		label=new JLabel("ingrese el texto");
		panel.add(label);
		text=new JTextField();
		text.setBorder(new MatteBorder(20, 20, 5, 10, Color.black));
		panel.add(text);
		acept=new JButton("aceptar");
		acept.addActionListener(control);
		acept.setActionCommand(Comands.C_NEW_FILE_ACEPT.name());
		panel.add(acept);
		cancel=new JButton("cancelar");
		cancel.addActionListener(control);
		cancel.setActionCommand(Comands.C_NEW_FILE_CANCEL.name());
		panel.add(cancel);
		this.add(panel);
	}
	public String getText() {
		return text.getText();
	}
}
