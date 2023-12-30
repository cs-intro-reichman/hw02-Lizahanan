/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		//// Put your code here
       int n = Integer.parseInt(args[0]); //gets n
	   int line = 1;  //declares line number 
	    
	   while (line <= n) { //loop for lines
		int x = 1;
		while ( x<= n){ //loop for n of *
			if (line%2==0) {
               System.out.print(" *");
		//on even lines prints with space first 
			} else {
				System.out.print("* ");
		//on odd lines prints straight away
			}
			x=x+1;
		} System.out.println();
		//prints space between lines
		line = line + 1;
	   }

		}

		
	}
