package assignment02;
import java.util.Scanner;
public class OddOrEven {
public static void main(String[] args) {
int num;
System.out.println("enter an integer number:");
Scanner sik=new Scanner(System.in);
num=sik.nextInt();
if (num%2==0)
	System.out.println("entered number is even..");
else
	System.out.println("entered number is odd..");
}
}
