package tests.Dominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Asesino;
import dominio.Elfo;
import dominio.Guerrero;
import dominio.Hechicero;
import dominio.Humano;
import dominio.Orco;
import dominio.Personaje;


/**
 * Clase para Testear Refactorar Atributos.
 */
public class TestRefactoreoAtributos {

	/** Constante TOPE2_ELFO. */
	private static final int TOPE2_ELFO = 110;

	/** Constante TOPE1_ELFO. */
	private static final int TOPE1_ELFO = 100;

	/** Constante TOPE2_ORCO. */
	private static final int TOPE2_ORCO = 100;

	/** Constante TOPE1_ORCO. */
	private static final int TOPE1_ORCO = 110;

	/** Constante TOPE_HUMANO. */
	private static final int TOPE_HUMANO = 105;

	/** Constante INTELIG_HECHICERO. */
	private static final int INTELIG_HECHICERO = 15;

	/** Constante FUERZA_GUERRERO. */
	private static final int FUERZA_GUERRERO = 15;

	/** Constante DEST_ASESINO. */
	private static final int DEST_ASESINO = 15;

	/**
	 * Test destreza asesino.
	 */
	@Test
	public void testDestrezaAsesino() {
		Personaje p = new Humano("Ben Affleck", new Asesino(), 1);
		Assert.assertEquals(DEST_ASESINO, p.getDestreza());
	}

	/**
	 * Test fuerza guerrero.
	 */
	@Test
	public void testFuerzaGuerrero() {
		Personaje p = new Humano("Ben Affleck", new Guerrero(), 1);
		Assert.assertEquals(FUERZA_GUERRERO, p.getFuerza());
	}

	/**
	 * Test inteligencia hechicero.
	 */
	@Test
	public void testInteligenciaHechicero() {
		Personaje p = new Humano("Ben Affleck", new Hechicero(), 1);
		Assert.assertEquals(INTELIG_HECHICERO, p.getInteligencia());
	}

	/**
	 * Test full humano.
	 */
	@Test
	public void testFullHumano() {
		Personaje p = new Humano("Ben Affleck", new Asesino(), 1);
		Personaje p1 = new Humano("Ben Affleck", new Hechicero(), 1);
		Personaje p2 = new Humano("Ben Affleck", new Guerrero(), 1);
		// Testeo que sin importar la casta,
		//sigue teniendo la misma energia y
		// salud porque eso depende de la Raza
		Assert.assertEquals(TOPE_HUMANO, p.getSaludTope());
		Assert.assertEquals(TOPE_HUMANO, p.getEnergiaTope());
		Assert.assertEquals(TOPE_HUMANO, p1.getSaludTope());
		Assert.assertEquals(TOPE_HUMANO, p1.getEnergiaTope());
		String[] hCastaA = {"Golpe Critico", "Aumentar Evasion",
				"Robar" };
		String[] hCastaH = {"Bola de Fuego", "Curar Aliado",
				"Robar Energia y Salud" };
		String[] hCastaG = {"Ataque Doble", "Aumentar Defensa",
				"Ignorar Defensa" };
		String[] hRaza = {"Incentivar", "Golpe Fatal" };
		Assert.assertArrayEquals(hCastaA, p.getHabilidadesCasta());
		Assert.assertArrayEquals(hCastaH, p1.getHabilidadesCasta());
		Assert.assertArrayEquals(hCastaG, p2.getHabilidadesCasta());
		Assert.assertArrayEquals(hRaza, p.getHabilidadesRaza());

	}

	/**
	 * Test full orco.
	 */
	@Test
	public void testFullOrco() {
		Personaje p = new Orco("Ben Affleck", new Asesino(), 1);
		Personaje p1 = new Orco("Ben Affleck", new Hechicero(), 1);
		Personaje p2 = new Orco("Ben Affleck", new Guerrero(), 1);
		// Testeo que sin importar la casta,
		//sigue teniendo la misma energia y
		// salud porque eso depende de la Raza
		Assert.assertEquals(TOPE1_ORCO, p.getSaludTope());
		Assert.assertEquals(TOPE2_ORCO, p.getEnergiaTope());
		Assert.assertEquals(TOPE1_ORCO, p1.getSaludTope());
		Assert.assertEquals(TOPE2_ORCO, p1.getEnergiaTope());
		String[] hCastaA = {"Golpe Critico", "Aumentar Evasion",
				"Robar" };
		String[] hCastaH = {"Bola de Fuego", "Curar Aliado",
				"Robar Energia y Salud" };
		String[] hCastaG = {"Ataque Doble", "Aumentar Defensa",
				"Ignorar Defensa" };
		String[] hRaza = {"Golpe Defensa", "Mordisco de Vida" };
		Assert.assertArrayEquals(hCastaA, p.getHabilidadesCasta());
		Assert.assertArrayEquals(hCastaH, p1.getHabilidadesCasta());
		Assert.assertArrayEquals(hCastaG, p2.getHabilidadesCasta());
		Assert.assertArrayEquals(hRaza, p.getHabilidadesRaza());
	}

	/**
	 * Test full elfo.
	 */
	@Test
	public void testFullElfo() {
		Personaje p = new Elfo("Ben Affleck", new Asesino(), 1);
		Personaje p1 = new Elfo("Ben Affleck", new Hechicero(), 1);
		Personaje p2 = new Elfo("Ben Affleck", new Guerrero(), 1);
		// Testeo que sin importar la casta,
		//sigue teniendo la misma energia y
		// salud porque eso depende de la Raza
		Assert.assertEquals(TOPE1_ELFO, p.getSaludTope());
		Assert.assertEquals(TOPE2_ELFO, p.getEnergiaTope());
		Assert.assertEquals(TOPE1_ELFO, p1.getSaludTope());
		Assert.assertEquals(TOPE2_ELFO, p1.getEnergiaTope());
		String[] hCastaA = {"Golpe Critico", "Aumentar Evasion",
				"Robar" };
		String[] hCastaH = {"Bola de Fuego", "Curar Aliado",
				"Robar Energia y Salud" };
		String[] hCastaG = {"Ataque Doble", "Aumentar Defensa",
				"Ignorar Defensa" };
		String[] hRaza = {"Golpe Level", "Ataque Bosque" };
		Assert.assertArrayEquals(hCastaA, p.getHabilidadesCasta());
		Assert.assertArrayEquals(hCastaH, p1.getHabilidadesCasta());
		Assert.assertArrayEquals(hCastaG, p2.getHabilidadesCasta());
		Assert.assertArrayEquals(hRaza, p.getHabilidadesRaza());
	}
}
