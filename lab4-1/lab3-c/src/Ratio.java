import java.util.Objects;
import java.util.logging.LogManager;
import java.util.logging.Logger;


public class Ratio {
    static final Logger log = LogManager.getLogger(Ratio.class);
    protected Complex divident;
    protected Complex divisor;

    public Ratio(Complex divident,Complex divisor)
    {

        this.divident=divident;
        this.divisor=divisor;
        log.info("Ratio object created");
    }
    public Ratio()
    {
        this.divident=null;
        this.divisor=null;
        log.info("Ratio object created");
    }

    public static  Ratio simplify(Ratio given)
    {
        if(given.divisor.dImaginary!=0)
        {
            given.divident = given.divident.mult(given.divisor.conjugate());
            given.divisor = given.divisor.mult(given.divisor.conjugate());
        }
        for(int i=1;i<=given.divident.dReal||i<=given.divident.dImaginary||i<=given.divisor.dReal;i++)
        {
            if(given.divident.dReal%i==0&&given.divident.dImaginary%i==0&&given.divisor.dReal%i==0)
            {
                given.divident.dReal=given.divident.dReal/i;
                given.divident.dImaginary=given.divident.dImaginary/i;
                given.divisor.dReal=given.divisor.dReal/i;
                i=1;
            }
        }
        log.info("Ratio Simplify method used");
        return given;
    }

    public Ratio add(Ratio b)
    {
        Ratio result=new Ratio();
        if(this.divisor.equals(b.divisor))
        {
            result.divisor=this.divisor;
            result.divident=this.divident.add(b.divident);
        }
        else {
            this.divident = this.divident.mult(this.divisor.conjugate());
            this.divisor = this.divisor.mult(this.divisor.conjugate());
            b.divident = b.divident.mult(b.divisor.conjugate());
            b.divisor = b.divisor.mult(b.divisor.conjugate());
            result.divident = this.divident.mult(b.divisor).add(b.divident.mult(this.divisor));
            result.divisor = new Complex(this.divisor.dReal * b.divisor.dReal, 0);
        }
        log.info("Ratio Add method used");
        return result;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ratio ratio = (Ratio) o;
        return Objects.equals(divident, ratio.divident) &&
                Objects.equals(divisor, ratio.divisor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(divident, divisor);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(divident);
        sb.append(" / ").append(divisor);
        return sb.toString();
    }

    public Complex getDivident() {
        return divident;
    }

    public void setDivident(Complex divident) {
        this.divident = divident;
    }

    public Complex getDivisor() {
        return divisor;
    }

    public void setDivisor(Complex divisor) {
        this.divisor = divisor;
    }
}
