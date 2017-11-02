package tests.Dominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Asesino;
import dominio.Hechicero;
import dominio.Humano;
import dominio.MyRandomStub;



/**
 * La clase TestAsesino se usa para testear a los Asesinos.
 */
public class TestAsesino {

	/** Constante DELTA3. */
	private static final double DELTA3 = 0.1;

	/** Constante EXPECTED3. */
	private static final double EXPECTED3 = 0.5;

	/** Constante DELTA2. */
	private static final double DELTA2 = 0.01;

	/** Constante EXPECTED2. */
	private static final double EXPECTED2 = 0.45;

	/** Constante DELTA1. */
	private static final double DELTA1 = 0.1;

	/** Constante EXPECTED1. */
	private static final double EXPECTED1 = 0.3;

	/** Constante ID. */
	private static final int ID = 1;

	/** Constante NIVEL. */
	private static final int NIVEL = 1;

	/** Constante EXP. */
	private static final int EXP = 0;

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

	/** Constante ENERGIA. */
	private static final int ENERGIA = 100;

	/** Constante SALUD. */
	private static final int SALUD = 100;

	/** Constante SALUD_TEST2. */
	private static final int SALUD_TEST2 = 93;

	/** Constante SALUD_TEST1. */
	private static final int SALUD_TEST1 = 105;

	/** Constante VAL_INT. */
	private static final int VAL_INT = 3;

	/** Constante VAL_DOUBLE. */
	private static final double VAL_DOUBLE = 0.49;

	/**
	 * Test robar.
	 */
	@Test
	public void testRobar() {
	}

	/**
	 * Test critico.
	 */
	@Test
	public void testCritico() {
		Humano h = new Humano("Nicolas", new Asesino(), 1);
		Humano h2 = new Humano("Lautaro", new Hechicero(), 2);
		h.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		h2.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		Assert.assertEquals(SALUD_TEST1, h2.getSalud());
		if (h.habilidadCasta1(h2)) {
			Assert.assertEquals(SALUD_TEST2, h2.getSalud());
		} else {
			Assert.assertEquals(SALUD_TEST1, h2.getSalud());
		}
	}

	/**
	 * Test prob evasion.
	 */
	@Test
	public void testProbEvasion() {
		Humano h = new Humano("Nico", SALUD, ENERGIA, FUERZA, DESTREZA,
				INTELIGENCIA,
				new Asesino(PROB_CRIT, EVASION, DANIO_CRIT),
				EXP, NIVEL, ID);
		h.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));

		Assert.assertEquals(EXPECTED1, h.getCasta().
				getProbabilidadEvitarDaño(), DELTA1);
		h.habilidadCasta2(null);
		Assert.assertEquals(EXPECTED2, h.getCasta().
				getProbabilidadEvitarDaño(), DELTA2);
		h.habilidadCasta2(null);
		Assert.assertEquals(EXPECTED3, h.getCasta().
				getProbabilidadEvitarDaño(), DELTA3);
	}
}
