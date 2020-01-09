package SongPlaylist;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();


    public static void main(String[] args) {
        Album album = new Album("reputation", "Taylor Swift");
        album.addSong("End Game", 4.16);
        album.addSong("I Did Something Bad", 3.22);
        album.addSong("Delicate", 3.15);
        album.addSong("Gorgeous", 3.55);
        album.addSong("Getaway Car", 3.18);
        album.addSong("Dress", 3.29);
        albums.add(album);

        album = new Album("Stories", "Avicii");
        album.addSong("Waiting For Love", 4.16);
        album.addSong("Talk To Myself", 3.22);
        album.addSong("Touch Me", 3.15);
        album.addSong("Ten More Days", 3.55);
        album.addSong("Sunset Jesus", 3.18);
        album.addSong("Trouble", 3.29);
        albums.add(album);


        LinkedList<Song> playlist = new LinkedList<Song>();
        albums.get(0).addToPlaylist("Gorgeous",playlist);
        albums.get(0).addToPlaylist("Delicate",playlist);
        albums.get(1).addToPlaylist(3,playlist);

        play(playlist);
    }

    private static void play(LinkedList<Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playlist.listIterator();
        if(playlist.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
        }

        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete. ");
                    quit = true;
                    break;
                case 1:
                    if(!forward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the start of the playlist: ");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                            forward = true;
                        }
                    } else {
                        if(listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next().toString());
                        } else {
                            System.out.println("We have reached the end of the playlist");
                        }
                    }
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playlist.size() >0) {
                        listIterator.remove();
                        if(listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if(listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\n press");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs is the playlist\n" +
                "5 - print available actions.\n" +
                "6 - delete current song"
        );
    }

    private static void printList(LinkedList<Song> playlist) {
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("==================================");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("==================================");
    }
}
