package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.accessibility.AccessibleIcon;

import percistence.BinaryText;
import percistence.FilePlane;
import percistence.IFilesManager;
import view.DatafillChoser;
import view.MainFrame;

public class Control implements ActionListener {
	private DatafillChoser data;
	public Control() {
		MainFrame main=new MainFrame(this);
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
}
