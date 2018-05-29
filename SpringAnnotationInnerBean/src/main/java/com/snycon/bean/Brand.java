package com.snycon.bean;

public class Brand {

	
	private String brand_name;
	private double staring_price;
	@Override
	public String toString() {
		return "Brand [brand_name=" + brand_name + ", staring_price=" + staring_price + ", highest_price="
				+ highest_price + ", manifaturedby=" + manifaturedby + "]";
	}
	private double highest_price;
    private String manifaturedby;
	public String getBrand_name() {
		return brand_name;
	}
	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}
	public double getStaring_price() {
		return staring_price;
	}
	public void setStaring_price(double staring_price) {
		this.staring_price = staring_price;
	}
	public double getHighest_price() {
		return highest_price;
	}
	public void setHighest_price(double highest_price) {
		this.highest_price = highest_price;
	}
	public String getManifaturedby() {
		return manifaturedby;
	}
	public void setManifaturedby(String manifaturedby) {
		this.manifaturedby = manifaturedby;
	}	
	
	

}
