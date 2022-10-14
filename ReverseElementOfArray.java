package closedLabBook;

public class ReverseElementOfArray {

	public static void main(String[] args) {
	int[]arr= {1,2,3,4,5,6,7,8,9};
	//System.out.println("Enter the array element...");
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	/*
	 * for(int i=0;i<arr.length;i++) { System.out.print(arr[i]+" "); }
	 */
	int i=0,j=arr.length-1;
	while(i<j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	
	i+=1;
	j-=1;
	}
	System.out.println("\n");
	for(i=0;i<arr.length;i++)
		
	{
		System.out.print(""+arr[i]+" ");
	}

	}
}
