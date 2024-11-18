// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int count = Integer.parseInt(args[0]);
		double sum = 0.0;
		double temp = 0.0;
		int i = 1;
		System.out.println("pi accoding to Java: " + Math.PI);
        while (i< 2*count) {
			temp = 1.0/i;
			//System.out.println("temp: "+temp);
			if (i%4==3){
				sum = sum -temp;
			}
			else {
				sum =sum + temp;
			}
			i +=2;
			
			//System.out.println("sum: " +sum);
		}
		System.out.println("pi, approximated:     " + 4*sum);
	}
}
