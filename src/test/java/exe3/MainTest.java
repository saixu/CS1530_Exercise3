import static org.junit.Assert.*;
import org.junit.Test;
import exe3.Main;

public class MainTest {
	@Test
	public void testLazy1() {
		assertEquals(Main.lazy(10), 56);
	}
	@Test
	public void testTriangle1() {
		assertEquals(Main.tri(10), 55);
	}
	@Test
	public void testLazy2() {
		assertEquals(Main.lazy(11), 67);
	}
	@Test
	public void testTriangle2() {
		assertEquals(Main.tri(11), 66);
	}
	@Test
	public void testLazy3() {
		assertEquals(Main.lazy(12), 79);
	}
	@Test
	public void testTriangle3() {
		assertEquals(Main.tri(12), 78);
	}
}
