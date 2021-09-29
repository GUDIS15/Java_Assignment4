package Assignment4.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Q4 {
	public static void main(String args[])
	 {
		      Map<Integer, String> myMap = new HashMap<>();
		      myMap.put(9, "SS9");
		      myMap.put(8, "SS8");
		      myMap.put(7, "SS7");
		      myMap.put(6, "SS6");

		      ArrayList<Integer> k1 = new ArrayList<Integer>(myMap.keySet());
		      

		      System.out.println("list of keys in the hashmap is ::"+k1);

		   }


}
