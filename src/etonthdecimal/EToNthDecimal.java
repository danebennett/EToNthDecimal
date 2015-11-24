/*
 *Find e to the Nth Digit - Just like the previous problem, but with e instead 
 *of PI. Enter a number and have the program generate e up to that many decimal 
 *places. Keep a limit to how far the program will go.
 */
package etonthdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 *
 * @author Dan Bennett
 */
public class EToNthDecimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter the number of decimals in e you would like to"
                + " view.  (No more than 16 decimals.)");
        Scanner ip = new Scanner(System.in);
        int ip1 = ip.nextInt();
        
        BigDecimal e1 = new BigDecimal(Math.E);
        BigDecimal e2 = new BigDecimal(1);
        
        if(ip1 <= 16){
            System.out.println("E to the " + ip1 + " decimal is: " + e1.divide(e2, ip1, RoundingMode.CEILING));
        }else{
            System.out.println("We can only display to 16 digits.  Program is now closing.");
        }
    }
    
}
