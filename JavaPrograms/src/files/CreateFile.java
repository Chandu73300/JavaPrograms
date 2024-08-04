package files;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f= new File("E:\\JAVA_PROGRAMS\\Dummyfile1.properties");
		try {
			if(f.createNewFile()) {
				System.out.println("File created" +f.getName());
			}
			else {
				System.out.println("File already existed");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
