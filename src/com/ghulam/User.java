package com.ghulam;

public class User {
	private String name;
	private String mobileNo;

	public User() {
	}

	public User(String name, String mobileNo) {
		this.name = name;
		this.mobileNo = mobileNo;
	}

	public String getName() {
		return String.format("%-25s", name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
}
