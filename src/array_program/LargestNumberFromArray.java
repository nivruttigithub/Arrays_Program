package array_program;

public class LargestNumberFromArray {
public static void main(String args[])
{
	int arr[] = {12,42,21,10,45,67};
	System.out.println("Sorted Array is :");
	for(int i=0;i<=arr.length-1;i++)
	{
		for(int j=i+1;j<=arr.length-1;j++)
		{
			if(arr[i]>arr[j])
			{
				int temp=arr[i];
				   arr[i]=arr[j];
				   arr[j]=temp;
			}
		}
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	System.out.println("Largest Number is : "+arr[arr.length-1]);
	
	//Second Approach
//	int max=arr[0];
//	for(int i=1;i<=arr.length-1;i++)
//	{
//		if(arr[i]>max)
//		{
//			max=arr[i];
//		}
//	}
//	System.out.println("Largest Number is "+max);
}
}
