package com.qingke.xml;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

public class TestXml {

	public static void main(String[] args) {
		JAXBContext ctx =null;
		ArrayList<Person> pr = (ArrayList<Person>) ReadFile.returnList();
		File file =new File("person.xml");
		People p = new People(pr);
		try {
			ctx=JAXBContext.newInstance(People.class);
			ctx.createMarshaller().marshal(p,file);

		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
