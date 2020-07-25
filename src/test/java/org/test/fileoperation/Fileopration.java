package org.test.fileoperation;

import java.io.File;

public class Fileopration {
	public static void main(String[] args) {
		File f=new File("E:\\");
		String[] list = f.list();
		for (String string : list) {
			System.out.println(string);
		}
		File[] listFiles = f.listFiles();
		for (File file : listFiles) {
			System.out.println(file);
		}
	}

}
