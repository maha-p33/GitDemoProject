package collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Array_List {
	
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(1);
		list.add("java");
		list.add("123");
		list.add(1);
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.size());
		System.out.println(list.contains(123));
		System.out.println(list.contains("123"));
		list.remove(1);
		System.out.println(list.indexOf(1));
		System.out.println(list.indexOf("123"));
		System.out.println(list.lastIndexOf(1));
		System.out.println(list.isEmpty());
		//list.clear();
		list.set(0, 33);
		for(Object o: list) {
			System.out.println(o);
		}
		//list.add(1);
		//System.out.println(list.isEmpty());
		
				
	}
}
