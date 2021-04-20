package com.qingke.xml;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="People")
@XmlAccessorType(XmlAccessType.FIELD)
public class People {
	
	@XmlElement(name="person")
	private ArrayList<Person> list; 
	public People(){
		
	}
	public People(ArrayList<Person> list){
		this.list=list;
	}
}
