package percistence;

public class FIleManager {
	private IFilesManager ifiles;
	public IFilesManager selctType(String type) {
		switch (type) {
		case ".txt":
			ifiles=new FilePlane();
			break;
		case ".bin":
			ifiles=new BinaryText();
			break;
		default:
			ifiles=null;
			break;
		}
		return ifiles;
	}
}
