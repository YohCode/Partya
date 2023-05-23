/**
 * 
 */
package Entity;

/**
 * @author aliab
 *
 */


public class AreaOfParty {
	
	private Party party;
	private Area area;
	private int maxParticipants;
	private int MaxTickets;
	
	public Party getParty() {
		return party;
	}
	public void setParty(Party party) {
		this.party = party;
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
	
	public AreaOfParty(Party party, Area area, int maxParticipants, int maxTickets) {
		super();
		this.party = party;
		this.area = area;
		this.maxParticipants = maxParticipants;
		MaxTickets = maxTickets;
	}
	public AreaOfParty(Party party, Area area) {
		super();
		this.party = party;
		this.area = area;
	}
	public AreaOfParty() {
		super();
	}
	

	
}