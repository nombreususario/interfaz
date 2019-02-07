package percistence;
import utilities.utilites;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryText extends IFilesManager { 
	private utilites ut;
	public BinaryText() {
		ut=new utilites();
	}
	@Override
	public String readFile() {
		String read="";
		FileInputStream file=null;
		DataInputStream data=null;
		try {
			file=new FileInputStream("files/Demo2");
			data=new DataInputStream(file);
			String a=ut.encripted(data.readUTF());
			int b=data.readInt();
			boolean c=data.readBoolean();
			read=a+b+c;
			System.out.println(read);
			file.close();
			data.close();
		} catch (FileNotFoundException e){
			System.out.println(e.getMessage());
		}
		catch (EOFException e){
			System.out.println(e.getMessage());
		}
		catch (IOException e){
			System.out.println(e.getMessage());
		}
		return read;
	}
	@Override
	public void writeFile() {
		FileOutputStream fileOutputStream=null;
		DataOutputStream dataOutputStrem=null;
		try {
			fileOutputStream=new FileOutputStream("files/Demo2",true);
			dataOutputStrem=new DataOutputStream(fileOutputStream);
				dataOutputStrem.writeUTF("la clave es laclave1");
				dataOutputStrem.writeInt(2);
				dataOutputStrem.writeBoolean(true);
			dataOutputStrem.close();
			fileOutputStream.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		 catch (IOException e) {
				System.out.println(e.getMessage());
			}
		
	}
}
