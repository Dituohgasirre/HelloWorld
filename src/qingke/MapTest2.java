package qingke;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest2 {

	public static void main(String[] args) {
		Map<Integer,String> hashmap =new HashMap<>();
		Map<Integer,String> linkedhashmap =new LinkedHashMap<>();
		Map<Integer,String> treemap =new TreeMap<>();
		testMap(hashmap);
		
		
	}
	public static void testMap(Map<Integer,String> map){
		for(int i=0;i<100000;i++){
			map.put(i, ""+i*2);
		}
		for(int key:map.keySet()){
			String value=map.get(key);
			System.out.println(key+":"+value);
		}
		double start =System.currentTimeMillis();
		for(Map.Entry<Integer, String> entry:map.entrySet()){
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		double end =System.currentTimeMillis();
		System.out.println(end-start);
		
	}

}
