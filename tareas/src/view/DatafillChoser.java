package view;

import java.io.File;

import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;

import control.Control;

public class DatafillChoser extends JDialog{
	JFileChooser fileChooser;
	private static final long serialVersionUID = 1L;

	public DatafillChoser() {
		this.setModal(true);
		this.setLocationRelativeTo(null);
		this.setSize(400, 300);
		this.inItComponents();
	}
	
	private void inItComponents() {
		   fileChooser =new JFileChooser();
		   fileChooser.showOpenDialog(this);
		   File fil=new File("txt");
		   fileChooser.setSelectedFile(fil);
		   JFileChooser fileChooser = new JFileChooser();
		   int seleccion = fileChooser.showSaveDialog(fileChooser);
		   if (seleccion == JFileChooser.APPROVE_OPTION)
		   {
		      File fichero = fileChooser.getSelectedFile();
		   }else {
			   this.inItComponents();
		   }
		}
	public void setTypeFile() {
	
	}
	public  String getPath() {
		File file=fileChooser.getSelectedFile();
		return file.getPath();
	}
	public String getName() {
		String file= fileChooser.getDialogTitle();
		System.out.println(file);
		return file;
	}
	
}
