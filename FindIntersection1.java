package week1.day02.assignments;

import java.util.Arrays;

public class FindIntersection1 {

	public static void main(String[] args) {
		
		int[] array1= {3,2,11,4,6,7};
		int[] array2= {1,2,8,4,9,7};
		
		Arrays.sort(array1); // Sorted the 2 arrays
		Arrays.sort(array2);
		
		for(int i=0;i<array1.length; i++)     //Iterate through 1st array
		{
			//System.out.print( "  "+array1[i]);
			
		
		
		//System.out.println(" ");
		
		for(int j=0;j<array2.length;j++)   // Iterate through 2nd array
		{
			//System.out.print("  "+array2[j]);
		if(array1[i]==array2[j])              // Printed the common Array Elements
		{
			System.out.println("the intersection elements are: " +array1[i]);
		}
		}
		
		
		}
	
	
		// TODO Auto-generated method stub

	}
}

