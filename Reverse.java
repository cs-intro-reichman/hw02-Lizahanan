/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		//// Put your code here
		String s = args[0];
		int n = s.length();
		int i = n-1;
		int a = (s.length()/2)-1;
		int b = (s.length()-1)/2;
		

		while ( i>=0)
		{
			System.out.print(s.charAt(i));
			i = i - 1;
		}
		System.out.println();
		{
       if (s.length() % 2 == 0)
	   {
		System.out.println("The middle character is " + s.charAt(a));
	   } else {
		System.out.println("The middle character is " + s.charAt(b));
	   } }

		}
		
	}
		
	


