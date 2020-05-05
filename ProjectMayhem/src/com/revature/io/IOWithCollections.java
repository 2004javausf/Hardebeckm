package com.revature.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Pork;

public class IOWithCollections {
	private static final String porkFile = "pork.txt";
	public static List<Pork> porkList = new ArrayList<Pork>();
	
	public static void writePorkFile() {
		try {
			ObjectOutputStream objectOut = new ObjectOutputStream(new FileOutputStream(porkFile));
			objectOut.writeObject(porkList);
			objectOut.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void readPorkFile() {
		try {
			ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream(porkFile));
			porkList = (ArrayList<Pork>) objectIn.readObject();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
