package tests.Dominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Alianza;
import dominio.Asesino;
import dominio.Guerrero;
import dominio.Humano;
import dominio.MyRandomStub;


/**
 *  Clase TestAliarCombatir se usa para testear
 *  y combatir con alianzas.
 */
public class TestAliarCombatir {

	/**  Constante SALUD_TEST. */
	private static final int SALUD_TEST = 105;

	/**  Constante VAL_INT. */
	private static final int VAL_INT = 3;

	/**  Constante VAL_DOUBLE. */
	private static final double VAL_DOUBLE = 0.49;

	/**
	 * Test crearAlianza para testear la creacion de una alianza.
	 */
	@Test
	public void testCrearAlianza() {
		Humano h = new Humano("Nicolas", new Guerrero(), 1);
		Humano h2 = new Humano("Lautaro", new Guerrero(), 1);

		Assert.assertNull(h.getClan());
		Assert.assertNull(h2.getClan());
		h.aliar(h2);
		Assert.assertNotNull(h.getClan());
		Assert.assertNotNull(h2.getClan());
	}

	/**
	 * se Testea dañar.
	 */
	@Test
	public void testDañar() {
		Humano h = new Humano("Nicolas", new Guerrero(), 1);
		Humano h2 = new Humano("Lautaro", new Asesino(), 1);
		h.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		h2.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		Assert.assertEquals(SALUD_TEST, h2.getSalud());
		if (h.atacar(h2) != 0) {
			Assert.assertTrue(h2.getSalud() < SALUD_TEST);
		} else {
			Assert.assertTrue(h2.getSalud() == SALUD_TEST);
		}
	}

	/**
	 * se Testea aliar.
	 */
	@Test
	public void testAliar() {
		Humano h = new Humano("Nicolas", new Guerrero(), 1);
		Humano h2 = new Humano("Lautaro", new Guerrero(), 1);
		Alianza a1 = new Alianza("Los CacheFC");
		h.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		h2.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		Assert.assertNull(h2.getClan());
		Assert.assertNull(h.getClan());
		h.setClan(a1);
		Assert.assertNotNull(h.getClan());
		h.aliar(h2);
		Assert.assertEquals(h.getClan(), h2.getClan());
	}

}
