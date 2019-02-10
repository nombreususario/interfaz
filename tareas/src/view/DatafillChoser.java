package view;

import java.io.File;

import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class DatafillChoser extends JDialog{
	
	private static final long serialVersionUID = 1L;
	JFileChooser fileChooser;
	public DatafillChoser() {
		fileChooser =new JFileChooser();
		this.setModal(true);
		this.setLocationRelativeTo(null);
		this.setSize(400, 300);
		this.inItComponents();
	}
	private void inItComponents() {
		   FileNameExtensionFilter filter = new FileNameExtensionFilter(".bin","txt");
		   FileNameExtensionFilter filterTxt = new FileNameExtensionFilter(".txt","txt");
		   fileChooser.setFileFilter(filter);
		   fileChooser.setFileFilter(filterTxt);
		   int seleccion = fileChooser.showSaveDialog(fileChooser);
		   if (seleccion == JFileChooser.APPROVE_OPTION)
		   {
		      File fichero = fileChooser.getSelectedFile();
		    
		   }else {
			   this.inItComponents();
		   }
		}
	public  String getPath() {
		File file=fileChooser.getSelectedFile();
		return file.getPath();
	}
	public String getTypeFile() {
		String type="";
		System.out.println(fileChooser.getFileFilter());
//		type=fileChooser.getFileFilter();
		return type;
	}
}
