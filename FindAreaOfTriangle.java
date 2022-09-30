package assignment02;
import java.util.Scanner;
public class FindAreaOfTriangle {
	public static void main(String[] args) {
		double height,width,area;
Scanner go=new Scanner(System.in);
System.out.println("Enter the width of the triangle:");
width=go.nextInt();
System.out.println("Enter the height of the triangle");
height=go.nextInt();
area=(height*width)/2;
System.out.println("The area of triangle is:"+area);
}
}