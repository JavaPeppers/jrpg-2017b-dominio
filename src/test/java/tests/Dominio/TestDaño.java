package tests.Dominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Guerrero;
import dominio.Humano;
import dominio.MyRandomStub;
import dominio.Orco;


/**
 * Clase TestDaño se usa para testear daños.
 */
public class TestDaño {

	/** Constante DANIO_CRIT. */
	private static final double DANIO_CRIT = 1.5;

	/** Constante EVASION. */
	private static final double EVASION = 0.3;

	/** Constante PROB_CRIT. */
	private static final double PROB_CRIT = 0.2;

	/** Constante DEST_HUM2. */
	private static final int DEST_HUM2 = 25;

	/** Constante DEST_HUM1. */
	private static final int DEST_HUM1 = 20;

	/** Constante DEST_ORCO. */
	private static final int DEST_ORCO = 15;

	/** Constante INTELIG. */
	private static final int INTELIG = 30;

	/** Constante CIEN. */
	private static final int CIEN = 100;

	/** Constante VAL_INT. */
	private static final int VAL_INT = 3;

	/** Constante VAL_DOUBLE. */
	private static final double VAL_DOUBLE = 0.49;

	/**
	 * Test ataque comun Y la salud no baje de 0.
	 */
	@Test
	public void testAtaqueComunYLaSaludNoBajeDe0() {
		Humano h = new Humano("Nico", CIEN, CIEN, CIEN,
				DEST_HUM1, INTELIG,
				new Guerrero(PROB_CRIT, EVASION, DANIO_CRIT),
				0, 1, 1);
		Orco o = new Orco("Nico", CIEN, CIEN, DEST_ORCO, 0, INTELIG,
				new Guerrero(PROB_CRIT, 0, DANIO_CRIT),
				0, 1, 1);
		h.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		o.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		Assert.assertEquals(CIEN, o.getSalud());
		if (h.atacar(o) != 0) {
			Assert.assertEquals(0, o.getSalud());
			h.atacar(o);
			Assert.assertEquals(0, o.getSalud());
			h.atacar(o);
			Assert.assertEquals(0, o.getSalud());
		} else {
			Assert.assertTrue(o.getSalud() == 0);
		}
	}

	/**
	 * Test los muertos no atacan.
	 */
	@Test
	public void testLosMuertosNoAtacan() {
		Humano h = new Humano("Nico", CIEN, CIEN, DEST_HUM2, 0, INTELIG,
				new Guerrero(PROB_CRIT, 0, DANIO_CRIT),
				0, 1, 1);
		Orco o = new Orco("Nico", CIEN, CIEN, DEST_ORCO, 0, INTELIG,
				new Guerrero(PROB_CRIT, 0, DANIO_CRIT),
				0, 1, 1);
		h.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		o.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		h.atacar(o);
		h.atacar(o);
		h.atacar(o);
		h.atacar(o);

		o.atacar(h);
		Assert.assertEquals(CIEN, h.getSalud());
	}
}