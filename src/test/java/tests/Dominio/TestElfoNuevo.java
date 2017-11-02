package tests.Dominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Asesino;
import dominio.Elfo;
import dominio.Humano;
import dominio.MyRandomStub;
import dominio.Personaje;


/**
 * Clase para testear al nuevo elfo.
 */
public class TestElfoNuevo {

	/** Constante ENERGIA2. */
	private static final int ENERGIA2 = -100;

	/** Constante FUERZA. */
	private static final int FUERZA = -10;

	/** Constante ENERGIA. */
	private static final int ENERGIA = -110;

	/** Constante VAL_INT. */
	private static final int VAL_INT = 3;

	/** Constante VAL_DOUBLE. */
	private static final double VAL_DOUBLE = 0.49;

	/**
	 * Test habilidad raza 1.
	 */
	@Test
	public void testHabilidadRaza1() {
		Personaje p1 = new Elfo("Ben Affleck", new Asesino(), 2);
		Personaje p2 = new Humano("I'm Batman", new Asesino(), 2);
		p1.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		p2.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		p1.aumentarEnergia(ENERGIA);
		Assert.assertFalse(p1.habilidadRaza1(p2));
	}

	/**
	 * Test habilidad raza 1 S.
	 */
	@Test
	public void testHabilidadRaza1S() {
		Personaje p1 = new Elfo("Ben Affleck", new Asesino(), 2);
		Personaje p2 = new Humano("I'm Batman", new Asesino(), 2);
		p1.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		p2.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		p1.aumentarFuerza(FUERZA);
		Assert.assertFalse(p1.habilidadRaza1(p2));
	}

	/**
	 * Test habilidad raza 2.
	 */
	@Test
	public void testHabilidadRaza2() {
		Personaje p1 = new Elfo("Ben Affleck", new Asesino(), 2);
		Personaje p2 = new Humano("I'm Batman", new Asesino(), 2);
		p1.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		p2.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		p1.aumentarEnergia(ENERGIA2);
		Assert.assertFalse(p1.habilidadRaza2(p2));
	}

	/**
	 * Test habilidad raza 2 S.
	 */
	@Test
	public void testHabilidadRaza2S() {
		Personaje p1 = new Elfo("Ben Affleck", new Asesino(), 2);
		Personaje p2 = new Humano("I'm Batman", new Asesino(), 2);
		p1.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		p2.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		p1.setMagia(0);
		Assert.assertFalse(p1.habilidadRaza2(p2));
	}

}
