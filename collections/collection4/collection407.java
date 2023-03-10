package collection4;
import java.util.*;
public class collection407 {
	 @SuppressWarnings("rawtypes")
	public static void main(String args[]) {
	        
		    // Creating a HashMap of String keys and String values
		    HashMap<String, String> hashmap = new HashMap<String, String>();
		    hashmap.put("Key1", "Value1");
		    hashmap.put("Key2", "Value2");
		    System.out.println("Iterating or looping map using entrySet and foreach loop");
		    // Iterating or looping using entrySet() method
		    Set<Map.Entry<String, String>> entrySet = hashmap.entrySet();
		    for (Map.Entry entry : entrySet) {
		        System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
		    }
		  }
}
