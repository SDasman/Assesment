package Java_Sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserKeyTest {

	UserKey test = new UserKey("Shijit", "SH");
	
	@Test
	public void newConstructorTest() {
		assertEquals(test.getUserID(), "SH");
		assertEquals(test.getName(), "Shijit");

	}
}
