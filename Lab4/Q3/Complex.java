package Lab4.Q3;

public interface Complex<T> {
    public T getReal();

    public T getImag();

    public Complex<T> add(Complex<T> z);

    public Complex<T> subtract(Complex<T> z);

    public Complex<T> product(Complex<T> z);

    public Complex<T> divide(Complex<T> z);

}