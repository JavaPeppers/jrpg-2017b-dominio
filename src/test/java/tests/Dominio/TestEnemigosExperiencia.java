package tests.Dominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Guerrero;
import dominio.Humano;
import dominio.MyRandomStub;
import dominio.NonPlayableCharacter;
import dominio.Personaje;


/**
 * Clase para Testear Experiencia obtenida luego.
 * de batallar contra Enemigos.
 */
public class TestEnemigosExperiencia {

	/** Constante EXP3. */
	private static final int EXP3 = 40;

	/** Constante EXP2. */
	private static final int EXP2 = 60;

	/** Constante EXP1. */
	private static final int EXP1 = 30;

	/** Constante EXP. */
	private static final int EXP = 30;

	/** Constante VAL_INT. */
	private static final int VAL_INT = 3;

	/** Constante VAL_DOUBLE. */
	private static final double VAL_DOUBLE = 0.49;

	/**
	 * Test pjvs NPC.
	 */
	@Test
	public void testPjvsNPC() {

		Humano h = new Humano("Nicolas", new Guerrero(), 1);
		NonPlayableCharacter npc = new NonPlayableCharacter(
				"Gigante", 1, 0);
		Personaje.cargarTablaNivel();
		Assert.assertEquals(0, h.getExperiencia());
		h.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		npc.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		while (npc.estaVivo()) {
			h.atacar(npc);
		}
		h.ganarExperiencia(npc.otorgarExp());
		Assert.assertEquals(EXP, h.getExperiencia());
	}

	/**
	 * Test mas fuerte mas experiencia.
	 */
	@Test
	public void testMasFuerteMasExperiencia() {
		NonPlayableCharacter npc = new NonPlayableCharacter(
				"Gigante", 1, 0);
		NonPlayableCharacter npc2 = new NonPlayableCharacter(
				"Gigante", 2, 0);

		Assert.assertEquals(EXP1, npc.otorgarExp());
		Assert.assertEquals(EXP2, npc2.otorgarExp());
	}

	/**
	 * Test pjvs pj.
	 */
	@Test
	public void testPjvsPj() {
		Humano h = new Humano("Nicolas", new Guerrero(), 1);
		Humano h2 = new Humano("Lautaro", new Guerrero(), 2);
		Personaje.cargarTablaNivel();
		h.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		h2.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		Assert.assertEquals(0, h.getExperiencia());
		Assert.assertEquals(0, h2.getExperiencia());

		while (h2.estaVivo()) {
			h.atacar(h2);
		}

		h.ganarExperiencia(h2.otorgarExp());
		Assert.assertEquals(EXP3, h.getExperiencia());
		Assert.assertEquals(0, h2.getExperiencia());

	}
}
