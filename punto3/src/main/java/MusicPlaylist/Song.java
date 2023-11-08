package MusicPlaylist;

public class Song {

    private String name;
    private String singer;

    public Song(String name, String singer) {
        this.name = name;
        this.singer = singer;
    }

    public String getName() {
        return name;
    }

    public String showSongData(){
        return "cancion: " + this.name + " del cantante: " + this.singer;
    }


}
