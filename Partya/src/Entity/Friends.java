package Entity;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class Friends {
	private int ParticipantID;
	private HashMap<Integer, Location> friendList;
	
	
	
	public int getParticipantID() {
		return ParticipantID;
	}
	public void setParticipantID(int participantID) {
		ParticipantID = participantID;
	}
	
	
	/**
	 * @return the friendList
	 */
	public HashMap<Integer, Location> getFriendList() {
		return friendList;
	}
	/**
	 * @param friendList the friendList to set
	 */
	public void setFriendList(List<Location>friendLoc ){
		friendList.clear();
		for(Location loc : friendLoc){
			friendList.put(loc.getPhoneNumber(), loc);
		}
	}
	
	
	public Friends(int participantID, List<Location>friendLoc) {
		super();
		ParticipantID = participantID;
		this.friendList= new HashMap<Integer, Location>();
		setFriendList(friendLoc);
	}
	
	public Friends(int participantID) {
		super();
		ParticipantID = participantID;
		this.friendList= new HashMap<Integer, Location>();
	}
	
	
	public boolean addFriend(Participant p, Location loc) {
		if(p == null || loc == null)
			return false;
		if(!friendList.containsKey(p.getPhoneNumber())) {
			friendList.put(p.getPhoneNumber(), loc);
			return true;
		}
		return false;
	}
	
	public boolean addFriend(int p, Location loc) {
		if(p < 0 || loc == null)
			return false;
		if(!friendList.containsKey(p) ){
			friendList.put(p, loc);
			return true;
		}
		return false;
	}
	
	public boolean removeFriend(int phoneNumber) {
		if(phoneNumber >0) {
			if(friendList.containsKey(phoneNumber))
				return friendList.remove(phoneNumber, friendList);
		}
		return false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(ParticipantID, friendList);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Friends other = (Friends) obj;
		return ParticipantID == other.ParticipantID && Objects.equals(friendList, other.friendList);
	}
	@Override
	public String toString() {
		return "Friends [ParticipantID=" + ParticipantID + ", friendList=" + friendList + "]";
	}
	
}
