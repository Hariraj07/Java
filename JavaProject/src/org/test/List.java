package org.test;

import java.util.LinkedList;

public class List {
	public static void main(String[] args) {
		LinkedList<String> li = new LinkedList<String>();
		li.add("Hari");
		li.add("Haran");
		li.add("Raj");
		li.add("Hari");
		li.add("lashu");
		li.add("gayathri");
		
		 for (int i = 0; i < li.size(); i++) {
			
			
		}
		// System.out.println(li);
		 li.add("muthu");
		 System.out.println(li.get(2));
	}

}
