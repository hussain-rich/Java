package assignment02;
import java.util.Scanner;
public class CheckPrime {

	public static void main(String[] args) {
	int i,temp;
	boolean isprime=true;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter any number:");
    int num=scan.nextInt();
    scan.close();
    for(i=2;i<=num/2;i++)
    {
    	temp=num%i;
    	if(temp==0)
    	{
    		isprime=false;
    		break;
    	}
    }
    if(isprime)
    	System.out.println(num+" is a prime number");
    else
    	System.out.println(num+"is not a prime number");
	}

}
