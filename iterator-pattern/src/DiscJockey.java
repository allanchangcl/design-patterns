import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class DiscJockey {
    private SongsOfThe70s songs70s;
    private SongsOfThe80s songs80s;
    private SongsOfThe90s songs90s;

    public DiscJockey(SongsOfThe70s newSongs70s, SongsOfThe80s newSongs80s, SongsOfThe90s newSongs90s) {
        songs70s = newSongs70s;
        songs80s = newSongs80s;
        songs90s = newSongs90s;
    }

    public void showTheSongs() {
        ArrayList al70sSongs = songs70s.getBestSongs();
        System.out.println("Songs of the 70s\n");
        for (int i = 0; i < al70sSongs.size(); i++) {
            SongInfo bestSongs = (SongInfo) al70sSongs.get(i);
            System.out.println(bestSongs.getSongName());
            System.out.println(bestSongs.getBandName());
            System.out.println(bestSongs.getYearReleased() + "\n");
        }
        SongInfo[] array80sSongs = songs80s.getBestSongs();
        System.out.println("Songs of the 80s\n");
        for (int j = 0; j < array80sSongs.length; j++) {
            SongInfo bestSongs = array80sSongs[j];
            System.out.println(bestSongs.getSongName());
            System.out.println(bestSongs.getBandName());
            System.out.println(bestSongs.getYearReleased() + "\n");
        }

        Hashtable<Integer, SongInfo> ht90sSongs = songs90s.getBestSongs();
        System.out.println("Songs of the 90s\n");
        for (Enumeration<Integer> e = ht90sSongs.keys(); e.hasMoreElements(); ) {
            SongInfo bestSongs = ht90sSongs.get(e.nextElement());
            System.out.println(bestSongs.getSongName());
            System.out.println(bestSongs.getBandName());
            System.out.println(bestSongs.getYearReleased() + "\n");
        }
    }
}
