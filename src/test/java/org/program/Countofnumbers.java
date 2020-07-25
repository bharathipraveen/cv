package org.program;

public class Countofnumbers {
public static void main(String[] args) {
	int n=12345,count=0;
	while (n>0) {
		count++;
		n=n/10;
	}
		System.out.println("count of digit:"+count);
	}
}

