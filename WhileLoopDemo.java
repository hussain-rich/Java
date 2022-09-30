package assignment02;
import java.util.Scanner;
public class WhileLoopDemo {
	public static void main(String[] args) {
	int number,sum=0;
	System.out.println("Please enter any integer value below 10:");
	Scanner er=new Scanner(System.in);
	number=er.nextInt();
	while(number<=10)
	{
		sum=sum+number;
		number++;
	}
	System.out.println("sum of the number from the while loop is: "+sum);

}
}