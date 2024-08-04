package files;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class WriteToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ǂǄǋǎ¶®©¥~(2<Fd{äîûá¬┤¥╚ÊÕ•ǎǢǶȊȝȱɆɐɤɷʌ~¡µ¿ÇÐàü";
		try {
			 FileOutputStream fout=new FileOutputStream("E:\\New Text Document (2).txt");
			 byte b[]=s.getBytes();
             fout.write(b);
             fout.close();    
             System.out.println("success."); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("An error occured.");
			e.printStackTrace();
		}
		
		String filePath = "E:\\New Text Document (2).txt";
		
        int DEFAULT_BUFFER_SIZE = 1024 * 8;
        byte[] buffer = new byte[DEFAULT_BUFFER_SIZE];
		byte[] fileData = null;
	    try {
	    FileOutputStream fout=new FileOutputStream("E:\\Bytesdata.txt");
		InputStream inputStream = new FileInputStream(filePath);
	    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

	    int bytesRead;

	    while ((bytesRead = inputStream.read(buffer)) != -1) {
	        byteArrayOutputStream.write(buffer, 0, bytesRead);
	    }
	    
	    fileData = byteArrayOutputStream.toByteArray();
	    fout.write(fileData);

			inputStream.close();
			byteArrayOutputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	    System.out.println("Success");
		
//		try {
//			FileInputStream fis = new FileInputStream(filePath);
//            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
//            BufferedReader reader = new BufferedReader(isr);
//			String line;
//			while ((line = reader.readLine()) != null) {
//				
//				System.out.println(line);
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}

}
