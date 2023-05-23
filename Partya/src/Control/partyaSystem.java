package Control;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import Boundry.Artists_of_area;
import Boundry.Importing_Party_Information;
import Boundry.specific_Party;
import Entity.Address;
import Entity.Area;
import Entity.Artist;
import Entity.District;
import Entity.MusicGenre;
import Entity.Participant;
import Entity.Party;
import Entity.Performance;

abstract public class partyaSystem  {
	private partyaSystem DB;
	//public Importing_Party_Information _unnamed_Importing_Party_Information_;
	//public specific_Party _unnamed_specific_Party_;
	public List<Artists_of_area> artistOfArea;
	public List<Party> parties;
	//public Address _unnamed_Address_;
	public List<Artist> ourArtists;
	//public District _unnamed_District_;
	public List<Area> areas;
	public List<Performance> performances;
	//public MusicGenre _unnamed_MusicGenre_;
	public List<Participant> participants;
	//public Party _unnamed_Party_2;
	//public Artist _unnamed_Artist_2;
	//public Area _unnamed_Area_2;
	
	
	
//	
//	public String SendSecurityPopup() {
//		throw new UnsupportedOperationException();
//	}
//
//	public boolean payToEvent() {
//		throw new UnsupportedOperationException();
//	}
//
//	public String SendNotifacation() {
//		throw new UnsupportedOperationException();
//	}
//
//	public String LocateFriend(Participant aSender) {
//		throw new UnsupportedOperationException();
//	}
//
//	public List<Participant> getPresentParticipant() {
//		throw new UnsupportedOperationException();
//	}
//
//	public List<Participant> getAllowedParticipant() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void ImportLocation(Object aXML_File) {
//		throw new UnsupportedOperationException();
//	}
//
//	public XmlType ExportReservation() {
//		throw new UnsupportedOperationException();
//	}
}

