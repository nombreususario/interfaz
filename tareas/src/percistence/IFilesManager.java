package percistence;

import java.util.ArrayList;

public abstract class IFilesManager {
	public abstract String readFile();
	public abstract void writeFile(ArrayList<String> text,String path);
}
