public class Song extends SongComponent {
    String songName;
    String bandName;
    int releaseYear;

    public Song(String newSongName, String newBandName, int newReleaseYear) {
        this.songName = newSongName;
        this.bandName = newBandName;
        this.releaseYear = newReleaseYear;
    }

    @Override
    public String getSongName() {
        return songName;
    }

    @Override
    public String getBandName() {
        return bandName;
    }

    @Override
    public int getReleaseYear() {
        return releaseYear;
    }

    public SongComponent displaySongInfo() {
        System.out.println(getSongName() + " was recorded by " +
                getBandName() + " in " + getReleaseYear());
        return null;
    }
}
