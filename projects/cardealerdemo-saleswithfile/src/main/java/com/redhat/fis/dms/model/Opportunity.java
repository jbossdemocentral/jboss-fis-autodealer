package com.redhat.fis.dms.model;

public class Opportunity {
	
	private String stage;
	private String type;
	private String vehicleId;
	private String custName;
	private String phone;
	private Integer discount;
	private String opendate;
	
	public String getStage() {
		return stage;
	}
	public void setStage(String stage) {
		this.stage = stage;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getDiscount() {
		return discount;
	}
	public void setDiscount(Integer discount) {
		this.discount = discount;
	}
	public String getOpenDate() {
		return opendate;
	}
	public void setOpenDate(String opendate) {
		this.opendate = opendate;
	}

	
}
