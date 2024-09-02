package array_program;

public class ReverseElement {
public static void main(String args[])
{
	int arr[]= {12,35,66,32,1545,78};
	System.out.println("Element in Array in Reverse Order : ");
	for(int i=arr.length-1;i>=0;i--)
	{
		System.out.print(arr[i]+" ");
	}
}
}
