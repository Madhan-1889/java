package com.wipro.java.collection.hashmap;

import java.util.HashMap;

class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<Integer, String> languages = new HashMap<>();
        
        // put() - Add elements
        languages.put(1, "Java");
        languages.put(2, "Python");
        languages.put(3, "JavaScript");
        System.out.println("\nInitial HashMap: " + languages);
        
        // putIfAbsent()
        languages.putIfAbsent(4, "C#");
        System.out.println("\nAfter putIfAbsent: " + languages);
        
        // putAll()
        HashMap<Integer, String> moreLanguages = new HashMap<>();
        moreLanguages.put(5, "Ruby");
        moreLanguages.put(6, "Swift");
        languages.putAll(moreLanguages);
        System.out.println("\nAfter putAll: " + languages);
        
        // get()
        System.out.println("\nValue at key 1: " + languages.get(1));
        
        // getOrDefault()
        System.out.println("\nValue at key 7 (default): " + languages.getOrDefault(7, "Not Found"));
        
        // keySet(), values(), entrySet()
        System.out.println("Keys: " + languages.keySet());
        System.out.println("Values: " + languages.values());
        System.out.println("\nKey/Value mappings: " + languages.entrySet());
        
        // replace()
        languages.replace(2, "C++");
        System.out.println("\nAfter replace: " + languages);
        
        // replaceAll()
        languages.replaceAll((k, v) -> v.toUpperCase());
        System.out.println("\nAfter replaceAll: " + languages);
        
        // remove()
        languages.remove(2);
        System.out.println("\nAfter remove: " + languages);
        
        // merge()
        languages.merge(5, "Perl", (oldVal, newVal) -> oldVal + " & " + newVal);
        System.out.println("\nAfter merge: " + languages);
        
        // clone()
        @SuppressWarnings("unchecked")
		HashMap<Integer, String> clonedMap = (HashMap<Integer, String>) languages.clone();
        System.out.println("\nCloned HashMap: " + clonedMap);
        
        // containsKey(), containsValue()
        System.out.println("\nContains key 1? " + languages.containsKey(1));
        System.out.println("\nContains value 'JAVA'? " + languages.containsValue("JAVA"));
        
        // size(), isEmpty()
        System.out.println("\nSize of HashMap: " + languages.size());
        System.out.println("\nIs HashMap empty? " + languages.isEmpty());
        
        // clear()
        languages.clear();
        System.out.println("\nHashMap after clear: " + languages);
    }
}

