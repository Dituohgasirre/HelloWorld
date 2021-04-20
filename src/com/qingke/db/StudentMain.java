package com.qingke.db;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student =new Student(1,"qingke","MALE",20);
		try {
			ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream("student2.output"));
			oos.writeObject(student);
			oos.close();
			
			ObjectInputStream ois =new ObjectInputStream(new FileInputStream("student2.output"));
			Object object =ois.readObject();
			ois.close();
			System.out.println("old student="+student);
			System.out.println("new student="+object);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
