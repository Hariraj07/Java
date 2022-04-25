package org.mapss;

import java.util.*;
import java.util.Map.Entry;



public class Map{
	public static void main(String[] args) {
	Map<Integer,String> mi = new LinkedHashMap <Integer,String>();  //Map<key,value> ref = new AnyClassOfMap<key,value> ();
	mi.put(10, "Subash");
	mi.put(30, "Karthi");
	mi.put(25, "gowtham");
	//System.out.println(mi);
	
	int siz = mi.size();
	boolean conkey = mi.containsKey(10);
	boolean conval = mi.containsValue("Subash");
	String pt = mi.put(50, "Line");
	boolean emp = mi.isEmpty();
	Set<Integer> kest = mi.keySet();
	Collection<String> val = mi.values();
	String str = mi.get(20);
	System.out.println(siz);
	System.out.println(conkey);
	System.out.println(conval);
	System.out.println(pt);
	System.out.println(emp);
	System.out.println(str);
	System.out.println(kest);
	System.out.println(val);
	
	Set<Entry<Integer, String>> en = mi.entrySet();
	for (Entry<Integer,String> x: en);
	System.out.println(en);
	
	
	}
}
