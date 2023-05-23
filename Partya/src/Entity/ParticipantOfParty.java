package Entity;


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


}