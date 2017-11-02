package tests.Dominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Guerrero;
import dominio.Humano;
import dominio.Personaje;


/**
 *  Clase TestAsignarPuntos se usa para testear el asignar puntos.
 */
public class TestAsignarPuntos {

	/** Constante TOPE. */
	private static final int TOPE = 199;

	/** Constante INTELIGENCIA. */
	private static final int INTELIGENCIA = 189;

	/** Constante DESTREZA. */
	private static final int DESTREZA = 189;

	/** Constante FUERZA. */
	private static final int FUERZA = 184;

	/** Constante ENERGIA_TOPE2. */
	private static final int ENERGIA_TOPE2 = 125;

	/** Constante ENERGIA_TOPE1. */
	private static final int ENERGIA_TOPE1 = 105;

	/** Constante EXP. */
	private static final int EXP = 50;

	/** Constante SALUD_TOPE2. */
	private static final int SALUD_TOPE2 = 130;

	/** Constante SALUD_TOPE1. */
	private static final int SALUD_TOPE1 = 105;

	/**
	 * Test aumentar salud tope.
	 */
	@Test
	public void testAumentarSaludTope() {
		Personaje.cargarTablaNivel();

		Humano h = new Humano("Nicolas", new Guerrero(), 1);
		Assert.assertEquals(SALUD_TOPE1, h.getSaludTope());
		h.ganarExperiencia(EXP);
		Assert.assertEquals(SALUD_TOPE2, h.getSaludTope());
	}

	/**
	 * Test aumentar energia tope.
	 */
	@Test
	public void testAumentarEnergiaTope() {
		Personaje.cargarTablaNivel();

		Humano h = new Humano("Nicolas", new Guerrero(), 1);
		Assert.assertEquals(ENERGIA_TOPE1, h.getEnergiaTope());
		h.ganarExperiencia(EXP);
		Assert.assertEquals(ENERGIA_TOPE2, h.getEnergiaTope());
	}

	/**
	 * Test mas de 200 puntos.
	 */
	@Test
	public void testMasDe200Puntos() {
		Humano h = new Humano("Nicolas", new Guerrero(), 1);
		h.aumentarFuerza(FUERZA);
		h.aumentarDestreza(DESTREZA);
		h.aumentarInteligencia(INTELIGENCIA);
		h.AsignarPuntosSkills(2, 2, 2);
		Assert.assertEquals(TOPE, h.getFuerza());
		Assert.assertEquals(TOPE, h.getDestreza());
		Assert.assertEquals(TOPE, h.getInteligencia());
	}
}
