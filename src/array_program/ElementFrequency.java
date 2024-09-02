package array_program;

public class ElementFrequency {
public static void main(String args[])
{
	int[] arr= {10,50,45,45,82,10,10,12};
//	int count;
	for(int i=0;i<arr.length;i++)
	{
		int count=1;
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j]  && arr[i] !=' ')
			{
				count++;
				arr[j]='0';
			}
		}
		if(count > 0 && arr[i] != '0')
		{
			System.out.println(arr[i]+" is "+count+" times");
		}
	}
		

}
}
