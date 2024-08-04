package files;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class PrintSpclUTRF8Char {

	public static void main(String[] args) {
		String filePath = "E:\\New Text Document (2).txt";

		try {
			InputStream fis = new FileInputStream(filePath);
            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
            BufferedReader reader = new BufferedReader(isr);
			String line;
			while ((line = reader.readLine()) != null) {
				try {
					FileWriter fw=new FileWriter("E:\\ReadAndPaste.txt", StandardCharsets.UTF_8);
					fw.write(line);
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("An error occured.");
					e.printStackTrace();
				}
			}
			System.out.println("Successfully wrote to the file.");
//			while ((line = reader.readLine()) != null) {
//				System.out.println(line);
//			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
