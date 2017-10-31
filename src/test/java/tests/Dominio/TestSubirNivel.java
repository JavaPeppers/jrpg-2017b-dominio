package tests.Dominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Guerrero;
import dominio.Humano;
import dominio.Personaje;

/**
 * The Class TestSubirNivel.
 */
public class TestSubirNivel {

	/** The Constant NIVEL_3. */
	private static final int NIVEL_3 = 3;

	/** The Constant EXP_150. */
	private static final int EXP_150 = 150;

	/** The Constant NIVEL. */
	private static final int NIVEL = 100;

	/** The Constant EXP_300_000. */
	private static final int EXP_300_000 = 300_000;

	/** The Constant BONUS_EXP. */
	private static final int BONUS_EXP = 50;

	/**
	 * Test subirde nivel.
	 */
	@Test
	public void testSubirdeNivel() {
		Personaje.cargarTablaNivel();
		Humano h = new Humano("Nicolas", new Guerrero(), 1);
		Assert.assertEquals(1, h.getNivel());
		h.ganarExperiencia(BONUS_EXP);
		Assert.assertEquals(2, h.getNivel());
	}

	/**
	 * Test nivel 100.
	 */
	@Test
	public void testNivel100() {
		Personaje.cargarTablaNivel();
		Humano h = new Humano("Nicolas", new Guerrero(), 1);
		h.ganarExperiencia(EXP_300_000);
		Assert.assertEquals(NIVEL, h.getNivel());
		h.subirNivel();
		Assert.assertEquals(NIVEL, h.getNivel());

	}

	/**
	 * Test ganar mucha exp.
	 */
	@Test
	public void testGanarMuchaExp() {
		Personaje.cargarTablaNivel();
		Humano h = new Humano("Nicolas", new Guerrero(), 1);
		Assert.assertEquals(1, h.getNivel());
		h.ganarExperiencia(EXP_150);
		Assert.assertEquals(NIVEL_3, h.getNivel());
	}
}
