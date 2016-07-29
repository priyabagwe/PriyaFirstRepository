package com.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListEx {
//Elements added to the given list
	static void method1 (){
		ArrayList<Integer> List = new ArrayList<>();
		List.add(23);
		List.add(19);
		List.add(21);
		List.add(30);
		List.get(2);
		System.out.println("Added Elements are"+ List);
// To search for the element in the list	
		System.out.println(List.get(2));
	}
// To print the elements using iterator	
	static void method2(){
		ArrayList<String> List = new ArrayList<>();
		List.add("Aayush");
		List.add("Sashi");
		List.add("Priya");
		List.add("Rajesh");
		Iterator <String> itr = List.iterator();
		System.out.println("Iterating through Arraylist elements");
		while(itr.hasNext())
		System.out.println(itr.next());
		System.out.println("Added Elements are"+ List);
			}
//To print elements in reverse order
	
	static void method3(){
		ArrayList <Integer> list = new ArrayList<>();
	
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		Collections.sort(list);
		System.out.println("Only Sorting list"+ list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("Reverse Order list" + list);
	}
			
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ArrayListEx.method1();
		ArrayListEx.method2();
		ArrayListEx.method3();
			}

}
