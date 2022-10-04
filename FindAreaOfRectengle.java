package assignment02;
import java.util.Scanner;
public class FindAreaOfRectengle {

	public static void main(String[] args) {
	double length,width,area;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the length of the rectengele:");
	length=scan.nextDouble();
	System.out.println("Enter the width of the rectangle:");
	width=scan.nextDouble();
	area=length*width;
	System.out.println("Area of rectengle is"+area);
	

	}

}
