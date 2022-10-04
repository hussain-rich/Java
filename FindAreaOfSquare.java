package assignment02;
import java.util.Scanner;
public class FindAreaOfSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the sides of the square:");
    double side=scan.nextDouble();
    double area=side*side;
    System.out.println("The area of square is"+area);
	}

}
