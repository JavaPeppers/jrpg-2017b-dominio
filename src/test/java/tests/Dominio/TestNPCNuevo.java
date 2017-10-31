package tests.Dominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Asesino;
import dominio.Humano;
import dominio.MyRandomStub;
import dominio.NonPlayableCharacter;
import dominio.Personaje;

/**
 * The Class TestNPCNuevo.
 */
public class TestNPCNuevo {

	/** The Constant VAL_DOUBLE2. */
	private static final double VAL_DOUBLE2 = 0.1;

	/** The Constant VAL_INT. */
	private static final int VAL_INT = 3;

	/** The Constant VAL_DOUBLE1. */
	private static final double VAL_DOUBLE1 = 0.49;

	/**
	 * Test nivel NPC 1.
	 */
	@Test
	public void testNivelNPC1() {
		NonPlayableCharacter npc = new NonPlayableCharacter(
				"Pepe", 1, 1);
		Assert.assertEquals(4, npc.getDefensa());
		Assert.assertEquals(20, npc.getFuerza());
		Assert.assertEquals(60, npc.getSalud());
	}

	/**
	 * Test danio menor A def.
	 */
	@Test
	public void testDanioMenorADef() {
		NonPlayableCharacter npc = new NonPlayableCharacter(
				"Pepe", 1, 1);
		Assert.assertEquals(0, npc.serAtacado(1));
	}

	/**
	 * Test get fuerza.
	 */
	@Test
	public void testGetFuerza() {
		NonPlayableCharacter npc = new NonPlayableCharacter(
				"Pepe", 1, 1);
		Assert.assertEquals(20, npc.getFuerza());
	}

	/**
	 * Test set ataque.
	 */
	@Test
	public void testSetAtaque() {
		NonPlayableCharacter npc = new NonPlayableCharacter(
				"Pepe", 1, 1);
		npc.setAtaque(60);
		Assert.assertEquals(80, npc.getFuerza());
	}

	/**
	 * Test get magia.
	 */
	@Test
	public void testGetMagia() {
		NonPlayableCharacter npc = new NonPlayableCharacter(
				"Pepe", 1, 1);
		Assert.assertEquals(0, npc.getMagia());
	}

	/**
	 * Test atacar.
	 */
	@Test
	public void testAtacar() {
		NonPlayableCharacter npc = new NonPlayableCharacter(
				"Pepe", 1, 1);
		NonPlayableCharacter npc2 = new NonPlayableCharacter(
				"Pepe", 1, 1);
		Personaje p1 = new Humano("Ben Affleck", new Asesino(), 2);
		npc.setRandom(new MyRandomStub(VAL_DOUBLE1, VAL_INT));
		npc2.setRandom(new MyRandomStub(VAL_DOUBLE1, VAL_INT));
		p1.setRandom(new MyRandomStub(VAL_DOUBLE1, VAL_INT));
		// Recordar que trunca porque es entero
		// NPC 20 - (5/2) = 18
		// P1 20 - 15 = 5
		Assert.assertEquals(18, npc.atacar(npc2));
		Assert.assertEquals(5, npc.atacar(p1));
	}

	/**
	 * Test set salud.
	 */
	@Test
	public void testSetSalud() {
		NonPlayableCharacter npc = new NonPlayableCharacter(
				"Pepe", 1, 1);
		npc.setSalud(80);
		Assert.assertEquals(80, npc.getSalud());
	}

	/**
	 * Test nivel NPC default.
	 */
	@Test
	public void testNivelNPCDefault() {
		NonPlayableCharacter npc = new NonPlayableCharacter(
				"Pepe", 1, 9);
		Assert.assertEquals(20, npc.getDefensa());
		Assert.assertEquals(100, npc.getFuerza());
		Assert.assertEquals(300, npc.getSalud());
	}

	/**
	 * Test nivel 3 NPC.
	 */
	@Test
	public void testNivel3NPC() {
		NonPlayableCharacter npc = new NonPlayableCharacter(
				"Pepe", 1, 2);
		Assert.assertEquals(6, npc.getDefensa());
		Assert.assertEquals(90, npc.getSalud());
		Assert.assertEquals(30, npc.getFuerza());
	}

	/**
	 * Test atacar 2.
	 */
	@Test
	public void testAtacar2() {
		NonPlayableCharacter npc = new NonPlayableCharacter(
				"Pepe", 1, 1);
		NonPlayableCharacter npc2 = new NonPlayableCharacter(
				"Pepe", 1, 1);
		Personaje p1 = new Humano("Ben Affleck", new Asesino(), 2);
		npc.setRandom(new MyRandomStub(VAL_DOUBLE2, VAL_INT));
		npc2.setRandom(new MyRandomStub(VAL_DOUBLE2, VAL_INT));
		p1.setRandom(new MyRandomStub(VAL_DOUBLE1, VAL_INT));
		// Recordar que trunca porque es entero
		// NPC 20 - (5/2) = 18
		// P1 20 - 15 = 5
		Assert.assertEquals(0, npc.atacar(npc2));
		Assert.assertEquals(15, npc.atacar(p1));
	}
}
