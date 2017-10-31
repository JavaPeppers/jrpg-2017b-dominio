package tests.Dominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.MyRandomStub;
import dominio.RandomGenerator;

/**
 * The Class testRandomStub.
 */
public class TestRandomStub {

	/** The Constant TRES. */
	private static final int TRES = 3;

	/**
	 * Test.
	 */
	@Test
	public void test() {
		RandomGenerator ran = new MyRandomStub(TRES, 2);
		Assert.assertEquals(2, ran.nextInt(TRES));
		Assert.assertEquals(TRES, ran.nextDouble(), 0);
	}

}
