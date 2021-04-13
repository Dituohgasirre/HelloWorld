package qingke;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


class Person{
	private String id;
	private String name;
	public Person(String id, String name){
		this.id=id;
		this.name=name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		
		
		
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
}
public class MapTest1 {
	public static void main(String[] args) {
		Person p1 = new Person("0","Bob");
		Person p2 = new Person("1","Micra");
		Person p3 = new Person("2","car");
		Person p4 = new Person("0","Bob");
		Map<Person,	Integer> map =new LinkedHashMap<>();
		map.put(p1, 1);
		map.put(p2, 3);
		map.put(p3, 4);
		map.put(p4, 1);
		Set<Person> keys =map.keySet();
		for(Person key:keys){
			System.out.println(key);
		}
		Collection<Integer> values=map.values();
		for(Integer value: values){
			System.out.println(value);
		}
		for(Map.Entry<Person, Integer> entry:map.entrySet()){
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
	
}
