package tests.Dominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Guerrero;
import dominio.Humano;
import dominio.Personaje;


/**
 * The Class TestAsignarPuntos se usa para testear el asignar puntos.
 */
public class TestAsignarPuntos {

	/** The Constant TOPE. */
	private static final int TOPE = 199;

	/** The Constant INTELIGENCIA. */
	private static final int INTELIGENCIA = 189;

	/** The Constant DESTREZA. */
	private static final int DESTREZA = 189;

	/** The Constant FUERZA. */
	private static final int FUERZA = 184;

	/** The Constant ENERGIA_TOPE2. */
	private static final int ENERGIA_TOPE2 = 125;

	/** The Constant ENERGIA_TOPE1. */
	private static final int ENERGIA_TOPE1 = 105;

	/** The Constant EXP. */
	private static final int EXP = 50;

	/** The Constant SALUD_TOPE2. */
	private static final int SALUD_TOPE2 = 130;

	/** The Constant SALUD_TOPE1. */
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
