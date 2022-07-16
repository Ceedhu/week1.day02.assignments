package week1.day02.assignments;

public class OddIndexToUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test1="default";
		char[] name=test1.toCharArray();  //convert string into array
		int length=name.length;

		for(int i=0;i<length;i++)  //traverse through each character in the loop
		{
			if(i%2==0) {         //condition for odd.
				//to convert a character to upper case
				name[i]=Character.toUpperCase(name[i]);
				
						}	
		}
		System.out.print(name);
	}



	}



