package com.qingke.test;

import java.util.Comparator;

public class Info implements Comparator<Info> {
	private String adressID;
	private String address;
	private double salary;
	private String partaddressID;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAdressID() {
		return adressID;
	}

	public void setAdressID(String adressID) {
		this.adressID = adressID;
	}

	public String getPartaddressID() {
		return partaddressID;
	}

	public void setPartaddressID(String partaddressID) {
		this.partaddressID = partaddressID;
	}

	@Override
	public String toString() {
		return adressID + "," + address + "," + salary + "," + partaddressID + "," + name;
	}

	@Override
	public int compare(Info o1, Info o2) {

		return (int) (o2.getSalary() - o1.getSalary());
	}

}
