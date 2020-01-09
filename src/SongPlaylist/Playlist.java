package SongPlaylist;

import java.util.LinkedList;

public class Playlist {
    private String title;
    private LinkedList<Album> albums;

    public Playlist(String title) {
        this.title = title;
        this.albums = new LinkedList<Album>();
    }

    public String getTitle() {
        return title;
    }

    public LinkedList<Album> getAlbums() {
        return albums;
    }


    private Album findAlbum(String albumTitle) {
        for(int i = 0; i < this.albums.size(); i++) {
            Album currAlbum = this.albums.get(i);
            if(currAlbum.getTitle().equals(albumTitle)) {
                return currAlbum;
            }
        }
        return null;
    }
}
