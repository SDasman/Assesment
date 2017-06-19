package Java_Sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class HashTableTest {

	/**
	 *  Generates Hashtable and test pair for Junit.
	 */
	java.util.Hashtable ht2 = new java.util.Hashtable();
	UserKey test = new UserKey("Shijit", "SH");
	@Test
	public void test() {
		ht2.put(test, "Value");
		
		assertEquals(ht2.get(test), "Value");
	}

}
