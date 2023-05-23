package Entity;

import java.util.Date;

public class Participant {
	
	protected int ParticipantID;
	protected String FirstName;
	protected String LastName;
	protected int PhoneNumber;
	protected Date DateOfBirth;
	protected GenderType Gender;
	protected Date Regestration;
	protected boolean Vip;
	
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
	}
	public Participant(int participantID) {
		super();
		ParticipantID = participantID;
	}
	public Participant() {
		super();
	}
	
	
}