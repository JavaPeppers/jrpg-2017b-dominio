package tests.Dominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Asesino;
import dominio.Humano;
import dominio.Personaje;

/**
 * Clase para Testear Subir de nivel
 * ganando Experiencia.
 */
public class TestNivelExp {

	/** Constante EXP3. */
	private static final int EXP3 = 10000;

	/** Constante NIVEL. */
	private static final int NIVEL = 99;

	/** Constante NIVEL_TEST. */
	private static final int NIVEL_TEST = 4;

	/** Constante EXP2. */
	private static final int EXP2 = 300;

	/** Constante EXP1. */
	private static final int EXP1 = 45;

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
