package practice;

import java.util.HashSet;
import java.util.Iterator;
public class set{
	
	public static void main(String args[]) {
	
		HashSet <String> set = new HashSet<>();
		
		set.add(new String("Amy"));
		set.add("Julia");
		set.add("Amy");
		set.add("John");
		set.add("Sally");
		
		System.out.println("Size of Set: " +set.size());
		System.out.println();
		Iterator<String> setlter = set.iterator();
		
		while(setlter.hasNext()) {
			System.out.println(setlter.next());
		}
		
		System.out.println();
		set.remove("Amy");
		System.out.println("Size of Set: "+set.size());
		System.out.println();
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("Empty");
		}
	}
}