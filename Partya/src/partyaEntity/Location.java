/**
 * 
 */
package partyaEntity;

import java.sql.Time;
import java.util.Date;
import java.util.Objects;

/**
 * @author aliab
 *
 */
public class Location {
	private String location;
	private int phoneNumber;
	private Date lastModDate;
	private Time lastModTime;
	private AreaOfParty area;
	/**
	 * @param location
	 * @param phoneNumber
	 * @param lastModDate
	 * @param lastModTime
	 * @param area
	 */
	private Location(String location, int phoneNumber, Date lastModDate, Time lastModTime, AreaOfParty area) {
		super();
		this.location = location;
		this.phoneNumber = phoneNumber;
		this.lastModDate = lastModDate;
		this.lastModTime = lastModTime;
		this.area = area;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * @return the phoneNumber
	 */
	public int getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * @return the lastModDate
	 */
	public Date getLastModDate() {
		return lastModDate;
	}
	/**
	 * @param lastModDate the lastModDate to set
	 */
	public void setLastModDate(Date lastModDate) {
		this.lastModDate = lastModDate;
	}
	/**
	 * @return the lastModTime
	 */
	public Time getLastModTime() {
		return lastModTime;
	}
	/**
	 * @param lastModTime the lastModTime to set
	 */
	public void setLastModTime(Time lastModTime) {
		this.lastModTime = lastModTime;
	}
	/**
	 * @return the area
	 */
	public AreaOfParty getArea() {
		return area;
	}
	/**
	 * @param area the area to set
	 */
	public void setArea(AreaOfParty area) {
		this.area = area;
	}
	@Override
	public int hashCode() {
		return Objects.hash(area, lastModDate, lastModTime, location, phoneNumber);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Location other = (Location) obj;
		return Objects.equals(area, other.area) && Objects.equals(lastModDate, other.lastModDate)
				&& Objects.equals(lastModTime, other.lastModTime) && Objects.equals(location, other.location)
				&& phoneNumber == other.phoneNumber;
	}
	@Override
	public String toString() {
		return "Location [location=" + location + ", phoneNumber=" + phoneNumber + ", lastModDate=" + lastModDate
				+ ", lastModTime=" + lastModTime + ", area=" + area + "]";
	}
	
	
}
