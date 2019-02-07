package percistence;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {
	public FileManager() {
		this.readBinary();
	}
	public void writeBinary() {
		FileOutputStream fileOutputStream=null;
		DataOutputStream dataOutputStrem=null;
		try {
			fileOutputStream=new FileOutputStream("files/Demo",true);
			dataOutputStrem=new DataOutputStream(fileOutputStream);
				dataOutputStrem.writeUTF("hola");
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
	public void readBinary() {
		FileInputStream file=null;
		DataInputStream data=null;
		try {
			file=new FileInputStream("files/Demo");
			data=new DataInputStream(file);
			String a=data.readUTF();
			int b=data.readInt();
			boolean c=data.readBoolean();
			System.out.println(a+b+c);
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
		
	}
}
