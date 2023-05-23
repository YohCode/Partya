package Entity;

import java.util.Date;
import java.util.Objects;

public class Performance {
	
	private int AreaID;
	private int ArtistID;
	private Date EventDate;
	private int StartTime;
	private int EndTime;
	private int NumberOfParticipants;
	private MusicGenre MusicStyle;
	public int getAreaID() {
		return AreaID;
	}
	public void setAreaID(int areaID) {
		AreaID = areaID;
	}
	public int getArtistID() {
		return ArtistID;
	}
	public void setArtistID(int artistID) {
		ArtistID = artistID;
	}
	public Date getEventDate() {
		return EventDate;
	}
	public void setEventDate(Date eventDate) {
		EventDate = eventDate;
	}
	public int getStartTime() {
		return StartTime;
	}
	public void setStartTime(int startTime) {
		StartTime = startTime;
	}
	public int getEndTime() {
		return EndTime;
	}
	public void setEndTime(int endTime) {
		EndTime = endTime;
	}
	public int getNumberOfParticipants() {
		return NumberOfParticipants;
	}
	public void setNumberOfParticipants(int numberOfParticipants) {
		NumberOfParticipants = numberOfParticipants;
	}
	public MusicGenre getMusicStyle() {
		return MusicStyle;
	}
	public void setMusicStyle(MusicGenre musicStyle) {
		MusicStyle = musicStyle;
	}
	public Performance(int areaID, int artistID, Date eventDate, int startTime, int endTime, int numberOfParticipants,
			MusicGenre musicStyle) {
		super();
		AreaID = areaID;
		ArtistID = artistID;
		EventDate = eventDate;
		StartTime = startTime;
		EndTime = endTime;
		NumberOfParticipants = numberOfParticipants;
		MusicStyle = musicStyle;
	}
	@Override
	public int hashCode() {
		return Objects.hash(AreaID, ArtistID, EndTime, EventDate, MusicStyle, NumberOfParticipants, StartTime);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Performance other = (Performance) obj;
		return AreaID == other.AreaID && ArtistID == other.ArtistID && EndTime == other.EndTime
				&& Objects.equals(EventDate, other.EventDate) && MusicStyle == other.MusicStyle
				&& NumberOfParticipants == other.NumberOfParticipants && StartTime == other.StartTime;
	}
	@Override
	public String toString() {
		return "Performance [AreaID=" + AreaID + ", ArtistID=" + ArtistID + ", EventDate=" + EventDate + ", StartTime="
				+ StartTime + ", EndTime=" + EndTime + ", NumberOfParticipants=" + NumberOfParticipants
				+ ", MusicStyle=" + MusicStyle + "]";
	}
	

}
