package programlist;

import java.io.*;

public class FileStreams {
	public static void main(String[] args) throws IOException {
		DataInputStream dis=new DataInputStream(System.in);
		FileOutputStream fout=new FileOutputStream("C:\\Users\\Chandra.P\\Documents\\myfile.txt",true);
		BufferedOutputStream bout=new BufferedOutputStream(fout, 1024);
		System.out.println("Enter text (@at the end):");
		char ch;
		
		while((ch = (char)dis.read()) != '@') {
			bout.write(ch);
		}
		bout.close();
	}

}
