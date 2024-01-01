public class OneOfEach {
	public static void main (String[] args) {
		boolean boy = false;
		boolean girl = false;
		int count = 0;

		while (!boy || !girl){
			double prob = Math.random();

			if (prob < 0.5){
				boy = true;
				count++;
				System.out.print("b ");
			} else {
				girl = true;
				count++;
				System.out.print("g ");
			}
		} System.out.println();
		System.out.print("You made it... and you have "+ count+ " children");
	} 
}
