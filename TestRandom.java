// Tests the distribution generated by Java's Math.random() function.
public  class  TestRandom {
	public static void main(String[]  args) {
	    
		int n =	Integer.parseInt(args[0]);
		double num = 0.0;
		int more = 0;
		int less = 0;
		for (int i=0; i<n; i++)
		{
            num = Math.random();
			if (num>0.5) {
				more++;
			}
			else {
				less++;
			}
		}

		System.out.println("> 0.5: " + more + " times");
		System.out.println("<= 0.5: " + less + " times");
        if (more != 0 && less !=0) {
         System.out.println("Ratio: " + (double) more/ less);
		}
		

	}
}
