package org.Lists;

import java.util.LinkedList;
import java.util.List;

public class List{
	public static void main(String[] args) {
		List <Integer>li = new LinkedList<Integer>(); //All datatypes can be used with syntax"List li = new LinkedList();". if we need to particular data type syntax "List <Integer>li = new LinkedList<integer>();"
		li.add(10);
		li.add(20);
		li.add(30);
		//li.add("java"); // String 
		//li.add(50.00f); // since we used Integer "List <Integer>li = new LinkedList<Integer>()" string and float cannot be used.
		li.add(60);
		li.add(70);
		li.add(80);
		
		//list2
		List li1 = new LinkedList();
		li1.add(20);
		li1.add(30);
		li1.add(40);
		
		
		 li.addAll(li1); // to add both list
		 System.out.println(li);
		 li1.add(3, 50); // to add in list 2
		System.out.println(li1);
		 li.retainAll(li1);// to get common value in both list
		 System.out.println(li);
		 li.removeAll(li1); // to get not common value from both list 
		 System.out.println(li);
		 //for (int i=0; i < li.size();i++) {// Iteration of list
			 //System.out.println(li.get(i));
		//for(int x : li)// enhanced for loop
		//System.out.println(x);
	}
		 }




