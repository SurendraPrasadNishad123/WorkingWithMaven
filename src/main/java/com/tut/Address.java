package com.tut;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
public class Address {
	@Id
	@Column(name="address_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 private int addressId;

	@Column(length=50)
 private String Street;
	
	@Column(length=50)
 private String City;
	
	@Column(length=50)
 private String Country;
 
	@Column(name="Open")
 private boolean isOpen;
 
	@Transient
 private double x;
 
	@Column(name="Added_Date")
    @Temporal(TemporalType.DATE)
 private Date addedDate;

	@Lob
 private byte[] Image;

	public Address() {
	super();
	// TODO Auto-generated constructor stub
}

	public Address(int addressId, String street, String city, String country, boolean isOpen, double x, Date addedDate,
		byte[] image) {
	super();
	this.addressId = addressId;
	this.Street = street;
	this.City = city;
	this.Country = country;
	this.isOpen = isOpen;
	this.x = x;
	this.addedDate = addedDate;
	this.Image = image;
}

	public int getAddressId() {
	return addressId;
}

	public void setAddressId(int addressId) {
	this.addressId = addressId;
}

	public String getStreet() {
	return Street;
}

	public void setStreet(String street) {
	this.Street = street;
}

	public String getCity() {
	return City;
}

	public void setCity(String city) {
	this.City = city;
}

	public String getCountry() {
	return Country;
}

	public void setCountry(String country) {
	this.Country = country;
}

	public boolean isOpen() {
	return isOpen;
}

	public void setOpen(boolean isOpen) {
	this.isOpen = isOpen;
}

	public double getX() {
	return x;
}

	public void setX(double x) {
	this.x = x;
}

	public Date getAddedDate() {
	return addedDate;
}

	public void setAddedDate(Date addedDate) {
	this.addedDate = addedDate;
}

	public byte[] getImage() {
	return Image;
}

	public void setImage(byte[] image) {
	this.Image = image;
}
  
  
}
