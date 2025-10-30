package Playlist;

public class SongSearcher {
	private String song;
	private String artist;
	private String year;
	
	public SongSearcher(String s, String a, String y) {
		song = s;
		artist = a;
		year = y;
	}
	public String getYear() {
		return year;
	}
	public String getArtist() {
		return artist;
	}
	public String getSong() {
		return song;
	}
}
