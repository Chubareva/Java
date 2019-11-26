import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Disk {
    private List<Track> playList=new ArrayList<>();
    public Disk(){
    }
    public void addTrack(Track track){
        playList.add(track);
    }

    public List<Track> getPlayList() {
        if(playList==null)playList=new ArrayList<>();
        return playList;
    }

    public double getTotalDuration(){
        double totalDuration=0;
        for(Track track:playList)
            totalDuration+=track.getDuration();
        if((totalDuration*100)%100>=60){
            totalDuration=totalDuration+1-((totalDuration*100)%100)/100+(((totalDuration*100)%100)%60)/100;
        }
        return  totalDuration;
    }

}
