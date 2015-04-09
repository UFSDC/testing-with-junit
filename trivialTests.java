import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

@RunWith(JUnit4.class)
public class trivialTests {
	//These should all pass
	@Test
	public void DoubleZeroEqualsIntZero(){
		assertEquals(0.0, 0, 0);
	}

	@Test 
	public void TrueIsNotFalse(){
		assertFalse(true == false);
	}

	@Test
	public void referencesPointToTheSamePlace(){
		String myName = "Andrew";
		String myOtherName = myName;
		assertSame("should be same", myName, myOtherName);
	}

	@Test(expected= IndexOutOfBoundsException.class)
	public void empty(){
		new ArrayList<Integer>().get(2);
	}

	//This one should fail
	/*
	@Test
	public void TwoPlusTwoEqualsFish(){
		assertTrue(((2+2)+"") == "fish");
	}
	*/
}
