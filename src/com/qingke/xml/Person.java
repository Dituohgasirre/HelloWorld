package com.qingke.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Person")
@XmlAccessorType(XmlAccessType.FIELD)
public class Person {
	@XmlAttribute(name="areaid")
	private String id;
	@XmlElement(name="area")
	private String area;
	@XmlElement(name="income")
	private double income;
	@XmlElement(name="ofarea")
	private String ofarea;
	@XmlElement(name="boss")
	private String boss;
	
	public Person(){
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public String getOfarea() {
		return ofarea;
	}
	public void setOfarea(String ofarea) {
		this.ofarea = ofarea;
	}
	public String getBoss() {
		return boss;
	}
	public void setBoss(String boss) {
		this.boss = boss;
	}
	

}
