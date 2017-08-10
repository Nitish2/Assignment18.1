package arrayListIterator;
/*
 * Creating an object of ArrayList and adding 5 String elements inside ArrayList object.
 * Iterate the elements using an Iterator
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Sports { // Creating Class

	public static void main(String[] args) { // Main method

		// Creating ArrayList Object
		ArrayList<String> sportname = new ArrayList<String>();

		// Adding elements into the array list
		sportname.add("Hockey");
		sportname.add("Cricket");
		sportname.add("Football");
		sportname.add("Golf");
		sportname.add("Tennis");

		System.out.println("Iterating the array list elements using an itertor\n");

		/**Creating iterator object using iterator method() which Returns an iterator over 
		   the elements in this list in proper sequence.
         **/
		 Iterator<String> iterate = sportname.iterator();
		
		 // Looping Array List using Iterator
		while (iterate.hasNext()) //hasNext() method returns true if iterator have more elements.
								
      //next() method returns the next element and also moves cursor pointer to the next element.
		System.out.println(iterate.next()); 

	}
}