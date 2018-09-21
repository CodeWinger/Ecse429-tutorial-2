package mcgill.ecse429.tutorial2;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
	public void testMainMethodForNull() {
		App.main(null);
	}
	
	@Test
	public void testMainMethodForEmptyArray() {
		App.main(new String[0]);
	}
	
	@Test
	public void testMainMethodForNonEmptyArray() {
		String[] args = {"Hello", "World"};
		App.main(args);
	}
}
