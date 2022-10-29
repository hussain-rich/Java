package closedLabBook;

import java.util.Scanner;

public class Average {
	float average(int[] arr,int n) {
		int sum=0;
		float a=0;
		
	for(int num:arr)
	{
		sum+=num;
	}
	a=sum/n;
	return a;
			
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of the array...");
		
		int length=scan.nextInt();
		int []arr=new int[length];
		System.out.println("Enter the element of array...");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		scan.close();
		Average obj=new Average();
		System.out.println("The average of set of n number is"+obj.average(arr,length));
	}
	}
