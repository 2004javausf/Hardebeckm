package com.revature.io;

import com.revature.beans.Pork;

public class SerialDemo {
// must go into class and implement serializable
	
	public static void main(String[] args) {
//		IO io = new IO();
////		String a = "bob";
////		io.writeOutputStreamContents("uncle " + a);
//		//reading from a file
//		System.out.println(io.readInputStreamContents());
//		Pork p = new Pork("waddles",1000,100);
//		Pork p1 = new Pork("porker",100,10);
//		Pork p2 = new Pork("biilly",10,1);
//		IOWithCollections.porkList.add(p);
//		IOWithCollections.porkList.add(p1);
//		IOWithCollections.porkList.add(p2);
//		
//		IOWithCollections.writePorkFile();
		IOWithCollections.readPorkFile();
		System.out.println(IOWithCollections.porkList.toString());
	}
}
