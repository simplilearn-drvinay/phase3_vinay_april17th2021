package com.app.model;

public class Address {

	private int aid;
	private String cityName;
	private String state;
	private int zip;
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(int aid, String cityName, String state, int zip) {
		super();
		this.aid = aid;
		this.cityName = cityName;
		this.state = state;
		this.zip = zip;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", cityName=" + cityName + ", state=" + state + ", zip=" + zip + "]";
	}
	
}
