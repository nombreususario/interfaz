package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.accessibility.AccessibleIcon;

import model.entity.File;
import percistence.BinaryText;
import percistence.FIleManager;
import percistence.FilePlane;
import percistence.IFilesManager;
import view.DatafillChoser;
import view.MainFrame;

public class Control implements ActionListener {
	private DatafillChoser data;
	private File fi;
	public Control() {
		MainFrame main=new MainFrame(this);
		 fi=new File();
	}
	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		switch (Comands.valueOf(actionEvent.getActionCommand())){
		case C_IMPORT:
			System.out.println("en proseso");
			break;
		case C_EXPORT:
			dataTrue();
			break;

		default:
			break;
		}
		
	}
	public void dataTrue() {
		data=new DatafillChoser();
		data.getName();
	}
	public void filesWrite(String text,int number,String type,String path) {
		FIleManager file=new FIleManager();
		IFilesManager iFile=file.selctType(type);
		iFile.writeFile(text, number);
	}
	public void generatefile() {
		fi.setText("texto a escribir");
		fi.setText("23");
	}
	public void export() {
		String path="";//generar path de el datafilchoser
		String type="";//generar type de el data
		filesWrite(fi.getText(), fi.getNumber(), type, path);
	}
}
