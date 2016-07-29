package com.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraylisttoArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> cstList = new ArrayList<String>();
		cstList.add("java");
		cstList.add("SQL");
		cstList.add("Python");
		cstList.add("Jira");
		
		Iterator<String> it = cstList.iterator();
		while (it.hasNext())
		{
			String cst = it.next();
			System.out.println("ArrayList contains" + cst);
		}
		Object [] s = cstList.toArray();
		for (int i =0 ;i<s.length;i++){
			System.out.println("For Array" + " "+ s[i].toString());
		}
		}

}
