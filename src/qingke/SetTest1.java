package qingke;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Animal implements Comparable<Animal>{
	private String name;

	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Animal o) {
		
		return name.length()-o.getName().length();
	}

}


public class SetTest1 {
	public static void main(String[] args) {
		Set<Animal> set1 = new HashSet<Animal>();
		
		List<Animal> list1 =new ArrayList<Animal>();
		addElements(set1);
		addElements(list1);
		
		
		Collections.sort(list1);
		
		showElements(set1);
		
		System.out.println();
		
		showElements(list1);
		
		
	}
	public static void addElements(Collection<Animal> col){
		col.add(new Animal("wwwdfg"));
		col.add(new Animal("qqqfg"));
		col.add(new Animal("yyygfdgdfg"));
		col.add(new Animal("eeedfggdfgfgdgdfg"));
	}
	public static void showElements(Collection<Animal> col){
		for(Animal ani :col){
			System.out.println(ani.getName());
		}
	}

}
