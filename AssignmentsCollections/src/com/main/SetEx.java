package com.main;
import java.util.HashSet;

public class SetEx {

	static void method1(){
		String[] strArray = {"Maya", "Jaya", "Priya", "Priya", "Kala", "Maya", "Sara"};
        
        HashSet<String> set = new HashSet<String>();
 
        for (String arrayElement : strArray)
        {
            if(!set.add(arrayElement))
            {
                System.out.println("Duplicate Element is : "+arrayElement);
            }
	}
	}

	static void method2(){
		String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
		 
        String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};
 
        HashSet<String> set = new HashSet<String>();
 
        for (int i = 0; i < s1.length; i++)
        {
            for (int j = 0; j < s2.length; j++)
            {
                if(s1[i].equals(s2[j]))
                {
                    set.add(s1[i]);
                }
            }
        }
 
        System.out.println(set);   
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		SetEx.method1();
		SetEx.method2();
			}
}