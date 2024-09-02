package array_program;

public class EvenElement {
public static void main(String args[])
{
	int arr[]= {1,23,547,854,32,22,34};
	System.out.println("Element in Array at Even Position : ");
	for(int i=1;i<=arr.length-1;i+=2)
	{
		System.out.print(arr[i]+" ");
	}
}
}
