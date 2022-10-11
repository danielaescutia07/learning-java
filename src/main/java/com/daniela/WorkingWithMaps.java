package main.java.com.daniela;

import java.util.HashMap;
import java.util.Map;

//Maps allow us to save key value pairs
public class WorkingWithMaps {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>(); //Integer refers to key type; String refers to value type; example: (0, "Dani");
        map.put(1, "Hannah"); //we use "put" keyword to add
        map.put(2, "Jamil");
        map.put(3, "Alice");

        System.out.println(map);

        System.out.println(map.get(1)); //We can use .get() and pass a key; it will return the value of that key; expected: Hannah
                                        //If map contains duplicate keys, the latest one will override
        System.out.println(map.keySet()); //Using .keySet() returns all keys stored in our map; no duplicates allowed

        //We can use a for loop
        for (int key : map.keySet()) {
            System.out.println(map.get(key));
        }

        //Or we can use a forEach() and passing 2 parameters; first parameter is the key; second parameter is the value
        map.forEach((key, value) -> {
            System.out.println(key + " : " + value);
        });

        //.getOrDefault() - if key is present in our map it will return the value otherwise default value will be returned
        String defaultValue = map.getOrDefault(10, "oops this is the default value");
        System.out.println(defaultValue);

    }
}
