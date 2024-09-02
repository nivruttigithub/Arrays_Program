package array_program;

public class SmallestNumber {
public static void main(String args[])
{
	int a[] = {12,43,24,65,34,22,54};
	System.out.println("Sorted Array is :");
	for(int i=0;i<=a.length-1;i++)
	{
		for(int j=i+1;j<=a.length-1;j++)
		{
			if(a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		System.out.print(a[i]+" ");
	}
	System.out.println();
	System.out.println("Smallest Element in Array is : "+a[0]);
}
}
