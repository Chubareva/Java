
import java.util.Comparator;

public class SortByMusicStyle implements Comparator<Track> {
    public int compare(Track temp, Track temp1) {
        if( temp.getStyle().ordinal()< temp1.getStyle().ordinal())
            return 1;
        else if(temp.getStyle().ordinal() > temp1.getStyle().ordinal())
            return -1;
        else
            return 1;
    }

}
