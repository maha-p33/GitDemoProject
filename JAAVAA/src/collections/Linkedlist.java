package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Linkedlist {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(10);
		list.add(99);
		list.add(3);
		list.add(55);
		//System.out.println("elements of arraylist" + list);
		//System.out.println("size of arraylist" + list.size());
		//List<String> l = new LinkedList();
		//Generics means only string values 
		List l = new LinkedList();
		l.add(10);
		l.add(20);
		l.add(234);
		l.add(10);
		l.add(99);
		l.add(3);
		l.add(55);
		//l.addAll(list);
		//before sorting
		for(int i =0; i <l.size();i++)
		{
			System.out.println("before" + l.get(i));
		}
		Collections.sort(l);
		//After sorting
		for(int i =0; i <l.size();i++)
		{
			System.out.println(l.get(i));
		}
		
		
		System.out.println("elements of linkedlist" + list);
		System.out.println("size of linkedlist" +l.size());
		
		//System.out.println(l.containsAll(list));
		//l.removeAll(list);
		//System.out.println(l.containsAll(list));
		//System.out.println(l);
		
		
		
	}
	
	
	

}
