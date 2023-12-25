/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		//// Put your code here
		String s = args[0];
		for (int j=s.length(); j>=0;--j)
		{
			System.out.println(s.charAt(j-1));
		}
		}
		
	}
		
	


