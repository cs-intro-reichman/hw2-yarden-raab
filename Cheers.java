// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    
          String s = args[0];
          int run = Integer.parseInt(args[1]);
          String an = "AEFHILMNORSX";
          char temp ='0';
          for (int i=0; i<s.length(); i++)    {
               temp= s.charAt(i);
                if (an.indexOf(temp)==-1) {
                        System.out.println("Give me a " + temp + ": " + temp);
                }
                else {
                        System.out.println("Give me an " + temp + ": " + temp); 
                }   
        }      
          System.out.println("What does that spell?");
          for (int j=0; j<run; j++)  {
               System.out.println( s + "!!!");
          }
        

        }
}
