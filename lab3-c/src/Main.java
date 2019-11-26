import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Ratio a=new Ratio(new Complex(1,2),new Complex(4,4 ));
        Ratio b=new Ratio(new Complex(1,2),new Complex(2,2));
        //   Ratio c=a.add(b);
        //  a=a.add(b);
        Ratio d=new Ratio(new Complex(1,2),new Complex(2,2));
        Ratio f=new Ratio(new Complex(1,2),new Complex(2,2));

        List<Ratio> result= Arrays.asList(a,b,d,f);

        result=ListAdd.addEvenIndex(result);
        System.out.println(result);
    }
}
