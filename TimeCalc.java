public class TimeCalc {
    public static void main(String[] args) {
        
        

        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        // Replace this comment with the rest of your code
        int minutesAdd = Integer.parseInt(args[1]);
        
        int totalMinuts = hours*60 + minutes + minutesAdd;
        int newHour = (totalMinuts / 60 ) % 24;
        int newMinutes = totalMinuts % 60;
        
        if (newHour>9 && newMinutes>9) {
            System.out.println( newHour + ":" + newMinutes );
        }
        else {
            if (newHour<10 && newMinutes<10) {
                System.out.println( "0" +newHour + ":0" + newMinutes );  
            }
            else {
                if (newHour<10){
                    System.out.println( "0" +newHour + ":" + newMinutes ); 
                }
                else{
                    System.out.println(newHour + ":0" + newMinutes ); 
                }
            }
        }
        
    }
}
