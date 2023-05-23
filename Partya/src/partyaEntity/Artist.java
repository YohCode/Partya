/**
 * 
 */
package partyaEntity;

import java.util.Objects;

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
	@Override
	public int hashCode() {
		return Objects.hash(ArtistID, FirstName, LastName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artist other = (Artist) obj;
		return ArtistID == other.ArtistID && Objects.equals(FirstName, other.FirstName)
				&& Objects.equals(LastName, other.LastName);
	}
	@Override
	public String toString() {
		return "Artist [ArtistID=" + ArtistID + ", FirstName=" + FirstName + ", LastName=" + LastName + "]";
	}
	
	
}