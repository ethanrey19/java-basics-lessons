package main.Misc.HashMaps;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {

        // HashMap implements the Map interface (need import)
        // HashMap is similar to ArrayList, but with key-value pairs
        // stores objects, need to use Wrapper Class
        // ex : (name,email), (username,userid), (country,capital)

        HashMap<String,String> countries = new HashMap<String,String>(); // makes the hashmap

        // ad a key and value
        countries.put("USA","Washington DC");
        countries.put("India","New Delhi");
        countries.put("Russia","Moscow");
        countries.put("China","Beijing");

        //countries.remove("USA");
        //System.out.println(countries.get("Russia")); // returns value of a certain key
        //countries.clear(); // removes everything
        //System.out.println(countries.size()); // gets size of HashMap
        //countries.replace("USA","Sacramento"); // Changes the value of a key
        //countries.containsKey("USA"); // checks if a certain key is in the HashMap
        //countries.containsValue("Moscow"); // check is a certain Value is in the HashMap

        for(String i : countries.keySet()){
            System.out.print(i + "\t" + "= ");
            System.out.println(countries.get(i));
        }
    }
}
