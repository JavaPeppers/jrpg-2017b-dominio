package tests.Dominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.NonPlayableCharacter;

/**
 * Clase para Testear a los NPC.
 */
public class TestNPC {

	/** Constante EXP_TEST. */
	private static final int EXP_TEST = 30;

	/**
	 * Test otorgar exp.
	 */
	@Test
	public void testOtorgarExp() {
		NonPlayableCharacter npc = new NonPlayableCharacter(
				"Gigante", 1, -1);
		Assert.assertEquals(EXP_TEST, npc.otorgarExp());
	}
}
