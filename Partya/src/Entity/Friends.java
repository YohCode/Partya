package Entity;


public class Friends {
	private int ParticipantID;
	private int PhoneNumber;
	private String Location;
	
	public int getParticipantID() {
		return ParticipantID;
	}
	public void setParticipantID(int participantID) {
		ParticipantID = participantID;
	}
	public int getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	
	public Friends(int participantID, int phoneNumber, String location) {
		super();
		ParticipantID = participantID;
		PhoneNumber = phoneNumber;
		Location = location;
	}
	public Friends(int phoneNumber) {
		super();
		PhoneNumber = phoneNumber;
	}
	public Friends() {
		super();
	}
	


}
