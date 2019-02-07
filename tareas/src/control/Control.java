package control;

import percistence.BinaryText;
import percistence.FilePlane;
import percistence.IFilesManager;

public class Control {
	public Control() {
		this.changeType(".txt");
	}
	public void changeType(String type) {
		switch (type) {
		case ".bin":
			IFilesManager bin=new BinaryText();
			bin.readFile();
			break;
		case ".txt":
			IFilesManager file=new FilePlane();
			file.readFile();
			break;

		default:
			break;
		}
	}
}
