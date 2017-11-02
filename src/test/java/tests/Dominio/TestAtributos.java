package tests.Dominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Guerrero;
import dominio.Humano;



/**
 * Clase TestAtributos se usa para testear los atributos.
 */
public class TestAtributos {

	/** Constante INCREMENTO. */
	private static final int INCREMENTO = 10;

	/** Constante INTELIG_FIN. */
	private static final int INTELIG_FIN = 20;

	/** Constante INTELIG_INI. */
	private static final int INTELIG_INI = INCREMENTO;

	/** Constante DESTREZA_FIN. */
	private static final int DESTREZA_FIN = 20;

	/** Constante DESTREZA_INI. */
	private static final int DESTREZA_INI = INCREMENTO;

	/** Constante FUERZA_FIN. */
	private static final int FUERZA_FIN = 25;

	/** Constante FUERZA_INI. */
	private static final int FUERZA_INI = 15;

	/**
	 * Test incrementar fuerza.
	 */
	@Test
	public void testIncrementarFuerza() {
		Humano h = new Humano("Nicolas", new Guerrero(), 1);
		Assert.assertEquals(FUERZA_INI, h.getFuerza());
		h.AsignarPuntosSkills(INCREMENTO, 0, 0);
		Assert.assertEquals(FUERZA_FIN, h.getFuerza());

	}

	/**
	 * Test incrementar destreza.
	 */
	@Test
	public void testIncrementarDestreza() {
		Humano h = new Humano("Nicolas", new Guerrero(), 1);
		Assert.assertEquals(DESTREZA_INI, h.getDestreza());
		h.AsignarPuntosSkills(0, INCREMENTO, 0);
		Assert.assertEquals(DESTREZA_FIN, h.getDestreza());
	}

	/**
	 * Test incrementar inteligencia.
	 */
	@Test
	public void testIncrementarInteligencia() {
		Humano h = new Humano("Nicolas", new Guerrero(), 1);
		Assert.assertEquals(INTELIG_INI, h.getInteligencia());
		h.AsignarPuntosSkills(0, 0, INCREMENTO);
		Assert.assertEquals(INTELIG_FIN, h.getInteligencia());
	}
}
