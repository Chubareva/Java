public enum MusicStyle {
    CLASSIC, ELECTRONIC, JAZZ, RAP_AND_HIPHOP, ALTERNATIVE, METAL, REGGAE, PUNK, ROCK, POP;

    public static MusicStyle getMusicStyle(int index){
        for(MusicStyle style:MusicStyle.values()){
            if(style.ordinal()==index)return style;
        }
        return  CLASSIC;
    }
}
