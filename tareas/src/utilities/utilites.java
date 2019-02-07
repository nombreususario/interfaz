package utilities;

public class utilites {
	public char[][] createMatrizEncripted(String string) {
		int size=(string.length()/2)+1;
		char[] charArray=string.toCharArray();
		char[][] charMatriz=new char[size][size];
		for (int i = 0,k=0; i < charMatriz.length; i++) {
			for (int j = 0; j < charMatriz.length; j++) {
				charMatriz[j][i]=charArray[k];
				k++;
				if(k>charArray.length-1)
					k=0;
			}
		}
		return charMatriz;
	}
	public String viewMatriz(char[][] matriz) {
		String view="";
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				view+=matriz[i][j];
			}
			view+="\n";
		}
		return view;
	}
	public String encripted(String string) {
		String encripted="";
		char[][] matriz=this.createMatrizEncripted(string);
		for (int i = matriz.length-1,k=0; i >0; i--) {
			for (int j = matriz.length-1; j >= 0; j--) {
				if(k==string.length()) {
					break;
				}
				encripted+=matriz[j][i];
				k++;
			}
		}
		return encripted;
	}
}
