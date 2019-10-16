package mastering.repetition;

public class ComplexNumber {
    private double real;
    private double imaginary;
    public ComplexNumber(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    public double getReal(){
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
    public void add(double real, double imaginary){
        this.real = this.real + real;
        this.imaginary = this.imaginary +imaginary;
    }
    public void add(ComplexNumber complexNumber){
        add(complexNumber.getReal(),complexNumber.getImaginary());
    }
    /*public void divide(double real, double imaginary){
        double divider = ((Math.pow(real,2))+(Math.pow(imaginary,2)));
        if(divider>0){
        this.real = ((this.real*real)+(this.imaginary*imaginary))/divider;
        this.imaginary = ((this.imaginary*real)-(this.real*imaginary))/divider;
        }
        System.out.println("Invalid");
    }
    public void divide(ComplexNumber complexNumber){
        divide(complexNumber.getReal(),complexNumber.getImaginary());
    }*/
    public void subtract(double real,double imaginary){
        this.real = this.real - real;
        this.imaginary = this.imaginary - imaginary;
    }
    public void subtract(ComplexNumber complexNumber){
        subtract(complexNumber.getReal(),complexNumber.getImaginary());
    }
}
