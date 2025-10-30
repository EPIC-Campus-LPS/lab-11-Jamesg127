package Playlist;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class PlaylistRunner {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File file = new File("playlist.txt");
		Scanner scan = new Scanner(file);
		Scanner scanny = new Scanner(System.in);
		System.out.println("Playlist Viewer Menu\r\n"
				+ "(A) View List of Playlists\r\n"
				+ "(B) View a Playlist\r\n"
				+ "(C) Search Songs\r\n"
				+ "(D) Modify a Playlist");
		System.out.print("Select a mode: ");
		String mode = scanny.nextLine();
		String play = "";
		String[] playlist = new String[6];
		if(mode.equals("A")){
			System.out.println("Your Playlists:");
			while(scan.hasNextLine()) {
				play = scan.nextLine();
				if(play.substring(0, 8).equals("Playlist")) {
					System.out.println(" - " + play);
				}
			}
		}

		else if(mode.equals("B")){
			int y = 0;
			System.out.print("Which playlist would you like to view: ");
			int bum = scanny.nextInt();
			bum--;
			while(scan.hasNextLine() && y <= bum) {
				for(int i = 0; i < 6; i++) {
					playlist[i] = scan.nextLine();
				}
				if(y == bum) {
					for(int i = 0; i < 6; i++) {
						System.out.println(playlist[i]);
					}
					
				}
				y++;
			}
		}
		else if(mode.equals("C")) {
			System.out.println("What would you like to search by: ");
			System.out.println("A: Year");
			System.out.println("B: Artist");
			String search = scanny.nextLine();
			if(search.equals("A")) {
				System.out.println("What year would you like to search by?");
				String searchYear = scanny.nextLine();
				System.out.println("Songs from " + searchYear + ":");
				searchYear = " " + searchYear;
				while(scan.hasNextLine()) {
					String v = scan.nextLine();
					String[] songInfo = v.split(",");
					if(!(v.substring(0, 8).equals("Playlist"))) {
						SongSearcher song = new SongSearcher(songInfo[0], songInfo[1], songInfo[2]);
						
						//System.out.println(searchYear);
						//System.out.println(songInfo[2]);
						
						if(searchYear.equals(song.getYear())) {
							System.out.print(song.getSong() + ",");
							System.out.print(song.getArtist() + ",");
							System.out.print(song.getYear() + "; ");
						}
					}
				}
			}
			else if(search.equals("B")){
				System.out.println("What author would you like to search by?");
				String searchArtist = scanny.nextLine();
				System.out.println("Songs by " + searchArtist + ":");
				searchArtist = " " + searchArtist;
				while(scan.hasNextLine()) {
					String v = scan.nextLine();
					String[] songInfo = v.split(",");
					if(!(v.substring(0, 8).equals("Playlist"))) {
						SongSearcher song = new SongSearcher(songInfo[0], songInfo[1], songInfo[2]);
						
						//System.out.println(searchYear);
						//System.out.println(songInfo[2]);
						
						if(searchArtist.equals(song.getArtist())) {
							System.out.print(song.getSong() + ",");
							System.out.print(song.getArtist() + ",");
							System.out.print(song.getYear() + "; ");
						}
					}
				}
			}
		}	
	}
}
