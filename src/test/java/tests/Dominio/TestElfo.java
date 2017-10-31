package tests.Dominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Asesino;
import dominio.Elfo;
import dominio.Humano;
import dominio.MyRandomStub;


/**
 * The Class TestElfo.
 */
public class TestElfo {

	/** The Constant VAL_INT. */
	private static final int VAL_INT = 3;

	/** The Constant VAL_DOUBLE. */
	private static final double VAL_DOUBLE = 0.49;

	/** The Constant NIVEL_ELFO. */
	private static final int NIVEL_ELFO = VAL_INT;

	/** The Constant DANIO_CRIT. */
	private static final double DANIO_CRIT = 1.5;

	/** The Constant EVASION. */
	private static final double EVASION = 0.3;

	/** The Constant PROB_CRIT. */
	private static final double PROB_CRIT = 0.2;

	/** The Constant INTELIG. */
	private static final int INTELIG = 30;

	/** The Constant FUERZA. */
	private static final int FUERZA = 25;

	/** The Constant DESTREZA. */
	private static final int DESTREZA = 20;

	/** The Constant CIEN. */
	private static final int CIEN = 100;

	/**
	 * Test golpe level.
	 */
	@Test
	public void testGolpeLevel() {
		Elfo e = new Elfo("Nico", CIEN, CIEN, FUERZA, DESTREZA, INTELIG,
				new Asesino(PROB_CRIT, EVASION, DANIO_CRIT),
				0, NIVEL_ELFO, 1);
		Humano h = new Humano("Nico", CIEN, CIEN, FUERZA,
				DESTREZA, INTELIG,
				new Asesino(PROB_CRIT, EVASION, DANIO_CRIT),
				0, 1, 1);
		e.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		h.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		Assert.assertTrue(h.getSalud() == CIEN);
		if (e.habilidadRaza1(h)) {
			Assert.assertTrue(h.getSalud() < CIEN);
		} else {
			Assert.assertTrue(h.getSalud() == CIEN);
		}
	}

	/**
	 * Test ataque bosque.
	 */
	@Test
	public void testAtaqueBosque() {
		Elfo e = new Elfo("Nico", CIEN, CIEN, FUERZA, DESTREZA, INTELIG,
				new Asesino(PROB_CRIT, EVASION, DANIO_CRIT), 0,
				NIVEL_ELFO, 1);
		Humano h = new Humano("Nico", CIEN, CIEN, FUERZA,
				DESTREZA, INTELIG,
				new Asesino(PROB_CRIT, EVASION, DANIO_CRIT),
				0, 1, 1);
		e.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		h.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		Assert.assertTrue(h.getSalud() == CIEN);
		if (e.habilidadRaza2(h)) {
			Assert.assertTrue(h.getSalud() < CIEN);
		} else {
			Assert.assertTrue(h.getSalud() == CIEN);
		}
	}
}
