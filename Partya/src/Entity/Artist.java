/**
 * 
 */
package Entity;

/**
 * @author aliab
 *
 */

public class Artist {
	
	private int ArtistID;
	private String FirstName;
	private String LastName;
	
	public int getArtistID() {
		return ArtistID;
	}
	public void setArtistID(int artistID) {
		ArtistID = artistID;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public Artist(int artistID, String firstName, String lastName) {
		super();
		ArtistID = artistID;
		FirstName = firstName;
		LastName = lastName;
	}
	public Artist(int artistID) {
		super();
		ArtistID = artistID;
	}
	public Artist() {
		super();
	}
	
}