package com.xworkz.foodItems.entity;

import com.xworkz.foodItems.constants.VendorType;

public class HotelVendorEntity {

	private String name;
	private String location;
	private int rating;
	private VendorType vendorType;
	private long phoneNo;

	public HotelVendorEntity() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@Override
	public String toString() {
		return "HotelVendorEntity [name=" + name + ", location=" + location + ", rating=" + rating + ", vendorType="
				+ vendorType + ", phoneNo=" + phoneNo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int) (phoneNo ^ (phoneNo >>> 32));
		result = prime * result + rating;
		result = prime * result + ((vendorType == null) ? 0 : vendorType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HotelVendorEntity other = (HotelVendorEntity) obj;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phoneNo != other.phoneNo)
			return false;
		if (rating != other.rating)
			return false;
		if (vendorType != other.vendorType)
			return false;
		return true;
	}

	public HotelVendorEntity(String name, String location, int rating, VendorType vendorType, long phoneNo) {
		super();
		System.out.println("created parameterized constructor");
		this.name = name;
		this.location = location;
		this.rating = rating;
		this.vendorType = vendorType;
		this.phoneNo = phoneNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public VendorType getVendorType() {
		return vendorType;
	}

	public void setVendorType(VendorType vendorType) {
		this.vendorType = vendorType;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
}
