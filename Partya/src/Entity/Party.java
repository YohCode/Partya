package Entity;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class Party {

	private int PartyNo;
	private String PartyName;
	private int AddressID;
	private Date StartDate;
	private Date EndtDate;
	public HashMap<Integer,AreaOfParty> areas;
	public HashMap<Integer,ParticipantOfParty> participants;
	
	
	/**
	 * @return the participants
	 */
	public HashMap<Integer, ParticipantOfParty> getParticipants() {
		return participants;
	}
	/**
	 * @param participants the participants to set
	 */
	public void setParticipants(HashMap<Integer, ParticipantOfParty> participants) {
		this.participants = participants;
	}
	/**
	 * @param areas the areas to set
	 */
	
	public void setAreas(HashMap<Integer, AreaOfParty> areas) {
		this.areas = areas;
	}
	
	public int getPartyNo() {
		return PartyNo;
	}
	
	public void setPartyNo(int partyNo) {
		PartyNo = partyNo;
	}
	
	public String getPartyName() {
		return PartyName;
	}
	
	public void setPartyName(String partyName) {
		PartyName = partyName;
	}
	
	public int getAddressID() {
		return AddressID;
	}
	
	public void setAddressID(int addressID) {
		AddressID = addressID;
	}
	
	public Date getStartDate() {
		return StartDate;
	}
	
	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}
	
	public Date getEndtDate() {
		return EndtDate;
	}
	
	public void setEndtDate(Date endtDate) {
		EndtDate = endtDate;
	}
	
	
	
	
	/**
	 * @return the areas
	 */
	public boolean addArea(AreaOfParty a) {
		if(a == null)
			return false;
		if(!areas.containsKey(a.getArea().getAreaID())) {
			areas.put(a.getArea().getAreaID(), a);
			return true;
		}
		return false;
	}
	
	public boolean removeArea(AreaOfParty a) {
		if(a == null)
			return false;
		return areas.remove(a.getArea().getAreaID(), a);
	}
	
	public HashMap<Integer, AreaOfParty> getAreas() {
		return areas;
	}
	
	/**
	 * @param areas the areas to set
	 */
	public void setAreas(List<AreaOfParty> areasList) {
		areas.clear();
		for (AreaOfParty a : areasList) {
			areas.put(a.getArea().getAreaID(), a);
		}
	}
	
	public boolean addParticipantOfParty(ParticipantOfParty p) {
		if(p != null) {
			if(!participants.containsKey(p.getParticipantID())) {
				participants.put(p.getParticipantID(), p);
				return true;
			}
		}
		return false;
	}
	
/**
	 * @param partyNo
	 * @param partyName
	 * @param addressID
	 * @param startDate
	 * @param endtDate
	 * @param areas
	 */
	private Party(int partyNo, String partyName, int addressID, Date startDate, Date endtDate,
			List<AreaOfParty> areas) {
		super();
		PartyNo = partyNo;
		PartyName = partyName;
		AddressID = addressID;
		StartDate = startDate;
		EndtDate = endtDate;
		this.areas= new HashMap<Integer, AreaOfParty>();
		this.participants= new HashMap<Integer, ParticipantOfParty>();
		setAreas(areas);
	}
//	public Party(int partyNo, String partyName, int addressID, Date startDate, Date endtDate) {
//		super();
//		PartyNo = partyNo;
//		PartyName = partyName;
//		AddressID = addressID;
//		StartDate = startDate;
//		EndtDate = endtDate;
//	}
	@Override
	public int hashCode() {
		return Objects.hash(AddressID, EndtDate, PartyName, PartyNo, StartDate, areas);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Party other = (Party) obj;
		return AddressID == other.AddressID && Objects.equals(EndtDate, other.EndtDate)
				&& Objects.equals(PartyName, other.PartyName) && PartyNo == other.PartyNo
				&& Objects.equals(StartDate, other.StartDate) && Objects.equals(areas, other.areas);
	}
	@Override
	public String toString() {
		return "Party [PartyNo=" + PartyNo + ", PartyName=" + PartyName + ", AddressID=" + AddressID + ", StartDate="
				+ StartDate + ", EndtDate=" + EndtDate + ", areas=" + areas + ", participants=" + participants + "]";
	}
	
	
	
	
	
}