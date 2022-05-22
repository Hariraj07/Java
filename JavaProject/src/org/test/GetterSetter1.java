package org.test;

import java.util.ArrayList;
import java.util.LinkedList;

public class GetterSetter1 {

	public static void main(String[] args) {
		Setterrr gs = new Setterrr();
		gs.setAccountnumber(12356989);
		gs.setName("Hariharan");
		gs.setLocation("Chennai");
		Setterrr gs1 = new Setterrr();
		gs1.setAccountnumber(123569885);
		gs1.setLocation("tirchy");
		gs1.setName("Raj");
		ArrayList<Setterrr> l= new ArrayList<>();
	l.add(gs);
	l.add(gs1);
	 for (int i = 0; i < l.size(); i++) {
		 System.out.println(l.get(i).getAccountnumber());
		 System.out.println(l.get(i).getLocation());
		 System.out.println(l.get(i).getName());
		
		
	}
	
	}

}
