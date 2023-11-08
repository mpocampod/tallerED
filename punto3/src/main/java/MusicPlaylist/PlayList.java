package MusicPlaylist;

import java.util.LinkedList;
import java.util.Queue;

public class PlayList {

    private Queue<Song> musicList;

    public PlayList() {
        this.musicList = new LinkedList();
    }

    public void addSong(Song song){
        this.musicList.add(song);
    }

    public void playSong(){
        Song song;
        int i;

        for (i = musicList.size(); i > 0; i--) {
            System.out.println("Estas escuchando la " + musicList.peek().showSongData());
            song = musicList.remove();
            musicList.add(song);
        }
    }

    public void deleteSong(String songName){
        Boolean isSongInList = false;
        for (Song song : musicList) {
            if(song.getName().equalsIgnoreCase(songName)) {
                isSongInList = true;
                musicList.remove(song);
                System.out.println("La canción " + songName + " ha sido eliminada");
            }
        }
        if(!isSongInList){
            System.out.println("La canción " + songName + " no se encuentra en la lista");
        }
    }

    public boolean isEmpty(){
        return musicList.isEmpty();
    }

}
