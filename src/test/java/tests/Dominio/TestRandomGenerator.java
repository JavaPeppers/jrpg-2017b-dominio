package tests.Dominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.RandomGenerator;


/**
 * The Class TestRandomGenerator.
 */
public class TestRandomGenerator {

    /** The Constant RANDOM_INT. */
    private static final int RANDOM_INT = 3;

    /**
     * Test.
     */
    @Test
    public void test() {
        RandomGenerator ran = new RandomGenerator();
        Assert.assertEquals(0, ran.nextInt(RANDOM_INT));
        Assert.assertEquals(0, ran.nextDouble(), 0);
    }

}
