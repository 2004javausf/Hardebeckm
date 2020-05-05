package com.revature.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IO {
	//write data to a file
	private static final String outFile = "output.txt";
	private static final String inFile = "input.txt";
			
	public void writeOutputStreamContents(String contents){
		OutputStream os = null;
		File file = new File(outFile);
		try {
		os = new FileOutputStream(file,false); //TRUE APPENDS FALSE OVERWRITES!!!!! reading we gotta see if file exists 
		os.write(contents.getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(os != null) {
			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			} 
			
		}
	}
	// read a string from a file
	public String readInputStreamContents() {
		InputStream is = null;
		File file = new File(inFile);
		StringBuilder s = new StringBuilder(); // use string builder so you dont make a million strings
		
		try {
			is = new FileInputStream(file);
			int b = 0;
			while((b = is.read())!=-1) {
				char c = (char)b;
				s.append(c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(is!=null) {
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return s.toString();
	}
}
