package com.main;

import java.util.HashMap;

public class HashmapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hash = new HashMap<>();

		// Put three keys with values.
		hash.put("priya", 1);
		hash.put("Riya", 2);
		hash.put("Sarah", 3);

		// Look up some known values.
		int a = hash.get("priya");
		int b = hash.get("Sarah");

		// Display results.
		System.out.println(a);
		System.out.println(b);
	    }
	}