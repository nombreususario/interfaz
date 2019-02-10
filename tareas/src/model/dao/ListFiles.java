package model.dao;

import java.util.ArrayList;
import java.awt.List;
import model.entity.File;

public class ListFiles {
private ArrayList<File> list;
public ListFiles () {
	list=new ArrayList<>();
	list.add(new File("archivo"));
}

public void addLst(File file) {
	list.add(file);
}
public ArrayList<String> listToString(){
	ArrayList<String> data=new ArrayList<>(); 
	for (int i = 0; i < list.size(); i++) {
		data.add(list.get(i).getText());
	}
	return data;
}
public Object [][] listFileToObject() {
	Object[][] obj=new Object[list.size()][1];
	for (int i = 0; i < list.size(); i++) {
		obj[i]=list.get(i).fileToObject();
	}
	return obj;
}
}
