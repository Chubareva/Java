import java.util.Objects;

public class Complex {
    protected double dReal, dImaginary;


    public Complex() {
    }

    public Complex(double dReal, double dImaginary) {
        this.dReal = dReal;
        this.dImaginary = dImaginary;
    }


    public String toString() {
        if (dImaginary >= 0)
            return dReal + "+" + dImaginary + "i";
        else
            return dReal + "-" + -dImaginary + "i";
    }


    public Complex negate() {
        Complex negate = new Complex();

        negate.dReal = -dReal;
        negate.dImaginary = -dImaginary;

        return (negate);
    }


    public Complex add(Complex cB) {
        Complex sum = new Complex();

        sum.dReal = dReal + cB.dReal;
        sum.dImaginary = dImaginary + cB.dImaginary;

        return (sum);
    }


    public Complex sub(Complex cB) {
        Complex diff = new Complex();

        diff.dReal = dReal - cB.dReal;
        diff.dImaginary = dImaginary - cB.dImaginary;

        return (diff);
    }



    public Complex mult(Complex cB) {
        Complex prod = new Complex();

        prod.dReal = dReal * cB.dReal - dImaginary * cB.dImaginary;
        prod.dImaginary = dImaginary * cB.dReal + dReal * cB.dImaginary;

        return (prod);
    }


    public Complex div(Complex cB) {
        Complex div = new Complex();
        double dR, dDen;

        if (Math.abs(cB.dReal) >= Math.abs(cB.dImaginary)) {
            dR = cB.dImaginary / cB.dReal;
            dDen = cB.dReal + dR * cB.dImaginary;
            div.dReal = (dReal + dR * dImaginary) / dDen;
            div.dImaginary = (dImaginary - dR * dReal) / dDen;
        } else {
            dR = cB.dReal / cB.dImaginary;
            dDen = cB.dImaginary + dR * cB.dReal;
            div.dReal = (dR * dReal + dImaginary) / dDen;
            div.dImaginary = (dR * dImaginary - dReal) / dDen;
        }

        return (div);
    }



    public Complex conjugate() {
        Complex conj = new Complex();

        conj.dReal = dReal;
        conj.dImaginary = -dImaginary;

        return (conj);
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Complex complex = (Complex) o;
        return Double.compare(complex.dReal, dReal) == 0 &&
                Double.compare(complex.dImaginary, dImaginary) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dReal, dImaginary);
    }

    public double getdReal() {
        return dReal;
    }

    public double getdImaginary() {
        return dImaginary;
    }

    public void setdReal(double dReal) {
        this.dReal = dReal;
    }

    public void setdImaginary(double dImaginary) {
        this.dImaginary = dImaginary;
    }
}
