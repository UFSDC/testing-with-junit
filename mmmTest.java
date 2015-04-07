import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class mmmTest {

	@Test(expected= NumberFormatException.class)
	public void anExceptionHappensWithNonnumbers(){
		mmm.getIntArray(new String[] { "1", "w"});
	}

	@Test
	public void testGetMeanReturnsTheMean(){
		assertEquals(mmm.getMean(new int[] { 1, 1}), 1, 0);
	}

	@Test
	public void testGetMaxGetsMax(){
		assertTrue(mmm.getMax(new int[] { 1, -5, 5 }) == 5);
	}

	@Test
	public void testThatGetModeReturnsTheModeAsAString(){
		assertThat("4", containsString(mmm.getMode(new int[] { 1, 2, 4, 4})));
	}

	@Test
	public void testGetMedianReturnsTheMedian(){
		int[] arr = new int[]{ 1, 2, 3, 4, 5};
		assertTrue(mmm.getMedian(arr) == 3);
	}
}