/**
 * 
 */
package partyaEntity;

import java.util.Objects;

/**
 * @author aliab
 *
 */

public class Address {
	
	private int AddressId;
	private String Street;
	private int BuldingNo;
	private String City;
	private District AddressDistrict;
	
	public int getAddressId() {
		return AddressId;
	}
	public void setAddressId(int addressId) {
		AddressId = addressId;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public int getBuldingNo() {
		return BuldingNo;
	}
	public void setBuldingNo(int buldingNo) {
		BuldingNo = buldingNo;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public District getAddressDistrict() {
		return AddressDistrict;
	}
	public void setAddressDistrict(District addressDistrict) {
		AddressDistrict = addressDistrict;
	}
	public Address(int addressId, String street, int buldingNo, String city, District addressDistrict) {
		super();
		AddressId = addressId;
		Street = street;
		BuldingNo = buldingNo;
		City = city;
		AddressDistrict = addressDistrict;
	}
	
	@Override
	public String toString() {
		return "Address [AddressId=" + AddressId + ", Street=" + Street + ", BuldingNo=" + BuldingNo + ", City=" + City
				+ ", AddressDistrict=" + AddressDistrict + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(AddressDistrict, AddressId, BuldingNo, City, Street);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return AddressDistrict == other.AddressDistrict && AddressId == other.AddressId && BuldingNo == other.BuldingNo
				&& Objects.equals(City, other.City) && Objects.equals(Street, other.Street);
	}
	
	
}