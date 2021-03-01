/*
 * Create a heat index calculator take user unput for temp and humidity and then use that in a huge equation
 */

package heatindex;
import java.util.Scanner;

/**
 *
 * @author Kyle Glenn Daniel CIS 232 1/31/21 SAFSN Lab2
 */
public class Heatindex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner kept breaking in the other methods so the intro and T&R are still in main
    Scanner inputDevice = new Scanner(System.in);
        final int T;
        final double R;

    System.out.println("Welcome to the heat index calculator!");
    System.out.println("What is the current temperature in degrees Farenheit");
    T = inputDevice.nextInt();
    System.out.println("What is the current humidity percentage (IE 55)");
    R = inputDevice.nextDouble();
    

   calcheatindex(T,R);

 
    }
private static double calcheatindex(final int T, final double R){

        
        final double HI;
    
         double C1 = -42.379;
         double C2 = 2.04901523;
         double C3 = 10.14333127;
         double C4 = -0.22475541;
         double C5 = -.00683783;
         double C6 = -5.481717E-2;
         double C7 = 1.22874E-3;
         double C8 = 8.5282E-4;
         double C9 = -1.99E-6;
   
    
    
    HI = C1 +(C2 * T)+(C3 * R)+(C4 * T * R)+(C5 * (T*T))+(C6 * R*R)+(C7 * (T*T)* R)+(C8 * T * R*R)+(C9 * (T*T) * (R*R));
   
    Printheatindex(HI);
    return HI;
} 
private static void Printheatindex(final double HI){
    System.out.println("The current heat index is: "  );
    System.out.format("%.2f", HI);
    System.out.println("\n Thank you for using this calculator have a great day!");

}
  
}
    
    

