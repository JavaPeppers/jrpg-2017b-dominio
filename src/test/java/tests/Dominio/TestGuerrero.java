package tests.Dominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Asesino;
import dominio.Elfo;
import dominio.Guerrero;
import dominio.Humano;
import dominio.MyRandomStub;

/**
 * Clase para Testear Guerrero.
 */
public class TestGuerrero {

	/** Constante DEF. */
	private static final int DEF = 65;

	/** Constante VAL_INT. */
	private static final int VAL_INT = 3;

	/** Constante VAL_DOUBLE. */
	private static final double VAL_DOUBLE = 0.49;

	/** Constante NIVEL. */
	private static final int NIVEL = VAL_INT;

	/** Constante DANIO_CRIT. */
	private static final double DANIO_CRIT = 1.5;

	/** Constante EVASION. */
	private static final double EVASION = 0.3;

	/** Constante PROB_CRIT. */
	private static final double PROB_CRIT = 0.2;

	/** Constante INTELIGENCIA. */
	private static final int INTELIGENCIA = 30;

	/** Constante DESTREZA. */
	private static final int DESTREZA = 20;

	/** Constante FUERZA. */
	private static final int FUERZA = 25;

	/** Constante CIEN. */
	private static final int CIEN = 100;

	/**
	 * Test doble golpe.
	 */
	@Test
	public void testDobleGolpe() {
		Humano h = new Humano("Nico", CIEN, CIEN, FUERZA,
				DESTREZA, INTELIGENCIA,
				new Guerrero(PROB_CRIT, EVASION, DANIO_CRIT),
				0, 1, 1);
		Elfo e = new Elfo("Nico", CIEN, CIEN, FUERZA,
				DESTREZA, INTELIGENCIA,
				new Asesino(PROB_CRIT, EVASION, DANIO_CRIT),
				0, NIVEL, 1);
		h.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		e.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		Assert.assertEquals(CIEN, e.getSalud());
		if (h.habilidadCasta1(e)) {
			Assert.assertTrue(e.getSalud() < CIEN);
		} else {
			Assert.assertEquals(CIEN, e.getSalud());
		}
	}

	/**
	 * Test auto defensa.
	 */
	@Test
	public void testAutoDefensa() {
		Humano h = new Humano("Nico", CIEN, CIEN, FUERZA,
				DESTREZA, INTELIGENCIA,
				new Guerrero(PROB_CRIT, EVASION, DANIO_CRIT),
				0, 1, 1);
		h.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		Assert.assertEquals(DESTREZA, h.getDefensa());
		h.habilidadCasta2(null);
		Assert.assertEquals(DEF, h.getDefensa());
	}

	/**
	 * Test ignora defensa.
	 */
	@Test
	public void testIgnoraDefensa() {
		Humano h = new Humano("Nico", CIEN, CIEN, FUERZA,
				DESTREZA, INTELIGENCIA,
				new Guerrero(PROB_CRIT, EVASION, DANIO_CRIT),
				0, 1, 1);
		Elfo e = new Elfo("Nico", CIEN, CIEN, FUERZA,
				DESTREZA, INTELIGENCIA,
				new Asesino(PROB_CRIT, EVASION, DANIO_CRIT),
				0, NIVEL, 1);
		h.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		e.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		Assert.assertEquals(CIEN, e.getSalud());
		if (h.habilidadCasta3(e)) {
			Assert.assertTrue(e.getSalud() < CIEN);
		} else {
			Assert.assertEquals(CIEN, e.getSalud());
		}
	}

}
