/**
 * 
 */

/**
 * @author atdp-11 Alyssa Lo
 *
 */
public class DownloadInfo {
	// this method creates a new instance with the given unique title and
	// sets the number of times downloaded to 1
	// @param: title - the unique title of the downloaded song
	
	String title;
	int downloaded;
		
	public DownloadInfo (String title) {
		// implementation not shown
	
		this.title = title;
	}
	// @return - the title
	public String getTitle() {
		// implementation not shown
		
		return this.title;
	}
	// increment the number of times downloaded by 1
	public void incrementTimesDownloaded() {
		// implementation not shown
		
		downloaded++;
	}
}