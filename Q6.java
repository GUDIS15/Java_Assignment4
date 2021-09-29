package Assignment4.java;

import java.util.TreeSet;

public class Q6 {
	 public static void main(String[] args) 
	   {
	      TreeSet<Integer> treeSet = new TreeSet<Integer>();
	      treeSet.add(2091);
	      treeSet.add(5333);
	      treeSet.add(191);
	      treeSet.add(20);
	      treeSet.add(497);
	      treeSet.add(7701);
	      treeSet.add(4031);
	 
	      System.out.println("TreeSet Lowest value = " + treeSet.first());
	      System.out.println("TreeSet Highest value = " + treeSet.last());
	   }


}
