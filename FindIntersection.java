package week1.day02.assignments;

import java.util.Arrays;

public class FindIntersection {

	public static void main(String[] args) {
		
		int[] array1= {3,2,11,4,6,7};
		int[] array2= {1,2,8,4,9,7};
		
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		for(int i=0;i<array1.length; i++)
		{
			//System.out.print( "  "+array1[i]);
			
		
		
		//System.out.println(" ");
		
		for(int j=0;j<array2.length;j++) 
		{
			//System.out.print("  "+array2[j]);
		if(array1[i]==array2[j])
		{
			System.out.println("the intersection elements are: " +array1[i]);
		}
		}
		
		
		}
	
	
		// TODO Auto-generated method stub

	}
}

