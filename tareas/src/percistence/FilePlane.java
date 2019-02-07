package percistence;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FilePlane extends IFilesManager{

	@Override
	public String readFile() {
		String read="";
		try {
			List<String> listLines;
			listLines=Files.readAllLines(Paths.get("files/DemoPlaib"));
			 read=listLines.toString();
			return read;
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
			return read;
		
	}
	@Override
	public void writeFile() {
		
		System.out.println("poner algo");
	}
	
}
