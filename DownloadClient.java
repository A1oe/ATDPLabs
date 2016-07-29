import java.util.ArrayList;

/**
 * 
 */

/**
 * @author atdp-11 Alyssa Lo
 *
 */
public class DownloadClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SpotifyDownloads spotify = new SpotifyDownloads();
		
		ArrayList<String> songs = new ArrayList<String>();
		
		songs.add("Your hand in mine");
		songs.add("postcards from 1952");
		
		spotify.updateDownloads(songs);
		spotify.updateDownloads(songs);
		
		songs.add("winter");
		
		spotify.updateDownloads(songs);
		
		for (int i = 0; i < songs.size(); i++){
			System.out.println(songs.get(i));
		}
	}

}

