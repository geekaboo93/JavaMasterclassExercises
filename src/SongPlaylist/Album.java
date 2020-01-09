package SongPlaylist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String albumTitle;
    private String artist;
    private ArrayList<Song> song;

    public Album(String albumTitle,String artist) {
        this.albumTitle = albumTitle;
        this.artist = artist;
        this.song = new ArrayList<Song>();
    }

    public String getTitle() {
        return albumTitle;
    }

    public ArrayList<Song> getSong() {
        return song;
    }

    public boolean addSong(String songTitle, double duration) {
        if(findSong(songTitle) == null) {
            this.song.add(new Song(songTitle, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String songTitle) {
        for(int i = 0; i < this.song.size(); i ++) {
            Song currSong = this.song.get(i);
            if(currSong.getTitle().equals(songTitle)) {
                return currSong;
            }
        }
        return null;
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist ) {
        int index = trackNumber - 1;
        if((index >= 0) && (index <= this.song.size())) {
            playlist.add(this.song.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playlist) {
        Song checkedSong = findSong(title);
        if(checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }
}
