package com.EIT.LambdaExpressionEX;

interface Executable{
	int execute(int a,int b);
}
interface StringExecutable{
	int execute(String a);
}
class Runner{
	public void run(Executable e) {
		System.out.println("executing code block");
		int value=e.execute(12,13);
		System.out.println("Return value is"+value);
	}
	public void run(StringExecutable e) {
		System.out.println("executing code block");
		int value=e.execute("hello");
		System.out.println("Return value is"+value);
	}
}

public class App {

	public static void main(String[] args) {
		int c=100;
		
		
		int d=77;
		Runner runner=new Runner();
		runner.run(new Executable() {

			@Override
			public int execute(int a, int b) {
				System.out.println("hello there ");
				return a+b+c;
			}
			
		});
		
		System.out.println("================================");
		
		runner.run((a,b) -> {
			System.out.println("hello there");
			return a+b+c +d;	
		});
		System.out.println("================================");
		Executable ex=((a,b) -> {
			System.out.println("hello there");
			return a+b+c +d;	
		});
		runner.run(ex);
	}

}
