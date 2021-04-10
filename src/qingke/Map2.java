package qingke;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map2 {
	public Map<String, Integer> word0(String[] strings) {
		  Map<String,Integer> map =new HashMap<String,Integer>();
		  for(String i:strings){
			  
			  map.put(i, 0);
		  }
		  return map;
	}
	public Map<String, Integer> wordLen(String[] strings) {
		  Map<String, Integer> map =new HashMap<String, Integer>();
		  for(String i:strings){
			  
			  map.put(i, i.length());
		  }
		  return map;
	}
	public Map<String, String> pairs(String[] strings) {
		Map<String, String> map =new HashMap<String, String>();
		for(String i:strings){
			map.put(i.substring(0,1), i.substring(i.length()-1));
		}
		return map;
	}
	public Map<String, Integer> wordCount(String[] strings) {
		Map<String, Integer> map =new HashMap<String, Integer>();
		for(int i=0;i<strings.length;i++){
			int count=0;
			for(int j=0;j<strings.length;j++){
				
				if(strings[i].equals(strings[j])){
					count++;
				}
			}
			map.put(strings[i], count);
			
		}
		return map;
	}
	public Map<String, String> firstChar(String[] strings) {
		Map<String, String> map =new HashMap<String, String>();
		for(int i=0;i<strings.length;i++){
			String str = "";
			for(int j=0;j<strings.length;j++){
				if(strings[i].charAt(0)==strings[j].charAt(0)){
					str+=strings[j];
				}
			}
			map.put(strings[i].substring(0,1), str);
		}
		return map;
	}
	public String wordAppend(String[] strings) {
		Map<String, String> map1 =new HashMap<String, String>();
		Map<Integer, String> map2 =new HashMap<Integer, String>();
		int count =-1;
		for(int i=0;i<strings.length;i++){
			if(map1.containsKey(strings[i])){
				map2.put(++count, strings[i]);
				map1.remove(strings[i]);
			}else{
				map1.put(strings[i], strings[i]);
			}
		}
		String str="";
		for(String s:map2.values()){
			str+=s;
		}
		return str;
	}
	public Map<String, Boolean> wordMultiple(String[] strings) {
		Map<String, String> map1 =new HashMap<String, String>();
		Map<String, Boolean> map2 =new HashMap<String, Boolean>();
		for(int i=0;i<strings.length;i++){
			
			if(map1.containsKey(strings[i])){
				map2.put(strings[i], true);
				
			}else{
				map2.put(strings[i], false);
				map1.put(strings[i], strings[i]);
			}
		}
		return map2;
	}
	public String[] allSwap(String[] strings) {
		  Map<String,Integer> map =new LinkedHashMap<String,Integer>();
		  for(int i=0;i<strings.length;i++){
			 String key=""+strings[i].charAt(0);
			  if(map.containsKey(key)){
				  String str=strings[i];
				  strings[i]=strings[map.get(key)];
				  strings[map.get(key)]=str;
				  map.remove(key);
			  }else{
				  map.put(key, i);
			  }
		  }
		  return strings;
	}
	public String[] firstSwap(String[] strings) {
		  Map<String,Integer> map =new LinkedHashMap<String,Integer>();
		  int length =strings.length;
		  for(int i=0;i<strings.length;i++){
			 String key=""+strings[i].charAt(0);
			  if(map.containsKey(key)){
				  if(map.get(key)!=length){
					  String str=strings[i];
					  strings[i]=strings[map.get(key)];
					  strings[map.get(key)]=str;
					  map.put(key, length);
				  }
				 
			  }else{
				  map.put(key, i);
			  }
		  }
		  return strings;
	}






}
