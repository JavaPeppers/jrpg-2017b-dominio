package tests.Dominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Asesino;
import dominio.Humano;
import dominio.MyRandomStub;
import dominio.Personaje;

/**
 * Clase para testear Humano Nuevo.
 */
public class TestHumanoNuevo {

	/** Constante TEST_ENERGIA2. */
	private static final int TEST_ENERGIA2 = 95;

	/** Constante TEST_ENERGIA1. */
	private static final int TEST_ENERGIA1 = 105;

	/** Constante BONUS_ENERGIA. */
	private static final int BONUS_ENERGIA = -100;

	/** Constante VAL_INT. */
	private static final int VAL_INT = 3;

	/** Constante VAL_DOUBLE. */
	private static final double VAL_DOUBLE = 0.49;

	/**
	 * Test habilidad raza 1.
	 */
	@Test
	public void testHabilidadRaza1() {
		Personaje p1 = new Humano("Ben Affleck", new Asesino(), 2);
		Personaje p2 = new Humano("I'm Batman", new Asesino(), 2);
		p1.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		p2.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		p1.aumentarEnergia(BONUS_ENERGIA);
		Assert.assertFalse(p1.habilidadRaza1(p2));
	}

	/**
	 * Test habilidad raza 2.
	 */
	@Test
	public void testHabilidadRaza2() {
		Personaje p1 = new Humano("Ben Affleck", new Asesino(), 2);
		Personaje p2 = new Humano("I'm Batman", new Asesino(), 2);
		p1.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		p2.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		p2.reducirSalud(p2.getSalud());
		Assert.assertEquals(TEST_ENERGIA1, p1.getEnergia());
		Assert.assertFalse(p1.habilidadRaza2(p2));
		Assert.assertEquals(TEST_ENERGIA2, p1.getEnergia());
	}

	/**
	 * Test habilidad raza 2 S.
	 */
	@Test
	public void testHabilidadRaza2S() {
		Personaje p1 = new Humano("Ben Affleck", new Asesino(), 2);
		Personaje p2 = new Humano("I'm Batman", new Asesino(), 2);
		p1.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		p2.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		p1.aumentarEnergia(BONUS_ENERGIA);
		Assert.assertFalse(p1.habilidadRaza2(p2));
	}

}
