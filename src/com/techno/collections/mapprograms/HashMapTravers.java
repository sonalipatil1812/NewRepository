package com.techno.collections.mapprograms;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapTravers {

	public static void main(String[] args) {
           Map<String, Integer> map=new HashMap<String, Integer>();
           map.put("Sonali", 95);
           map.put("Pooja", 87);
           map.put("Neha", 54);
           map.put("Riya", 90);
           map.put("Diya", 89);
           
           Map<String, Integer> sortedMap=new TreeMap<String, Integer>(Collections.reverseOrder());
           sortedMap.putAll(map);
           System.out.println(sortedMap);
	}

}
