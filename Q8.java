package Assignment4.java;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class Q8 {
	public static void main(String[] args) {
		
		 
		
		   
	    //create Hashtable object
	    Hashtable ht = new Hashtable();
	   
	    //add key value pairs to Hashtable
	    ht.put("8","Eight");
	    ht.put("9","Nine");
	    ht.put("10","Ten");
	    
	    Set st = ht.keySet();
	    
	    System.out.println("Set created from Hashtable Keys contains :");
	    //iterate through the Set of keys
	    Iterator itr = st.iterator();
	    while(itr.hasNext())
	      System.out.println(itr.next());

}


}
