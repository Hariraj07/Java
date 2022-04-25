package org.Lists;

import java.util.*;


public class ArrayList{
	public static void main(String[] args) {
		// to remove duplicate and print in accending order
		 
		List <Integer> li = new ArrayList<Integer>();
		li.add(10);
		li.add(15);
		li.add(14);
		li.add(20);
		li.add(20);
		
		Set <Integer> si = new TreeSet<Integer>();
		si.addAll(li);
		System.out.println(si);
	}
}


