/**
 * 
 */
package Entity;

import java.util.Objects;

/**
 * @author aliab
 *
 */


public class Area {
	
	private int AreaID;
	private String AreaName;
	private int TicketPrice;
	private int AreaSize;
	
	public int getAreaID() {
		return AreaID;
	}
	public void setAreaID(int areaID) {
		AreaID = areaID;
	}
	public String getAreaName() {
		return AreaName;
	}
	public void setAreaName(String areaName) {
		AreaName = areaName;
	}
	public int getTicketPrice() {
		return TicketPrice;
	}
	public void setTicketPrice(int ticketPrice) {
		TicketPrice = ticketPrice;
	}
	public int getAreaSize() {
		return AreaSize;
	}
	public void setAreaSize(int areaSize) {
		AreaSize = areaSize;
	}
	public Area(int areaID, String areaName, int ticketPrice, int areaSize) {
		super();
		AreaID = areaID;
		AreaName = areaName;
		TicketPrice = ticketPrice;
		AreaSize = areaSize;
	}
	@Override
	public String toString() {
		return "Area [AreaID=" + AreaID + ", AreaName=" + AreaName + ", TicketPrice=" + TicketPrice + ", AreaSize="
				+ AreaSize + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(AreaID, AreaName, AreaSize, TicketPrice);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Area other = (Area) obj;
		return AreaID == other.AreaID && Objects.equals(AreaName, other.AreaName) && AreaSize == other.AreaSize
				&& TicketPrice == other.TicketPrice;
	}
	
	
}