package org.Lists;

import java.util.*;

public class SampleSets {
	public static void main(String[] args) {
		Set <Integer> si = new TreeSet <Integer>(); // HashSet will print the value randomly, LinkedHashSet print in give order
		si.add(10);
		si.add(40);
		si.add(20);
		si.add(10);
		si.add(15);
		System.out.println(si);
	}

}
