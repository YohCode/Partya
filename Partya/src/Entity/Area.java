/**
 * 
 */
package Entity;

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
	public Area(int areaID) {
		super();
		AreaID = areaID;
	}
	public Area() {
		super();
	}
	
}