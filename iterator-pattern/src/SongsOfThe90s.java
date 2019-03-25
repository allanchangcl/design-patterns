import java.util.Hashtable;
import java.util.Iterator;

public class SongsOfThe90s {
    Hashtable<Integer, SongInfo> bestSongs = new Hashtable<Integer, SongInfo>();

    int hashKey = 0;

    public SongsOfThe90s() {
        addSong("Losing My Religion", "REM", 1991);
        addSong("Creep", "Radiohead", 1993);
        addSong("Walk on the Ocean", "Toad The Wet Sprocket", 1991);
    }

    // Add a SongInfo object to the end of the ArrayList
    public void addSong(String songName, String bandName, int yearReleased) {
        SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);
        bestSongs.put(hashKey, songInfo);
        hashKey++;
    }

    public Hashtable<Integer, SongInfo> getBestSongs() {
        return bestSongs;
    }
}



