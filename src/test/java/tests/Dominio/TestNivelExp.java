package tests.Dominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Asesino;
import dominio.Humano;
import dominio.Personaje;

/**
 * The Class TestNivelExp.
 */
public class TestNivelExp {

	/** The Constant EXP3. */
	private static final int EXP3 = 10000;

	/** The Constant NIVEL. */
	private static final int NIVEL = 99;

	/** The Constant NIVEL_TEST. */
	private static final int NIVEL_TEST = 4;

	/** The Constant EXP2. */
	private static final int EXP2 = 300;

	/** The Constant EXP1. */
	private static final int EXP1 = 45;

	/** The Constant DANIO_CRIT. */
	private static final double DANIO_CRIT = 1.5;

	/** The Constant EVASION. */
	private static final double EVASION = 0.3;

	/** The Constant PROB_CRIT. */
	private static final double PROB_CRIT = 0.2;

	/** The Constant INTELIGENCIA. */
	private static final int INTELIGENCIA = 30;

	/** The Constant DESTREZA. */
	private static final int DESTREZA = 20;

	/** The Constant FUERZA. */
	private static final int FUERZA = 25;

	/** The Constant CIEN. */
	private static final int CIEN = 100;

	/**
	 * Test ganar exp.
	 */
	@Test
	public void testGanarExp() {
		Personaje.cargarTablaNivel();
		Humano h = new Humano("Nico", CIEN, CIEN, FUERZA,
				DESTREZA, INTELIGENCIA,
				new Asesino(PROB_CRIT, EVASION, DANIO_CRIT),
				0, 1, 1);
		h.ganarExperiencia(EXP1);
		Assert.assertEquals(EXP1, h.getExperiencia());
	}

	/**
	 * Test subir nivel.
	 */
	@Test
	public void testSubirNivel() {
		Personaje.cargarTablaNivel();
		Humano h = new Humano("Nico", CIEN, CIEN, FUERZA,
				DESTREZA, INTELIGENCIA,
				new Asesino(PROB_CRIT, EVASION, DANIO_CRIT),
				0, 1, 1);
		h.ganarExperiencia(EXP2);
		Assert.assertEquals(NIVEL_TEST, h.getNivel());
		Assert.assertEquals(0, h.getExperiencia());
	}

	/**
	 * Test level 100.
	 */
	@Test
	public void testLevel100() {
		Personaje.cargarTablaNivel();
		Humano h = new Humano("Nico", CIEN, CIEN, FUERZA,
				DESTREZA, INTELIGENCIA,
				new Asesino(PROB_CRIT, EVASION, DANIO_CRIT),
				0, NIVEL, 1);
		h.ganarExperiencia(EXP3);
		Assert.assertEquals(CIEN, h.getNivel());
	}
}
