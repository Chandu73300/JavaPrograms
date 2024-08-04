package programlist;

import java.io.*;

public class ReadFile {
	public static void main(String[] args) throws IOException {
		FileInputStream fin=new FileInputStream("C:\\Users\\Chandra.P\\Documents\\myfile.txt");
		System.out.println("File contents:");
		
		int ch;
		while((ch=fin.read())!= -1) {
			System.out.print((char)ch);
		}
	}

}
