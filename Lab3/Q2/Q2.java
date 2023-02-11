package Q2;
import java.util.function.Function;

public class Q2 {
    public static void main(String[] args) {
        float t1 = 30;
        float out = new Function<Float,Float>() {
            @Override
            public Float apply (Float t1){
                return (float) ((t1 * 1.8)+32); 
            }
        }.apply(t1);
        System.out.println("The Temp. in Fehr is: " + out);   
    }
}
