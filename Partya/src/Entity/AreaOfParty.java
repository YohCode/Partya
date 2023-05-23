/**
 * 
 */
package Entity;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/**
 * @author aliab
 *
 */


public class AreaOfParty {
	
	private int partyID;
	private Area area;
	private int maxParticipants;
	private int MaxTickets;
	private boolean hasPerfor;
	private HashMap<Integer, Performance> performances;
	
	
	
	
	/**
	 * @return the hasPerfor
	 */
	public boolean isHasPerfor() {
		return hasPerfor;
	}
	/**
	 * @param hasPerfor the hasPerfor to set
	 */
	public void setHasPerfor(boolean hasPerfor) {
		this.hasPerfor = hasPerfor;
	}
	/**
	 * @return the partyID
	 */
	public int getPartyID() {
		return partyID;
	}
	/**
	 * @return the performances
	 */
	public HashMap<Integer, Performance> getPerformances() {
		return performances;
	}
	/**
	 * @param performances the performances to set
	 */
	public void setPerformances(List<Performance> perfList) {
		if(perfList != null) {
			performances.clear();
			for(Performance p : perfList) {
				performances.put(p.getArtistID(), p);
			}
		}
	}
	/**
	 * @param partyID the partyID to set
	 */
	public void setPartyID(int partyID) {
		this.partyID = partyID;
	}
	public Area getArea() {
		return area;
	}
	public void setArea(Area area) {
		this.area = area;
	}
	public int getMaxParticipants() {
		return maxParticipants;
	}
	public void setMaxParticipants(int maxParticipants) {
		this.maxParticipants = maxParticipants;
	}
	public int getMaxTickets() {
		return MaxTickets;
	}
	public void setMaxTickets(int maxTickets) {
		MaxTickets = maxTickets;
	}
	
	public AreaOfParty(int partyID, Area area, int maxParticipants, int maxTickets, List<Performance> performance) {
		super();
		this.partyID=partyID;
		this.area = area;
		this.maxParticipants = maxParticipants;
		MaxTickets = maxTickets;
		this.performances= new HashMap<Integer, Performance>();
		setPerformances(performance);
	}
	@Override
	public int hashCode() {
		return Objects.hash(MaxTickets, area, maxParticipants, partyID, performances);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AreaOfParty other = (AreaOfParty) obj;
		return MaxTickets == other.MaxTickets && Objects.equals(area, other.area)
				&& maxParticipants == other.maxParticipants && partyID == other.partyID
				&& performances == other.performances;
	}
	@Override
	public String toString() {
		return "AreaOfParty [partyID=" + partyID + ", area=" + area + ", maxParticipants=" + maxParticipants
				+ ", MaxTickets=" + MaxTickets + ", performances=" + performances + "]";
	}
	
	
	
}