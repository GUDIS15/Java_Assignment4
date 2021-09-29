package Assignment4.java;

import java.util.Hashtable;

public class Q3 {
	public static void main(String[] args) {
		   
	    //create Hashtable object
	    Hashtable ht = new Hashtable();
	   
	    //add key value pairs to Hashtable
	    ht.put("1","One");
	    ht.put("2","Two");
	    ht.put("3","Three");
	   
	  
	   
	    boolean b1 = ht.containsKey("3");
	    System.out.println("3 exists in Hashtable ? : " + b1);
	  }


}
