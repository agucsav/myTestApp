import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Test;

public class TestUtil {
  Util c;

  @Before
  public void setUp() { c = new Util(); }

  @Test
  public void example() { assertTrue(true); }

	@Test
	public void argsLengthIsOne(){
		int[] args = {0};
		assertEquals(false, c.compute(args));
	
	}
	
	@Test
	public void argsLengthIsEven(){
		int[] args = {0,0};
		assertEquals(false, c.compute(args));
	
	}
		
	@Test(expected = RuntimeException.class)
	public void testException() throws Exception{
		int[] args = {0,0,0};
		c.compute(args);
	
	}
}
