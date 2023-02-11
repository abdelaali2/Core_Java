package Q3;

import java.util.function.Function;
import java.math.*;

public class Quadratic implements Function <double[], Void>{
    @Override
    public Void apply (double[] inpArray){
        double a = inpArray[0];
        double b = inpArray[1];
        double c = inpArray[2];
        double d = b * b - 4.0 * a * c;

        if (d> 0.0) {  
            double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);  
            double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);  
            System.out.println("The roots are " + r1 + " and " + r2);  
        }   
        else if (d == 0.0)   
        {  
            double r1 = -b / (2.0 * a);  
            System.out.println("The root is " + r1);  
        }   
        else   
        {  
            System.out.println("Roots are not real.");  
        }
        return null;
    }
}
