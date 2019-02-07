package view;
import view.*;

import java.awt.Button;

import javax.swing.JFrame;

import control.Control;


public class MainFrame extends JFrame{
	private JMenuToolBar menu;
	public MainFrame(Control control) {
	this.setTitle("prueba");
	this.setSize(600, 300);
	this.setLocationRelativeTo(null);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	initCompoents(control);
	this.setVisible(true);

	}
	public void initCompoents(Control control) {
		menu= new JMenuToolBar(control);
		this.setJMenuBar(menu);
	}
}
