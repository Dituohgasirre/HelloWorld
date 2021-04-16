package com.qingke.test1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LearnFile {
	private static ArrayList<Tag> tags;
	private static ArrayList<SubTag> subTags;
	private static ArrayList<People> people;
	
	public static void writeFile(String pathName){
		File file =new File(pathName);
		BufferedReader bufferedReader = null;
		String line;
		try {
			FileReader fileReader =new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			line = bufferedReader.readLine();
			while(line!=null){
				if(!line.contains("#")){
					String[] lineArray =line.split(",");
					creatTag(lineArray);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(bufferedReader!=null){
					bufferedReader.close();					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public static void creatTag(String[] item){
		String id =item[0];
		String name =item[1];
		Tag tag = new Tag(id,name);
		tags.add(tag);
		
	}
	public static void creatSubTag(String[] item){
		String id =item[0];
		String name =item[1];
		Tag tag = new Tag(id,name);
		tags.add(tag);
		
	}
	public static void creatPeople(String[] item){
		
	}
	
}

class Tag{
	 String id;
	 String name;
	
	public Tag(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}
class SubTag{
	 String id;
	 String name;
	 Tag tag;
	
	public SubTag(String id, String name, Tag tag) {
		super();
		this.id = id;
		this.name = name;
		this.tag = tag;
	}
	
	
}	
class People{
	 String income;
	 String name;
	 SubTag aubTag;
	
	public People(String income, String name, SubTag aubTag) {
		super();
		this.income = income;
		this.name = name;
		this.aubTag = aubTag;
	}
	
	
}