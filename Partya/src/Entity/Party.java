package Entity;

import java.util.Date;

public class Party {

	private int PartyNo;
	private String PartyName;
	private int AddressID;
	private Date StartDate;
	private Date EndtDate;
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
	public Party(int partyNo, String partyName, int addressID, Date startDate, Date endtDate) {
		super();
		PartyNo = partyNo;
		PartyName = partyName;
		AddressID = addressID;
		StartDate = startDate;
		EndtDate = endtDate;
	}
	public Party(int partyNo) {
		super();
		PartyNo = partyNo;
	}
	public Party() {
		super();
	}
	
}