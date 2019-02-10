package view;

import javax.swing.BoxLayout;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import control.Comands;
import control.Control;
public class JMenuToolBar extends JMenuBar{
	public DatafillChoser data;
	private static final long serialVersionUID = 1L;
	private JMenu menu,files;
	private JMenuItem export,imports,newFile;
	public JMenuToolBar(Control control) {
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		files=new JMenu("archivo");		
		newFile=new JMenuItem("nuevo");
		newFile.addActionListener(control);
		newFile.setActionCommand(Comands.C_NEW_FILE.name());
		files.add(newFile);
		this.add(files);
		
		menu=new JMenu("exportar&importr");
		export=new JMenuItem("Export");
		export.addActionListener(control);
		export.setActionCommand(Comands.C_EXPORT.name());
		menu.add(export);
		imports=new JMenuItem("Impot");
		imports.addActionListener(control);
		imports.setActionCommand(Comands.C_IMPORT.name());
		menu.addSeparator();
		menu.add(imports);
		this.add(menu);
		this.setVisible(true);
	}
}
