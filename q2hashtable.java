
package Java_Sample;
import java.util.*;
public class q2hashtable {

	/**
	 * Changes to file are documented by comments.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserKey b1 = new UserKey("Bill Smith", "BSMITH");
		UserKey b2 = new UserKey("Bill Smith", "BSMITH");
		UserKey b3 = new UserKey("Susan Smith", "SSMITH");
		UserKey b4 = new UserKey(null,null);
		 
		System.out.println( b1.equals(b1) );  // prints true
		System.out.println( (b1.getName()).equals(b2.getName()) );  // prints true
		System.out.println( b1.equals(b3) );  // prints false
		System.out.println( b1.equals(null) ); // prints false
		System.out.println( b1.equals("Some String")); // prints false
		System.out.println( b4.equals(b1) ); // prints false
		
		/*/b1.equalsb1 compares the memory location of the same object 
		 * which will always be true.  However comparing b2 to b1 will not work
		 * unless we are comparing the contents of the objects instead of the memory
		 * location.
		*/ 
		 
		java.util.Hashtable ht = new java.util.Hashtable();
		 
		ht.put(b2,"Some Data");
		 
		String s = (String) ht.get(b2);
		 
		System.out.println( s.equals("Some Data") );  // prints true
		 //We changed the Key to be b2 so the String S can match the value of ht.put command.


	}
	
}
