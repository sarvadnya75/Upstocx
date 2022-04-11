package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayLists {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		
		System.out.println(al.isEmpty());
		System.out.println(al.size());
		
		al.add("Piyush Patil");
		al.add(57);
		al.add('A');
		al.add(67.75f);
		al.add("Pass");
		al.add('A');
		
		System.out.println(al);
		System.out.println(al.isEmpty());
		System.out.println(al.size());
		
		System.out.println(al.get(0));
		System.out.println(al.indexOf(57));
		System.out.println(al.indexOf("Pass"));
		System.out.println(al.indexOf('A'));
		System.out.println(al.lastIndexOf('A'));
		
		System.out.println(al.contains(57));
		System.out.println(al.contains("Pass"));
		
		al.add(2, "Ketan");     //add value at specified index
		System.out.println(al);
		
		al.set(4, "Gaurav");     //replace value at specified index
		System.out.println(al);
		
		al.remove(4);
		System.out.println(al);
		
		al.remove("Ketan");
		System.out.println(al);
		
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		for(int i=0; i<=al.size()-1; i++) {
			System.out.println(al.get(i));
		}
	Collections.reverse(al);
	
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	}
}
