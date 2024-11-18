// Demonstrates the Collatz conjecture.

import javax.print.DocFlavor.STRING;

public class Collatz {
	public static void main(String args[]) {
	    	
		int n = Integer.parseInt(args[0]);
		String mode = args[1];
		int seed =1;
		int count = 1;

		if (mode.equals("v")) {
			for (int i=1; i<=n; i++){
				seed=i;
				count=1;
				if (seed == 1){
					System.out.println("1 4 2 1 (4)");
				}
				else {
					while (seed != 1) {
						System.out.print(seed + " ");
						if (seed % 2 ==0) {
							seed = seed / 2;
						}
						else {
							seed = seed * 3 + 1;
						}
						count++;		
					}
					System.out.print(seed + " ");
					System.out.print("(" + count + ")");
					System.out.println();
				}			
			}
			System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
		}
		else {
			for (int i=1; i<=n; i++) {
				while (seed != 1) {
					System.out.print(seed + " ");
					if (seed % 2 ==0) {
						seed = seed / 2;
					}
					else {
						seed = seed * 3 + 1;
					}
				}
			}
			
			System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
		}

		
	
	}
	
}
