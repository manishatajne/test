package com.seleniumtraining;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Filecreation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*FileOutputStream os = new FileOutputStream("E://Selenium//test.txt");
		String sg = "This is my happy day.";
		byte b[] = sg.getBytes();
		os.write(b);
		os.close();*/
		
		FileInputStream os = new FileInputStream("E://Selenium//test.txt");
		
		int i =0;
		
		while ((i=os.read())!= -1) {
			
			System.out.print((char)i);
			
		}

	
	}

}
