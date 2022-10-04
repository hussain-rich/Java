package assignment02;

import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int[]array=new int[10];
    int sum=0,i;
    System.out.println("Enter the element:");
    for(i=0;i<10;i++) {
    	array[i]=scan.nextInt();
    	
    }
    for(int num:array) {
    	sum+=num;
    }
    System.out.println("sum of the array element is "+sum);

	}

}
