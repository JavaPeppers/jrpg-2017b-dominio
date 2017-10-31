package tests.Dominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Asesino;
import dominio.Humano;
import dominio.MyRandomStub;
import dominio.Orco;
import dominio.Personaje;


/**
 * The Class TestOrcoNuevo.
 */
public class TestOrcoNuevo {

	/** The Constant BONUS_FUERZA. */
	private static final int BONUS_FUERZA = -10;

	/** The Constant BONUS_ENERGIA. */
	private static final int BONUS_ENERGIA = -100;

	/** The Constant VAL_INT. */
	private static final int VAL_INT = 3;

	/** The Constant VAL_DOUBLE. */
	private static final double VAL_DOUBLE = 0.49;

	/**
	 * Test habilidad raza 1.
	 */
	@Test
	public void testHabilidadRaza1() {
		Personaje p1 = new Orco("Ben Affleck", new Asesino(), 2);
		Personaje p2 = new Humano("I'm Batman", new Asesino(), 2);
		p1.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		p2.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		p1.aumentarEnergia(BONUS_ENERGIA);
		Assert.assertFalse(p1.habilidadRaza1(p2));
	}

	/**
	 * Test habilidad raza 1 S.
	 */
	@Test
	public void testHabilidadRaza1S() {
		Personaje p1 = new Orco("Ben Affleck", new Asesino(), 2);
		Personaje p2 = new Humano("I'm Batman", new Asesino(), 2);
		p1.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		p2.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		p1.reducirDefensa(p1.getDefensa());
		Assert.assertFalse(p1.habilidadRaza1(p2));
	}

	/**
	 * Test habilidad raza 2.
	 */
	@Test
	public void testHabilidadRaza2() {
		Personaje p1 = new Orco("Ben Affleck", new Asesino(), 2);
		Personaje p2 = new Humano("I'm Batman", new Asesino(), 2);
		p1.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		p2.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		p1.aumentarEnergia(BONUS_ENERGIA);
		Assert.assertFalse(p1.habilidadRaza2(p2));
	}

	/**
	 * Test habilidad raza 2 S.
	 */
	@Test
	public void testHabilidadRaza2S() {
		Personaje p1 = new Orco("Ben Affleck", new Asesino(), 2);
		Personaje p2 = new Humano("I'm Batman", new Asesino(), 2);
		p1.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		p2.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		p1.aumentarFuerza(BONUS_FUERZA);
		Assert.assertFalse(p1.habilidadRaza2(p2));
	}

}
