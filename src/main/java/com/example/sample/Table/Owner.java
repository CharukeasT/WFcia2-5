package com.example.sample.Table;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "owner")
public class Owner {
	@Id
	@Column(name="ownerId")
	private int ownerId;
	@Column(name="ownerName")
	private String ownerName;
	@Column(name="address")
	private String address;
	@Column(name="mobile")
	private long mobile;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="shop")
	private Shop shop;
	public int getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public Shop getShop() {
		return shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}
	public Owner(int ownerId, String ownerName, String address, long mobile, Shop shop) {
		super();
		this.ownerId = ownerId;
		this.ownerName = ownerName;
		this.address = address;
		this.mobile = mobile;
		this.shop = shop;
	}
	public Owner() {
		
	}
}
