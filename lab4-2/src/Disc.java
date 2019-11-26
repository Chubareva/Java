import java.util.ArrayList;
import java.util.List;


public class Disc {
    private List<Track> tracklist = new ArrayList<>();
    private MusicService service = new MusicService();

    public Disc() {
        tracklist.add(new Track("Lil baby - Trip to hatd ", 2.49, MusicStyles.ROCK));
        tracklist.add(new Track("Twenty One Pilots – Stressed out ", 3.22, MusicStyles.RAP_AND_HIPHOP));
        tracklist.add(new Track("Nickback - Funky Monkeys", 3.55, MusicStyles.ROCK));
        tracklist.add(new Track("Twenty One Pilots – Heavydirtysoul ", 3.03, MusicStyles.RAP_AND_HIPHOP));
        tracklist.add(new Track("Bishop Briggs - River", 3.51, MusicStyles.POP));
        tracklist.add(new Track("Nickback - Hero ", 3.21, MusicStyles.ROCK));
        tracklist.add(new Track("Shakira - Waka waka ", 3.22, MusicStyles.POP));
        tracklist.add(new Track("Paramore - Hard times", 4.35, MusicStyles.POP));

        service.getTracklist(tracklist);
        service.getTotalDuration(tracklist);
        service.sortingByStyle(tracklist, MusicStyles.ROCK);
        service.findByRange(2.00, 3.00, tracklist);

    }
}