package Lab4.Q3;

public class Q3 {
    public static void main(String[] args) {
        DoubleComplex a = new DoubleComplex(20.15032d, 55.2014d);
        DoubleComplex b = new DoubleComplex(2.02369d, 9.8546901d);

        Complex<Double> result = a.add(b);
        System.out.println("Add: " + result.getReal() + "+ i " + result.getImag());
        result = a.subtract(b);
        System.out.println("Subtract: " + result.getReal() + "+ i " + result.getImag());
        result = a.product(b);
        System.out.println("Product: " + result.getReal() + "+ i " + result.getImag());
        result = a.divide(b);
        System.out.println("Divide: " + result.getReal() + "+ i " + result.getImag());
    }
}
