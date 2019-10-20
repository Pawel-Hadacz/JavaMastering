package mastering.repetition;

import java.util.ArrayList;

public class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
        this.songs = new ArrayList<Song>();
    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    ArrayList<Song> songs = new ArrayList<>();
    private void addSong(Song song){
        songs.add(song);
    }
    private Song findSong(String title, double duration){
        return new Song(title,duration);
    }

    @Override
    public String toString() {
        return this.title + ": " + this.duration;
    }
}
