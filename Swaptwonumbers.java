package org.test;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Swaptwonumbers {
	public ArrayList<Integer> swap(int args1, int args2) {
		ArrayList<Integer> List = new ArrayList<Integer>();
		int c = args1;
		args1 = args2;
		args2 = c;
		List.add(args1);
		List.add(args2);
		return List;

	}

}
