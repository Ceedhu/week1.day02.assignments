package week1.day02.assignments;

public class SplitEvenWords {

	public static void main(String[] args) {
		
		String test=" I am a software engineer"; //define String test
		String[] sp=test.split(" "); //split the string wherever there is space and store in string array sp
		for(int i=0;i<sp.length-1;i++) //iterate from i=0 to string length
		{
			if(i%2==1)    //use mod operator and apply condition to check odd 
			{
				char[]ch=sp[i].toCharArray(); //convert string array to character array and storing in character array ch
				for(int j=ch.length-1;j>=0;j--)//iterate in reverse order for inner loop
				{
					System.out.print(ch[j]); //print as m then a similarly for other word
				}
				System.out.print(" "); //print empty spaces
			}
			else
			{
				System.out.print(sp[i] + " "); //if i%2 not equal to odd value print this statement
			}
		}
		
		
		// TODO Auto-generated method stub

	}

}
