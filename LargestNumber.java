package assignment02;

public class LargestNumber {
public static void main(String[] args) {
	double n1=5.5,n2=4.4,n3=9.3;
	if(n1>=n2&&n1>=n3) {
		System.out.println("N1 is greater...");
	System.out.println(n1+"...is greater");
	}
	else if(n2>=n1&&n2>=n3){
		System.out.println("n2 is greater");
}
	else
		System.out.println("The greatest number among all the three("+n1+" "+n2+" "+n3+ ")is: "+n3);
} 
}