package org.test;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class map {
	 public static void main(String[] args) {
		 Map<Integer, String> mi = new HashMap<Integer, String>();
		 mi.put(10, "Apple");
		 mi.put(11, "orange");
		 mi.put(12, "gova");
		 mi.put(13, "pineapple");
		 mi.put(10, "Apple");
		 Set<Integer> keySet = mi.keySet();
		 System.out.println(keySet);
		 Set<java.util.Map.Entry<Integer, String>> entrySet = mi.entrySet();
		  
		 System.out.println(entrySet);
			}
		}
		
	


