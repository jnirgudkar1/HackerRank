import java.util.*;
import java.math.*;

public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
        //System.out.println(tipPercent);
        //System.out.println(taxPercent);
        
        // Write your calculation code here.
        double tip = (mealCost * tipPercent/100);
        //System.out.println(tip);
        double tax = mealCost * taxPercent/100;
        //System.out.println(tax);
        double total = mealCost + tip + tax;
        //System.out.println(total);
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(total);
      
        // Print your result
        System.out.println("The total meal cost is "+totalCost+" dollars.");
    }
}