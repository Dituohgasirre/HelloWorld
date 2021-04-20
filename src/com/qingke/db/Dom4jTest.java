package com.qingke.db;

import java.io.File;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;



public class Dom4jTest {
	
	public static void main(String[] args) {
		
		try {
			SAXReader reader =new SAXReader();
			Document document;
			document = reader.read(new File("sample.xml"));
			Element root =document.getRootElement();
			Iterator<Element> iterator =root.elementIterator();
			while(iterator.hasNext()){
				Element child = iterator.next();
				if(!"student".equals(child.getName())){
					continue;
				}
				System.out.println("--------Student--------");
				
				System.out.println("id:"+child.attributeValue("id"));
				System.out.println("name:"+child.elementText("name"));
				System.out.println("gender:"+child.elementText("gender"));
				System.out.println("age:"+child.elementText("age"));
				
			}
			
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
