package org.test;

import java.util.HashSet;
// set will not allow duplicate
public class Set {
	public static void main(String[] args) {
		HashSet st = new HashSet();
		st.add("Hari");
		st.add(10);
		st.add(10);
		st.add("Hari");
		st.add("Raj");
		st.add("latha");
		st.add("lashu");
		st.add("gayu");



		
		for (int i = 0; i < st.size(); i++) {
		
		}
		System.out.println(st);
	}

}
