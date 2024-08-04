package files;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class ReadFileWithSpclChar {

	public static void main(String[] args) {
		String filePath = "E:\\Data.txt";

		try {
			FileInputStream fis = new FileInputStream(filePath);
            InputStreamReader isr = new InputStreamReader(fis, System.getProperty("file.encoding"));
            BufferedReader reader = new BufferedReader(isr);
			String line;
			while ((line = reader.readLine()) != null) {
				try {
					FileWriter fw=new FileWriter("E:\\ReadAndPaste.txt");
					fw.write(line);
					fw.close();
					System.out.println("Successfully wrote to the file.");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("An error occured.");
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
//		String filePath1 = "E:\\ReadAndPaste.txt";

//		try {
//			FileInputStream fis1 = new FileInputStream(filePath1);
//            InputStreamReader isr1 = new InputStreamReader(fis1, StandardCharsets.UTF_8);
//            BufferedReader reader1 = new BufferedReader(isr1);
//			String line1;
//			while ((line1 = reader1.readLine()) != null) {
//				System.out.println(line1);
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
}
