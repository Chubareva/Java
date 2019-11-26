

import java.util.List;

public class ListAdd {

    public   static List<Ratio> addEvenIndex(List<Ratio> a) {

        for(int i=0;i<a.size()-1;i+=2)
        {
            a.set(i,a.get(i).add(a.get(i+1)));
        }
        for(int i=0;i<a.size();i++)
        {
            a.set(i,Ratio.simplify(a.get(i)));
        }
        return a;
    }
}
