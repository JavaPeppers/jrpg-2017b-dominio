package tests.Dominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Asesino;
import dominio.Humano;
import dominio.MyRandomStub;
import dominio.Personaje;



/**
 * The Class TestAsesinoNuevo Se usa para testear al asesino nuevo.
 */
public class TestAsesinoNuevo {

	/** The Constant ENERGIA_A_REDUCIR. */
	private static final int ENERGIA_A_REDUCIR = 105;

	/** The Constant VAL_INT. */
	private static final int VAL_INT = 3;

	/** The Constant VAL_DOUBLE. */
	private static final double VAL_DOUBLE = 0.49;

	/**
	 * Test habilidad 1.
	 */
	@Test
	public void testHabilidad1() {
		Personaje p1 = new Humano("Ben Affleck", new Asesino(), 2);
		Personaje p2 = new Humano("Batman", new Asesino(), 2);
		p1.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		p2.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		p1.reducirEnergia(ENERGIA_A_REDUCIR);
		Assert.assertFalse(p1.habilidadCasta1(p2));
	}

	/**
	 * Test habilidad 1 S.
	 */
	@Test
	public void testHabilidad1S() {
		Personaje p1 = new Humano("Ben Affleck", new Asesino(), 2);
		Personaje p2 = new Humano("Batman", new Asesino(), 2);
		p1.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		p2.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		p1.setAtaque(0);
		Assert.assertFalse(p1.habilidadCasta1(p2));
	}

	/**
	 * Test habilidad 2.
	 */
	@Test
	public void testHabilidad2() {
		Personaje p1 = new Humano("Ben Affleck", new Asesino(), 2);
		Personaje p2 = new Humano("Batman", new Asesino(), 2);
		p1.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		p2.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		p1.reducirEnergia(ENERGIA_A_REDUCIR);
		Assert.assertFalse(p1.habilidadCasta2(p2));
	}

	/**
	 * Test habilidad 3.
	 */
	@Test
	public void testHabilidad3() {
		Personaje p1 = new Humano("Ben Affleck", new Asesino(), 2);
		p1.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));

		Assert.assertFalse(p1.habilidadCasta3(null));
	}

}
