import java.util.Random;

public class OneOfEachStats {
    
    public static void main (String[] args) {
    int T = Integer.parseInt(args[0]);
    int seed = Integer.parseInt(args[1]);
    Random generator = new Random(seed);
    int childSumCount = 0;
    int twochildlren = 0;
    int threechildren = 0;
    int fourplus = 0;
    for(int i = 0; i<T; i++){
        int childrenPerFamily=0;
        boolean boy = false;
        boolean girl = false;
        while (!boy || !girl){
            double prob = generator.nextDouble();

            if (prob < 0.5){
                boy = true;

            } else {
                girl = true;

            }
            childSumCount++;
            childrenPerFamily++;

        } 
        if (childrenPerFamily==2) {
            twochildlren++;
        }
        else if(childrenPerFamily==3){
            threechildren++;
        }else if(childrenPerFamily >= 4){
            fourplus++;
        }

    }
    double average = (childSumCount/(double)T);
     System.out.print("Average: "+ average+ "children to get at least one of each gender");
     System.out.println();
	 System.out.println("Number of families with 2 children: " + twochildlren);
	 System.out.println("Number of families with 3 children: " + threechildren);
	 System.out.println("Number of families with 4 or more children: " + fourplus);
	 String mode;
	
	 if (twochildlren > threechildren && twochildlren > fourplus) {mode = "2";}
	 else if (threechildren > twochildlren && threechildren > fourplus) {mode = "3";}
	 else if (fourplus > twochildlren && fourplus > threechildren) {mode = "4 or more";}
	 else if (twochildlren == threechildren && twochildlren > fourplus) {mode = "2";}
	 else if (twochildlren == fourplus && twochildlren > threechildren) {mode = "2";}
	 else if (threechildren == fourplus && threechildren> twochildlren) {mode = "3";}
	 else {mode = "4 or more";}
	 

	System.out.println("The most common number of children is " + mode + ".");

	}
}
