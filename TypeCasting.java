package closedLabBook;

public class TypeCasting {

	public static void main(String[] args) {
	//IMPLICIT TYPE CASTING
		 
	byte $a=10; //initially  value 10 is assigning to variable $a of type byte...
	     
	short $b=$a; // value in variable $a of type byte is assigned to variable $b of type short..
	 
	int $c=$b; // value in variable $b of type short is assigned to variable $c of type integer...
	
	long $d=$c;  // value in variable $c of type int is assigned to variable $d of type long... 
	
	float $e=$d; // value in variable $d of type long is assigned to variable $e of type float.. 
   
	double $f=$e;  // value in variable $e of type float is assigned to variable $f of type double... 
	
	String $g=String.valueOf($f); // // value in variable $e of type double is assigned to variable $f of type String... 
	
	System.out.println("In implicit type casting the  final value of string is...."+$g+"\n");
	
	
	//EXPLICIT TYPE CASTING
	
	String a="5"; //value 5 is assigned to variable "a" of string
	
	double b=Double.parseDouble(a);//here "a" is assigned to variable "b" of type double
	
	float c=(float)b;  //the value in "b" is assigned to variable "c" of type float
	
	long d=(long)c;  //  value in "c" is assigned to variable "d" of type long
	

    int e=(int)d;  //value in "d" is assigned to variable "e" of type integer	

    short f=(short)e;  //value in variable "e" of type int  is assigned to variable "f" of type short
	
	byte g=(byte)f;	//finally the value of "g" is 5 which is addigned to the variable "a"
	
	System.out.println("The final value of explicit type casting is......"+g);
	
	}

}
