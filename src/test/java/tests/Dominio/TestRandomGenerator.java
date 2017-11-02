package tests.Dominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.RandomGenerator;


/**
 * Clase para Testear RandomGenerator.
 */
public class TestRandomGenerator {

    /** Constante RANDOM_INT. */
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
