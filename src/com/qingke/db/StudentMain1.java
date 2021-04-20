package com.qingke.db;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

public class StudentMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 =new Student(1000,"qingke","male",20);
		
		JAXBContext ctx =null;
		try {
			ctx=JAXBContext.newInstance(Student.class);
			ctx.createMarshaller().marshal(student1, new File("student.xml"));
			
			Object obj =ctx.createUnmarshaller().unmarshal(new File("student.xml"));
			System.out.println(obj);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
