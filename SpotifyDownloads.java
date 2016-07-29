/**
 * 
 */

/**
 * @author atdp-11 Alyssa Lo
 *
 */

import java.util.ArrayList;
public class SpotifyDownloads {
	// the list of downloaded information
	// guaranteed not to be null and not contain duplicate titles
	private ArrayList<DownloadInfo> downloadList;

	// creates the list of downloaded information
	public SpotifyDownloads () {
		downloadList = new ArrayList<DownloadInfo>();
	}

	// returns a reference to the DownloadInfo object with the requested title
	// if it exists
	// @param: title - the requested title
	// @return: - a reference to the DownloadInfo object with the title that
	// matches the parameter title if it exists in the list; null
	// otherwise
	public DownloadInfo getDownloadInfo (String title) {
		// implement this in part (a)

		for (int i = 0; i < downloadList.size(); i++){ // Go through each element
			String name = downloadList.get(i).getTitle(); // Gets Title

			if (name.equals(title)){ // Return Titles That Are = to title
				return downloadList.get(i);
			}
		}
		return null;

	}
	// updates downloadList with information from titles.
	// @param: titles - a list of song titles
	// postcondition:
	// - there are no duplicate titles in downloadList
	// - no entries were removed from downloadList
	// - all songs in titles are represented in downloadList
	// - for each existing entry in downloadList, the download count is
	// is increased by the number of times its title appeared in titles
	// - the order of the existing entries in downloadList is not changed
	// - the first time an object with a title from titles is added to
	// downloadList, it is added to the end of the list
	// - new entries in downloadList appear in the same order
	// - for each new entry in downloadList, the download count is equal to
	// the number of times its title appeared in titles

	public void updateDownloads (ArrayList<String> titles) {
		// implement this in part (b)

		for (int i = 0; i < titles.size(); i++){ // Go Through Each Element
			String name = titles.get(i); 
			
			if (getDownloadInfo(name) == null){ // Plug name Into getDownloadInfo & Check if null
				DownloadInfo newSong = new DownloadInfo(name); // New DownloadInfo Object
				
				downloadList.add(newSong); 
			} else {
				downloadList.get(i).incrementTimesDownloaded(); // +1 To Whichever Is Repeated
			}
		}


	}
}