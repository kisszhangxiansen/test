package com.zsc.pojo;

public class User {
	private String name;
	private String ssex;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	//swwe
	public User(String name, String ssex) {
		super();
		this.name = name;
		this.ssex = ssex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsex() {
		return ssex;
	}

	public void setSsex(String ssex) {
		this.ssex = ssex;
	}

}
