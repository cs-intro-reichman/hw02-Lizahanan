/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		//// Put your code here

		int d = Integer.parseInt(args[0]);
        int i = 1;

		while (i <= d) {
			int a = d % i;
			if (a == 0) 
			System.out.println(i);
			i++;

		}
		
	}
}
