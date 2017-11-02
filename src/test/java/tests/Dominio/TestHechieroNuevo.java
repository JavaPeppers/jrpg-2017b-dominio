package tests.Dominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Asesino;
import dominio.Hechicero;
import dominio.Humano;
import dominio.MyRandomStub;
import dominio.NonPlayableCharacter;
import dominio.Personaje;


/**
 * Clase para Testear Hechiero Nuevo.
 */
public class TestHechieroNuevo {

	/** Constante BONUS_INTELIG. */
	private static final int BONUS_INTELIG = -20;

	/** Constante BONUS_ENERGIA. */
	private static final int BONUS_ENERGIA = -100;

	/** Constante VAL_INT. */
	private static final int VAL_INT = 3;

	/** Constante VAL_DOUBLE. */
	private static final double VAL_DOUBLE = 0.49;

	/**
	 * Test habilidad 3.
	 */
	@Test
	public void testHabilidad3() {
		Personaje p1 = new Humano("Ben Affleck", new Hechicero(), 2);
		Personaje p2 = new Humano("Batman", new Asesino(), 2);
		p1.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		p2.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		p1.aumentarEnergia(BONUS_ENERGIA);
		Assert.assertFalse(p1.habilidadCasta3(p2));
	}

	/**
	 * Test habilidad 2.
	 */
	@Test
	public void testHabilidad2() {
		Personaje p1 = new Humano("Ben Affleck", new Hechicero(), 2);
		Personaje p2 = new Humano("Batman", new Asesino(), 2);
		p1.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		p2.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		p1.aumentarEnergia(BONUS_ENERGIA);
		Assert.assertFalse(p1.habilidadCasta2(p2));
	}

	/**
	 * Test habilidad 1.
	 */
	@Test
	public void testHabilidad1() {
		Personaje p1 = new Humano("Ben Affleck", new Hechicero(), 2);
		Personaje p2 = new Humano("Batman", new Asesino(), 2);
		p1.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		p2.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		p1.aumentarEnergia(BONUS_ENERGIA);
		Assert.assertFalse(p1.habilidadCasta1(p2));
	}

	/**
	 * Test instance of horrible 1.
	 */
	@Test
	public void testInstanceOfHorrible1() {
		Personaje p1 = new Humano("Ben Affleck", new Hechicero(), 2);
		p1.aumentarInteligencia(BONUS_INTELIG);
		p1.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		NonPlayableCharacter npc = new NonPlayableCharacter(
				"Pepe", 1, 1);
		npc.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));

		Assert.assertFalse(p1.habilidadCasta1(npc));
	}

	/**
	 * Test instance of horrible 2.
	 */
	@Test
	public void testInstanceOfHorrible2() {
		Personaje p1 = new Humano("Ben Affleck", new Hechicero(), 2);
		NonPlayableCharacter npc = new NonPlayableCharacter(
				"Pepe", 1, 1);
		p1.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		npc.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		Assert.assertFalse(p1.habilidadCasta2(npc));
	}

	/**
	 * Test instance of horrible 3.
	 */
	@Test
	public void testInstanceOfHorrible3() {
		Personaje p1 = new Humano("Ben Affleck", new Hechicero(), 2);
		NonPlayableCharacter npc = new NonPlayableCharacter(
				"Pepe", 1, 1);
		p1.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		npc.setRandom(new MyRandomStub(VAL_DOUBLE, VAL_INT));
		Assert.assertFalse(p1.habilidadCasta3(npc));
	}

}
