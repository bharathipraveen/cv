package org.test.fileoperation;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;

public class Fileoper {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		
		File f=new File("E:\\sam.tx");
		boolean c = f.createNewFile();
		System.out.println(c);
		boolean file = f.isFile();
		
		System.out.println(file);
		boolean directory = f.isDirectory();
		System.out.println(directory);
		FileUtils.write(f, "welcome");
		
	}

}
