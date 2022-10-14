package closedLabBook;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
	int n;
	boolean prime=true;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number to check:");
	n=scan.nextInt();
	for(int i=2;i<n;i++)
	{
        if(n%2==0)
        	prime=false;
        break;
	
	}
	if(prime)
		System.out.println(n+" is prime number..");
	else
	  System.out.println(n+ " is not a prime number...");
}
}