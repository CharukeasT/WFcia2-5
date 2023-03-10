package com.example.sample.Table;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;

@Entity
@Transactional
@Table(name = "shop")
public class Shop {
	@Id
	@Column(name="shopId")
	private int shopId;
	@Column(name="shopName")
	private String shopName;
	@Column(name="place")
	private String place;
	@Column(name="typesAvailable")
	private int typesAvailable;
	public int getShopId() {
		return shopId;
	}
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getTypesAvailable() {
		return typesAvailable;
	}
	public void setTypesAvailable(int typesAvailable) {
		this.typesAvailable = typesAvailable;
	}
	public Shop(int shopId, String shopName, String place, int typesAvailable) {
		super();
		this.shopId = shopId;
		this.shopName = shopName;
		this.place = place;
		this.typesAvailable = typesAvailable;
	}
	public Shop() {
		
	}
}
