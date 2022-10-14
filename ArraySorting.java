package closedLabBook;

public class ArraySorting {
	public static void main(String[] args) {
     int [] num=new int[]{9,6,0,0,2,9,8,4,2,3};
    System.out.print("Original value of array....");
     for(int i=0;i<num.length;i++)
     {
    	 System.out.print(num[i]+" ");
     }
     	for(int i=0;i< num.length;i++)
     	{
     		for( int j=i+1;j<num.length;j++)
     		{
     			if(num[i]>num[j])
     			{
     				int temp=num[i];
     				num[i]=num[j];
     				num[j]=temp;
     				
     			}
     		}
     	}
     	System.out.println("\n");
    System.out.print("arrays after sorting in accending order...");
    for(int i=0;i<num.length;i++)
    {
    	System.out.print(num[i]+" ");
    }
     for(int i=0;i<num.length;i++)
     {
    	 for(int j=i+1;j<num.length;j++)
    	 {
    		 if(num[i]<num[j])
    		 {
    			 int temp=num[i];
    			 num[i]=num[j];
    			 num[j]=temp;
    		 }
    	 }
     }
     System.out.println("\n");
     System.out.print("Array after sorting in decending order....");
     for(int i=0;i<num.length;i++)
     {
    	 System.out.print(num[i]+" ");
     }
     
}
}