package org.program;

public class Productofnumbers {
public static void main(String[] args) {
	int n=12345,res=1,rem=0;
	
	while (n>0) {
		
		rem=n%10;
		res=res*rem;
		n=n%10;
		
		
	}
System.out.println("product of number is: " +res);
}
}
