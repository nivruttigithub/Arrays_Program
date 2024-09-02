package array_program;

public class OddElement {
public static void main(String args[])
{
	int arr[]= {12,54,24,66,32,23,56,18};
	System.out.println("Element in Array at Odd Position : ");
	for(int i=0;i<=arr.length-1;i=i+2)
	{
		System.out.print(arr[i]+" ");
	}
}
}
