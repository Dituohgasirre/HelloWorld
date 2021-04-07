package qingke;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class ListTest {
	public static void main(String[] args){
		ArrayList<Integer> list =new ArrayList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(5);
		list.add(6);
		list.add(6);
		list.add(8);
		
		Iterator<Integer> it =delrep(list).iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	public static List relist(List list,int n){
		
		if(n>list.size()){
			return list;
		}else{
			for(int i=0;i<list.size();){
				i=i+n-1;
				list.remove(i);
			}
			return list;
		}
		
	}
	public static List delrep(List list){
		LinkedHashSet<Integer> set =new LinkedHashSet<>(list);
		ArrayList<Integer> l=new ArrayList<Integer>(set);
		return l;
	}
}
