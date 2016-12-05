package com.niit.upholsteryback.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "ShippingAddress")
@Component

public class ShippingAddress {
	
	 @Id
	 @Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int shippingaddressid;
	 @Column
		private int id;
	 @Column
		private int userid ; 
	 @Column
		private int price;
	 @Column
		private int mobilenumber;
	 @Column
		private String address;
	   
		
	public int getShippingAddressId() {
		return  shippingaddressid;
	}
	public void setShippingAddressId(int shippingaddressid) {
		this. shippingaddressid = shippingaddressid;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userid;
	}
	public void setUserId(int userid) {
		this.userid = userid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getMobileNumber() {
		return mobilenumber;
	}
	public void setMobileNumber(int mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	}



