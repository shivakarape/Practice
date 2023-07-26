// Java program to traversal a Java.util.HashMap

import java.util.HashMap;
import java.util.Map;

class TraversalTheHashMap
{
    public static void main(String args[])
    {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("shivanand", 29);
        map.put("aabasaheb", 61);
        map.put("saraswati",50);

        //created iterator in for loop
        for(Map.Entry<String,Integer> e: map.entrySet())    // for(type var: array)
        {
            System.out.println("key: " + e.getKey() + " Value: " + e.getValue());
        }
    }
}