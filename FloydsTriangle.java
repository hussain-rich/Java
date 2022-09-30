package assignment02;


  import java.util.Scanner;
  
  public class FloydsTriangle {
  
  public static void main(String[] args) { 
	  int rows,number=1,counter,j;
	  Scanner zee=new Scanner(System.in);
  System.out.println("Enter the number of rows for floyds triangle:");
  rows=zee.nextInt(); 
  System.out.println("floyd triangle");
  System.out.println("**************");
  for(counter=1;counter<=rows;counter++)
  { 
	  for(j=1;j<=counter;j++) 
	  {
		  System.out.print(number+" ");
		  number++; 
		  }
  System.out.println();
  }
  
  } }
 