package assignment02;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
   Scanner scan=new Scanner(System.in);
   System.out.println("Enter a number:");
   int num=scan.nextInt();
   if(num %2==0)
	   System.out.println(+num+"...is a even number");
   else
	   System.out.println("the number you entered is "+num+" and is a odd number");
	}

}
