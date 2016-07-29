package com.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class SortByValueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Grandfather", 80);
        map.put("Father", 45);
        map.put("Grandmother", 75);
        map.put("Uncle", 67);
        map.put("Mother", 42);
        map.put("Aunt",38);
        Set<Entry<String, Integer>> set = map.entrySet();
        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
        {
            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
            {
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        } );
        for(Map.Entry<String, Integer> entry:list){
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }
    }
}