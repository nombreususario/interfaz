package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.accessibility.AccessibleIcon;

import model.dao.ListFiles;
import model.entity.File;
import percistence.BinaryText;
import percistence.FIleManager;
import percistence.FilePlane;
import percistence.IFilesManager;
import view.DatafillChoser;
import view.MainFrame;
import view.NewFIle;

public class Control implements ActionListener {
	private DatafillChoser data;
	private NewFIle newf;
	private ListFiles fi;
	public Control() {
		MainFrame main=new MainFrame(this);
		 fi=new ListFiles();
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
		case C_NEW_FILE:
			newf=new NewFIle(this);
			break;
		case C_NEW_FILE_ACEPT:
			this.addList();
		default:
			break;
		}
		
	}
	public void dataTrue() {
		data=new DatafillChoser();
		data.getName();
	}
	public void filesWrite(ArrayList<String> text,String type,String path) {
		FIleManager file=new FIleManager();
		IFilesManager iFile=file.selctType(type);
		iFile.writeFile(text,path);
	}
	public String path() {
		data=new DatafillChoser();
		return data.getPath();
	}
	public String type() {
		data=new DatafillChoser();
		return data.getTypeFile();
	}
	public void export() {
		filesWrite(fi.listToString(), this.type(), this.path());
	}
	public void addList() {
		File file=new File(newf.getText());
		fi.addLst(file);
		newf.setVisible(false);
	}
}
