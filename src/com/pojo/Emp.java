package com.pojo;
// Generated Oct 29, 2018 12:57:34 PM by Hibernate Tools 4.3.5.Final

/**
 * Emp generated by hbm2java
 */
public class Emp implements java.io.Serializable {

	private Integer id;
	private String name;
	private String sal;

	public Emp() {
	}

	public Emp(String name, String sal) {
		this.name = name;
		this.sal = sal;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSal() {
		return this.sal;
	}

	public void setSal(String sal) {
		this.sal = sal;
	}

}
