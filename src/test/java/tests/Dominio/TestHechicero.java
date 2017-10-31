package tests.Dominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Asesino;
import dominio.Elfo;
import dominio.Hechicero;
import dominio.Humano;
import dominio.MyRandomStub;

/**
 * The Class TestHechicero.
 */
public class TestHechicero {

	/** The Constant BONUS_SALUD. */
	private static final int BONUS_SALUD = 35;

	/** The Constant BONUS_ENERGIA. */
	private static final int BONUS_ENERGIA = -55;

	/** The Constant SALUD_TEST. */
	private static final int SALUD_TEST = 65;

	/** The Constant VAL_INT. */
	private static final int VAL_INT = 3;

	/** The Constant VAL_DOUBLE. */
	private static final double VAL_DOUBLE = 0.49;

	/** The Constant CINCUENTA. */
	private static final int CINCUENTA = 50;

	/** The Constant FUERZA_ELFO. */
	private static final int FUERZA_ELFO = 25;

	/** The Constant NIVEL. */
	private static final int NIVEL = VAL_INT;

	/** The Constant DANIO_CRIT. */
	private static final double DANIO_CRIT = 1.5;

	/** The Constant EVASION. */
	private static final double EVASION = 0.3;

	/** The Constant PROB_CRIT. */
	private static final double PROB_CRIT = 0.2;

	/** The Constant FUERZA_HUM. */
	private static final int FUERZA_HUM = 55;

	/** The Constant INTELIG. */
	private static final int INTELIG = 30;

	/** The Constant DESTREZA. */
	private static final int DESTREZA = 20;

	/** The Constant CIEN. */
	private static final int CIEN = 100;

	/**
	 * Test curar.
	 */
	@Test
	public void testCurar() {
		Humano h = new Humano("Nico", CIEN, CIEN, FUERZA_HUM,
				DESTREZA, INTELIG,
				new Hechicero(PROB_CRIT, EVASION, DANIO_CRIT),
				0, 1, 1);
		Elfo e = new Elfo("Nico", CIEN, CIEN, FUERZA_ELFO,
				DESTREZA, INTELIG,
				new Asesino(PROB_CRIT, EVASION, DANIO_CRIT),
				0, NIVEL, 1);
		h.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		e.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		Assert.assertEquals(CIEN, e.getSalud());
		e.reducirSalud(BONUS_SALUD);
		Assert.assertEquals(SALUD_TEST, e.getSalud());
		h.habilidadCasta2(e);
		Assert.assertTrue(e.getSalud() > SALUD_TEST);
	}

	/**
	 * Test bola de fuego.
	 */
	@Test
	public void testBolaDeFuego() {
		Humano h = new Humano("Nico", CIEN, CIEN, FUERZA_HUM,
				DESTREZA, INTELIG,
				new Hechicero(PROB_CRIT, EVASION, DANIO_CRIT),
				0, 1, 1);
		Elfo e = new Elfo("Nico", CIEN, CIEN, FUERZA_ELFO,
				DESTREZA, INTELIG,
				new Asesino(PROB_CRIT, EVASION, DANIO_CRIT),
				0, NIVEL, 1);
		h.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		e.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		Assert.assertEquals(CIEN, e.getSalud());
		if (h.habilidadCasta1(e)) {
			Assert.assertEquals(true, e.getSalud() < CIEN);
		} else {
			Assert.assertEquals(true, e.getSalud() == CIEN);
		}
	}

	/**
	 * Test robar energia y salud.
	 */
	@Test
	public void testRobarEnergiaYSalud() {
		Humano h = new Humano("Nico", CIEN, CIEN, FUERZA_HUM,
				DESTREZA, CINCUENTA,
				new Hechicero(PROB_CRIT, EVASION, DANIO_CRIT),
				0, 1, 1);
		Elfo e = new Elfo("Nico", CIEN, CIEN, FUERZA_ELFO,
				DESTREZA, INTELIG,
				new Asesino(PROB_CRIT, EVASION, DANIO_CRIT),
				0, NIVEL, 1);
		h.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		e.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		Assert.assertEquals(CIEN, e.getSalud());
		h.reducirSalud(CINCUENTA);
		h.aumentarEnergia(BONUS_ENERGIA);
		if (h.habilidadCasta3(e)) {
			Assert.assertEquals(true, e.getSalud() < CIEN);
			Assert.assertEquals(true, h.getEnergia() > CINCUENTA);
			Assert.assertEquals(true, h.getSalud() > CINCUENTA);
		} else {
			Assert.assertEquals(CINCUENTA, h.getSalud());
			Assert.assertEquals(true, h.getEnergia() < CINCUENTA);
			Assert.assertEquals(CIEN, e.getSalud());
		}
	}
}
