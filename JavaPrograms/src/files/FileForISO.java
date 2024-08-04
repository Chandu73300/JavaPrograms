package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileForISO {
	
	public static void main(String args[]) throws IOException {
		
		File file = new File("E:\\Poetic Build\\Poetic space\\data\\publisher\\poetic_in_web\\Poetic2023May26_144845392_BRT1.txt");
		String content = readExtendedASCIICharactersFromFile(file);
		
	}
	public static String readExtendedASCIICharactersFromFile(File file1) throws IOException {
	    StringBuilder sb = new StringBuilder();

	    try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file1), "ISO-8859-1"))) {
	        int charValue;

	        while ((charValue = reader.read()) != -1) {
	            if (charValue <= 255) {
	                sb.append((char) charValue);
	            }
	        }
	    }

	    return sb.toString();
	}

}
