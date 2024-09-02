package array_program;

public class SecondLargest {
public static void main(String args[]) {
	int arr[] = {12,54,22,14,56,4,124,566};
//	int max=arr[0];
//	int secMax = arr[1];
//	for(int i=1;i<=arr.length-1;i++)
//	{
//		if(arr[i]>max)
//		{
//			secMax=max;
//			max=arr[i];
//		}
//		else if(secMax>arr[i] && secMax !=max)
//		{
//			secMax=arr[i];
//		}
//	}
//	System.out.println("Second Largest Number is :"+secMax);
	System.out.println("Sorted Array is :");
	for(int i=0;i<=arr.length-1;i++)
	{
		for(int j=i+1;j<=arr.length-1;j++)
		{
			if(arr[i]>arr[j])
			{
				int temp =arr[i];
				    arr[i]=arr[j];
				    arr[j]=temp;
			}
		}
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	System.out.println("Second Largest Number is : "+arr[arr.length-2]);
}
}
