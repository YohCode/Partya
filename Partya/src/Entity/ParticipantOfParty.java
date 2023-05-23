package Entity;

import java.util.Objects;

public class ParticipantOfParty {
	private int partyID;
	private int participantID;
	private int ticketINo;
	private String location;
	private String status;
	
	public int getPartyID() {
		return partyID;
	}
	public void setPartyID(int partyID) {
		this.partyID = partyID;
	}
	public int getParticipantID() {
		return participantID;
	}
	public void setParticipantID(int participantID) {
		this.participantID = participantID;
	}
	public int getTicketINo() {
		return ticketINo;
	}
	public void setTicketINo(int ticketINo) {
		this.ticketINo = ticketINo;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public ParticipantOfParty(int partyID, int participantID, int ticketINo, String location, String status) {
		super();
		this.partyID = partyID;
		this.participantID = participantID;
		this.ticketINo = ticketINo;
		this.location = location;
		this.status = status;
	}
	public ParticipantOfParty(int partyID, int participantID) {
		super();
		this.partyID = partyID;
		this.participantID = participantID;
	}
	public ParticipantOfParty() {
		super();
	}
	@Override
	public int hashCode() {
		return Objects.hash(location, participantID, partyID, status, ticketINo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ParticipantOfParty other = (ParticipantOfParty) obj;
		return Objects.equals(location, other.location) && participantID == other.participantID
				&& partyID == other.partyID && Objects.equals(status, other.status) && ticketINo == other.ticketINo;
	}
	@Override
	public String toString() {
		return "ParticipantOfParty [partyID=" + partyID + ", participantID=" + participantID + ", ticketINo="
				+ ticketINo + ", location=" + location + ", status=" + status + "]";
	}
	
	

}