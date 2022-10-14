package closedLabBook;

import java.util.Scanner;

public class FindArrayLocation {

	public static void main(String[] args) {
		boolean found=false;
		int[]arr= {2,3,4,5,6,7,8,9,0};
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		Scanner scan=new Scanner(System.in);
		System.out.println("\nEnter the number to check....");
		int element=scan.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==element)
			{
				System.out.println("Element "+element+" is at index "+i);
				found=true;
				break;
			}
		}
	if(found==false)
	{
		System.out.println("The element you have entered is not present..");
	}
	}
}
