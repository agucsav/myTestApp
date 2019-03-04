import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import static org.mockito.Matchers.*;

import org.junit.Test;

public class TestCompute {
  Compute c;

  @Test
  public void example() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    assertTrue(true);
  }
  
  @Test
	public void sizeIsZero(){
		MessageQueue mq = mock(MessageQueue.class);
		c = new Compute(mq);
		when(mq.size()).thenReturn(0);
		assertEquals(-1, c.countNumberOfOccurrences("test string"));
	}
	
	@Test
	public void mqContains(){
		MessageQueue mq = mock(MessageQueue.class);
		c = new Compute(mq);
		when(mq.size()).thenReturn(1);
		when(mq.contains(anyString())).thenReturn(false);
		assertEquals(0, c.countNumberOfOccurrences("test string"));
	}
	@Test
	public void countTheNumbers(){
		MessageQueue mq = mock(MessageQueue.class);
		c = new Compute(mq);
		String e = "test string";
		when(mq.size()).thenReturn(1);
		when(mq.contains(anyString())).thenReturn(true);
		when(mq.size()).thenReturn(5);
		when(mq.getAt(anyInt())).thenReturn("test string");
		assertEquals(5, c.countNumberOfOccurrences(e));
	}
	
		@Test
	public void countDoNotUpdateCount(){
		MessageQueue mq = mock(MessageQueue.class);
		c = new Compute(mq);
		String e = "test string";
		when(mq.size()).thenReturn(1);
		when(mq.contains(anyString())).thenReturn(true);
		when(mq.size()).thenReturn(5);
		when(mq.getAt(anyInt())).thenReturn("test");
		assertEquals(0, c.countNumberOfOccurrences(e));
	}
}
