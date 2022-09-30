package assignment02;
import java.util.Scanner;
public class FindTheAreaOfCircle {
	public static void main(String[] args) {	
Scanner scan=new Scanner(System.in);
System.out.println("Enter the radius of the circle:");
double radius=scan.nextInt();
//area of circle
double area=Math.PI*(radius*radius);
System.out.println("The area of circle is:"+area);
double cir=Math.PI*2*radius;
System.out.println("The circumference of circle is:");

	}
}
