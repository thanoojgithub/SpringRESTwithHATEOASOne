package com.spring.pojo;

import java.util.Date;

public class Person {

	private int id;
	private String name;
	private Date dOJ;
	private String location;

	public Person(int id, String name, Date dOJ, String location) {
		super();
		this.id = id;
		this.name = name;
		this.dOJ = dOJ;
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getdOJ() {
		return dOJ;
	}

	public void setdOJ(Date dOJ) {
		this.dOJ = dOJ;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
