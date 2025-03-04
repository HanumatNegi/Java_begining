class Complex {
    double real, imag;

    Complex(double r, double i) {
        this.real = r;
        this.imag = i;
    }

    Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imag + c.imag);
    }

    public void display() {
        System.out.println(real + " + " + imag + "i");
    }
}

public class ComplexNumbers {
    public static void main(String[] args) {
        Complex c1 = new Complex(3.5, 2.5);
        Complex c2 = new Complex(1.5, 4.5);

        Complex sum = c1.add(c2);
        System.out.print("Sum: ");
        sum.display();
    }
}
