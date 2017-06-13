package com.unify_iri.wspUtill.dto;

public class WspDBConnect {
	private String url;
	private String userName;
	private String password;
	private String wspID;
	private String PlanType;
	
	public WspDBConnect() {
	}
	public WspDBConnect(WspDBConnect wspDBConnect) {
		super();
		this.url = wspDBConnect.getUrl();
		this.userName = wspDBConnect.getUserName();
		this.password = wspDBConnect.getPassword();
		this.wspID = wspDBConnect.getWspID();
		this.PlanType = wspDBConnect.getPlanType();
	}
	
	public WspDBConnect(String url, String userName, String password) {
		super();
		this.url = url;
		this.userName = userName;
		this.password = password;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getWspID() {
		return wspID;
	}

	public void setWspID(String wspID) {
		this.wspID = wspID;
	}

	public String getPlanType() {
		return PlanType;
	}

	public void setPlanType(String planType) {
		PlanType = planType;
	}
	
}
