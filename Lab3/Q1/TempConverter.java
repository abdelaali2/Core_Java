package Q1;
import java.util.function.Function;
public class TempConverter implements Function<Float, Float>{
    @Override
    public Float apply(Float t1){
        return (float) ((t1 * 1.8)+32);
    }
}
