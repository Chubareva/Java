public class Track {
    private String name;
    private double duration;
    private MusicStyle style;

    public Track(String name,double duration,MusicStyle style){
        this.duration=duration;
        this.name=name;
        this.style=style;
    }
    public Track(){}

    @Override
    public String toString() {
        return name+ ", "+duration+", "+style;
    }

    public double getDuration() {
        return duration;
    }

    public MusicStyle getStyle() {
        return style;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setDuration(double duration){
        this.duration=duration;
    }
    public void setStyle(MusicStyle style){
        this.style=style;
    }

}
