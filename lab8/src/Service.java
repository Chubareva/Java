
import java.util.*;

public class Service {
    public Disk sortByMusicStyle(Disk disk){
        Collections.sort(disk.getPlayList(),new SortByMusicStyle());
        return disk;
    }

    public void findByRange(List<Track> trackList,final double FROM,final double TO){
        List<Track> tracksInRange=new ArrayList<>();

        for(Track track:trackList){
            if(track.getDuration()>=FROM && track.getDuration()<=TO)
                tracksInRange.add(track);
        }

        if(tracksInRange==null) System.out.println("Треков соответсвующим этому диапозону не найдено");
        printTrackList(tracksInRange);
    }
    public void printTrackList(List<Track> trackList){
        int i=0;
        for(Track track:trackList){
            System.out.println(i+": "+track.toString());
            i++;
        }
    }
    public Track addingNewTrack(){
        Scanner in=new Scanner(System.in);
        System.out.println("\f");
        String trackName="";double trackDuration;
        MusicStyle style;

        System.out.println("Введите название трека :");
        do{
            trackName=in.nextLine();
            if(trackName.matches("\\w+\\s[-]\\s\\w+")) break;
            else{
                System.out.println("Повторите ввод :");
            }
        }
        while(true);

        System.out.println("Введите длительность трека :");
        do{
            try{
                Scanner sc=new Scanner(System.in);
                trackDuration=sc.nextDouble();
                if(trackDuration>0)break;
            }
            catch (InputMismatchException e){}
            System.out.println("Ошибка ввода ,повторите");
        }
        while(true);

        System.out.println("Укажите стиль :");
        do{ int i=0;
            for(MusicStyle stl:MusicStyle.values()) {
                System.out.println(i+":"+stl);i++;
            }
            try{
                Scanner sc=new Scanner(System.in);
                int choice=sc.nextInt();
                if(choice<MusicStyle.values().length && choice>=0){
                    style=MusicStyle.getMusicStyle(choice);
                    break;
                }
            }
            catch (InputMismatchException e){}
            System.out.println("Ошибка ввода ,повторите");
        }
        while (true);

        return new Track(trackName,trackDuration,style);
    }


}
