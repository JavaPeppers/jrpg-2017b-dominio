package tests.Dominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Guerrero;
import dominio.Humano;


/**
 * Clase TestAtaqueCritico se utiliza para testear el ataque critico.
 */
public class TestAtaqueCritico {

	/** Constante GOLPE_CRIT. */
	private static final double GOLPE_CRIT = 1.5;

	/**
	 * Testgolpe crit.
	 */
	@Test
	public void testgolpeCrit() {
		Humano h = new Humano("Nicolas", new Guerrero(), 1);
		Assert.assertEquals(h.getAtaque() * GOLPE_CRIT,
				h.golpeCritico(), 1);
	}
}
