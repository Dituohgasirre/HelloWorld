package qingke;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparator<Student>{
	private int id;
	private String name;
	public Student(){
		
	}
	
	public Student(int id,String name){
		this.id=id;
		this.name=name;
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
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + "]";
	}
//	@Override
//	public int compareTo(Student student) {
//		if(id>student.id){
//			return 1;
//		}else if(id<student.id){
//			return -1;
//		}else{
//			
//			return 0;
//		}
//	}
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.id - o2.id;
	}
	
}

public class ListTest1 {
	
	public static void main(String[] args){
//		List<String> a =new ArrayList<String>();
//		List<String> b =new ArrayList<String>();
////		List<String> c = new ArrayList<>();
		List<Student> stus =new ArrayList<Student>();
		
//		a.add("cat");
//		a.add("dog");
//		a.add("pig");
//		a.add("bear");
//		
//		b.add("fish");
//		b.add("graffle");
//		b.add("pig");
//		b.add("bear");
////		c=a;
//		a.retainAll(b);
//		
//		for(String i:a){
//			System.out.println(i);
//		}
	
		stus.add(new Student(12, "hehe"));
		stus.add(new Student(1,"wei"));
		stus.add(new Student(3,"wang"));
		stus.add(new Student(5,"wangwei"));
		Collections.sort(stus,new Student());
		for(Student stu :stus){
			System.out.println(stu);
		}
	}

	
}
