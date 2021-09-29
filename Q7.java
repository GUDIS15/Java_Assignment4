package Assignment4.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Q7 {
	public static void main(String[] args) {
		  
		//create an ArrayList object
		ArrayList<String> arrayList = new ArrayList();
		       
		//Add elements to Arraylist
		        
		arrayList.add("S"); 
		arrayList.add("E");
		arrayList.add("A");
		arrayList.add("X");
		arrayList.add("L");
	System.out.println("Before sorting ArrayList:");
		 Iterator itr=arrayList.iterator();
		        
		while (itr.hasNext()) {
		 
		System.out.println(itr.next());
		     
		}
		 
		       
		 /*
		 To sort an ArrayList object, use Collection.sort method. This is a
		  static method. It sorts an ArrayList object's elements into ascending order.
		*/
		  Collections.sort(arrayList);
		     
		  System.out.println("After sorting ArrayList:");
		       
		    
		        
		Iterator itr1=arrayList.iterator();
		        
		while (itr1.hasNext()) {

		System.out.println(itr1.next());
		            
		}
		    
		  
		}


}
