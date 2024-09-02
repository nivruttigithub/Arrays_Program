package array_program;

import java.util.Arrays;

public class SortArrayAscOrder {
public static void main(String args[])
{
	int arr[]= {12,23,53,11,34,55,22,60};
	System.out.println("Element is Ascending Order : ");
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
	
}
}
