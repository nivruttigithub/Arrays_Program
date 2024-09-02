package array_program;

import java.util.HashSet;

public class DuplicateElement {
	public static void main(String args[])
	{
		//Example Array
		int arr[]= {10,20,30,20,40,50,10,60,70,50};
		//Create a HashSet to Store the elements and a HashSet for duplicates
		HashSet<Integer> seenSet =new HashSet<Integer>();
		HashSet<Integer> duplicates = new HashSet<Integer>();
		
		//Iterate over the array to find duplicates
		for(int num : arr)
		{
			if(seenSet.contains(num))
			{
				duplicates.add(num);
			}
			else
			{
				seenSet.add(num);
			}
		}
		
		//Print duplicate elements
		System.out.println("Duplicate Elements in the Array : ");
		for(int num : duplicates)
		{
			System.out.println(num);
		}
	}

}
