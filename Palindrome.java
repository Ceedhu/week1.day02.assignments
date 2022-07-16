package week1.day02.assignments;
import java.io.*;

public class Palindrome {

	public static void main(String[] args){
		
			String x="lirils";
			int i=0; int j=x.length()-1;
			while(i<j)                      //it iterates through the loop                  
			{
				if(x.charAt(i)!=x.charAt(j))         //if first character and last character are not same, it comes out of the loop
				{
					System.out.println("Not a palindrome");
					System.exit(0);
				}
				i++;                     //if they are same, they go to the next character from the first as well as last
				j--;
				
					
			}
			
		
		System.out.println("Palindrome");     //so if iteration completes it is a palindrome,
	
                 
	}
}
	

