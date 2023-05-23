package partyaEntity;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class Participant {
	
	private int ParticipantID;
	private String FirstName;
	private String LastName;
	private int PhoneNumber;
	private Date DateOfBirth;
	private GenderType Gender;
	private Date Regestration;
	private boolean Vip;
	private Friends friends;
	
	public int getParticipantID() {
		return ParticipantID;
	}
	public void setParticipantID(int participantID) {
		ParticipantID = participantID;
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
	public int getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public Date getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public GenderType getGender() {
		return Gender;
	}
	public void setGender(GenderType gender) {
		Gender = gender;
	}
	public Date getRegestration() {
		return Regestration;
	}
	public void setRegestration(Date regestration) {
		Regestration = regestration;
	}
	public boolean isVip() {
		return Vip;
	}
	public void setVip(boolean vip) {
		Vip = vip;
	}
	
	/**
	 * @return the friends
	 */
	public Friends getFriends() {
		return friends;
	}
	/**
	 * @param friends the friends to set
	 */
	public void setFriends(Friends friends) {
		this.friends = friends;
	}
	
	public Participant(int participantID, String firstName, String lastName, int phoneNumber, Date dateOfBirth,
			GenderType gender, Date regestration, boolean vip) {
		super();
		ParticipantID = participantID;
		FirstName = firstName;
		LastName = lastName;
		PhoneNumber = phoneNumber;
		DateOfBirth = dateOfBirth;
		Gender = gender;
		Regestration = regestration;
		Vip = vip;
		friends= new Friends(participantID);
	}
	
	
	public boolean addFriendList(List<Location> listo) {
		if(listo != null) {
			for(Location loc: listo){
				if(!friends.addFriend(loc.getPhoneNumber(), loc)) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(DateOfBirth, FirstName, Gender, LastName, ParticipantID, PhoneNumber, Regestration, Vip,
				friends);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Participant other = (Participant) obj;
		return Objects.equals(DateOfBirth, other.DateOfBirth) && Objects.equals(FirstName, other.FirstName)
				&& Gender == other.Gender && Objects.equals(LastName, other.LastName)
				&& ParticipantID == other.ParticipantID && PhoneNumber == other.PhoneNumber
				&& Objects.equals(Regestration, other.Regestration) && Vip == other.Vip
				&& Objects.equals(friends, other.friends);
	}
	@Override
	public String toString() {
		return "Participant [ParticipantID=" + ParticipantID + ", FirstName=" + FirstName + ", LastName=" + LastName
				+ ", PhoneNumber=" + PhoneNumber + ", DateOfBirth=" + DateOfBirth + ", Gender=" + Gender
				+ ", Regestration=" + Regestration + ", Vip=" + Vip + ", friends=" + friends + "]";
	}
	
	
}