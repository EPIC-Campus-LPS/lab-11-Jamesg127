package Playlist;

public class SongSearcher {
	private String songName;
	private String artistName;
	private String year;
	
	public SongSearcher(String s, String a, String y) {
		songName = s;
		artistName = a;
		year = y;
	}
	public String getYear() {
		return year;
	}
}
