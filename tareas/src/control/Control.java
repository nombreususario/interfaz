package control;

import percistence.BinaryText;
import percistence.FilePlane;

public class Control {
	public Control() {
		this.changeType(".txt");
	}
	public void changeType(String type) {
		switch (type) {
		case ".bin":
			BinaryText bin=new BinaryText();
			bin.readFile();
			break;
		case ".txt":
			FilePlane file=new FilePlane();
			file.readFile();
			break;

		default:
			break;
		}
	}
}
