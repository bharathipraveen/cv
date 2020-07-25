package org.scanner;

import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("employee id ");
		int empId = sc.nextInt();
		System.out.println("employee name");
		
		String name = sc.next();
		System.out.println("employee email");
		String mail = sc.next();
		System.out.println("employee phone");
		long phone = sc.nextLong();
		System.out.println("employee salary");
		double salary = sc.nextDouble();
		System.out.println("employee gender");
		String gender = sc.next();
		
		System.out.println("employee city");
		String city = sc.next();
		
		
		 
        
	}

}
