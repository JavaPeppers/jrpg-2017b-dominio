package tests.Dominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Asesino;
import dominio.Humano;
import dominio.Personaje;


/**
 * The Class TestCastaNuevo se usa para testear los castas nuevos.
 */
public class TestCastaNuevo {

	/** The Constant VALOR_CRITICO. */
	private static final int VALOR_CRITICO = 8;

	/**
	 * Test set probabilidad golpe critico.
	 */
	@Test
	public void testSetProbabilidadGolpeCritico() {
		Personaje p1 = new Humano("Ben Affleck", new Asesino(), 2);
		p1.getCasta().setProbabilidadGolpeCritico(VALOR_CRITICO);
		Assert.assertEquals(VALOR_CRITICO, p1.getCasta().
				getProbabilidadGolpeCritico(), 0);
	}

	/**
	 * Test set daño critico.
	 */
	@Test
	public void testSetDanioCritico() {
		Personaje p1 = new Humano("Ben Affleck", new Asesino(), 2);
		p1.getCasta().setDañoCritico(VALOR_CRITICO);
		Assert.assertEquals(VALOR_CRITICO, p1.getCasta().
				getDañoCritico(), 0);
	}

}
