package Lab4.Q3;

public class DoubleComplex implements Complex<Double>{
    public double real;
    public double imag;
    
    public DoubleComplex(double re, double im){
        real = re;
        imag = im;
    }

    public Double getReal(){return this.real;}
    public void setReal(double re){this.real = re;}
    
    public Double getImag(){return this.imag;}
    public void setImag(double im){this.imag = im;}

    public Complex<Double> add (Complex<Double> z){
        double tempReal = this.real + z.getReal();
        double tempImag = this.imag + z.getImag();
        return new DoubleComplex(tempReal, tempImag);
    }

    public Complex<Double> subtract (Complex<Double> z){
        double tempReal = this.real - z.getReal();
        double tempImag = this.imag - z.getImag();
        return new DoubleComplex(tempReal, tempImag);
    }

    public Complex<Double> product (Complex<Double> z){
        double tempReal = this.real * z.getReal();
        double tempImag = this.imag * z.getImag();
        return new DoubleComplex(tempReal, tempImag);
    }

    public Complex<Double> divide (Complex<Double> z){
        double tempReal = this.real / z.getReal();
        double tempImag = this.imag / z.getImag();
        return new DoubleComplex(tempReal, tempImag);
    }


}
