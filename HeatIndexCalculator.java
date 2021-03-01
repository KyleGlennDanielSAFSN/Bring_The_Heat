/*
 * Things broke but this is here atleast also i didn,=t quite understand what you wanted where but i tried my best
 */
package heatindex;

/**
 *
 * @author Kyle Glenn Daniel SAFSN
 */
public class HeatIndexCalculator {
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
    System.out.println("The current heat index is: " + HI );

}
}
