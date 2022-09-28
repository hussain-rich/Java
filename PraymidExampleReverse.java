package assignment02;

public class PraymidExampleReverse {

	public static void main(String[] args) {
    int i,j,term=6;
    for(i=1;i<=term;i++)
    {
    	for(j=term;j>=i;j--)
    	{
    		System.out.print("* ");
    	}
    	System.out.println();
    }
	}

}