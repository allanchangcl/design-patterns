public class DiscJockey {
    SongComponent songList;

    public DiscJockey(SongComponent newSongList) {
        this.songList = newSongList;
    }

    public void getSongList() {
        songList.displaySongInfo();
    }
}
