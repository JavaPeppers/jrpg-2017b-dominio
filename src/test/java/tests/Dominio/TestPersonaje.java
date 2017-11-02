package tests.Dominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Asesino;
import dominio.Elfo;
import dominio.Guerrero;
import dominio.Hechicero;
import dominio.Humano;
import dominio.Orco;


/**
 * La clase TestPersonaje se usa para testear a cada personaje.
 */
public class TestPersonaje {

	/** Constante ID_HUMANO. */
	private static final int ID_HUMANO = 3;

	/** Constante ID_ORCO. */
	private static final int ID_ORCO = 3;

	/** Constante ID_ELFO. */
	private static final int ID_ELFO = 3;

	/** Constante ENERGIA_ORCO. */
	private static final int ENERGIA_ORCO = 100;

	/** Constante SALUD_ORCO. */
	private static final int SALUD_ORCO = 110;

	/** Constante ENERGIA_ELFO. */
	private static final int ENERGIA_ELFO = 110;

	/** Constante SALUD_ELFO. */
	private static final int SALUD_ELFO = 100;

	/** Constante INTELIG_ASESINO. */
	private static final int INTELIG_ASESINO = 10;

	/** Constante DESTREZA_ASESINO. */
	private static final int DESTREZA_ASESINO = 15;

	/** Constante FUERZA_ASESINO. */
	private static final int FUERZA_ASESINO = 10;

	/** Constante INTELIG_HECHICERO. */
	private static final int INTELIG_HECHICERO = 15;

	/** Constante DESTREZA_HECHICERO. */
	private static final int DESTREZA_HECHICERO = 10;

	/** Constante FUERZA_HECHICERO. */
	private static final int FUERZA_HECHICERO = 10;

	/** Constante INTELIGENCIA_GUERRERO. */
	private static final int INTELIGENCIA_GUERRERO = 10;

	/** Constante DESTREZA_GUERRERO. */
	private static final int DESTREZA_GUERRERO = 10;

	/** Constante FUERZA_GUERRERO. */
	private static final int FUERZA_GUERRERO = 15;

	/** Constante ENERGIA_HUMANO. */
	private static final int ENERGIA_HUMANO = 105;

	/** Constante SALUD_HUMANO. */
	private static final int SALUD_HUMANO = 105;

	/**
	 * Test humano.
	 */
	@Test
	public void testHumano() {
		Humano h = new Humano("Nicolas", new Guerrero(), 1);
		Assert.assertEquals(SALUD_HUMANO, h.getSalud());
		Assert.assertEquals(ENERGIA_HUMANO, h.getEnergia());
		Assert.assertEquals(FUERZA_GUERRERO, h.getFuerza());
		Assert.assertEquals(DESTREZA_GUERRERO, h.getDestreza());
		Assert.assertEquals(INTELIGENCIA_GUERRERO, h.getInteligencia());

		Humano h2 = new Humano("Lautaro", new Hechicero(), 2);
		Assert.assertEquals(SALUD_HUMANO, h2.getSalud());
		Assert.assertEquals(ENERGIA_HUMANO, h2.getEnergia());
		Assert.assertEquals(FUERZA_HECHICERO, h2.getFuerza());
		Assert.assertEquals(DESTREZA_HECHICERO, h2.getDestreza());
		Assert.assertEquals(INTELIG_HECHICERO, h2.getInteligencia());

		Humano h3 = new Humano("Hernan", new Asesino(), ID_HUMANO);
		Assert.assertEquals(SALUD_HUMANO, h3.getSalud());
		Assert.assertEquals(ENERGIA_HUMANO, h3.getEnergia());
		Assert.assertEquals(FUERZA_ASESINO, h3.getFuerza());
		Assert.assertEquals(DESTREZA_ASESINO, h3.getDestreza());
		Assert.assertEquals(INTELIG_ASESINO, h3.getInteligencia());
	}

	/**
	 * Test elfo.
	 */
	@Test
	public void testElfo() {
		Elfo e = new Elfo("Nicolas", new Guerrero(), 1);
		Assert.assertEquals(SALUD_ELFO, e.getSalud());
		Assert.assertEquals(ENERGIA_ELFO, e.getEnergia());
		Assert.assertEquals(FUERZA_GUERRERO, e.getFuerza());
		Assert.assertEquals(DESTREZA_GUERRERO, e.getDestreza());
		Assert.assertEquals(INTELIGENCIA_GUERRERO, e.getInteligencia());

		Elfo e2 = new Elfo("Lautaro", new Hechicero(), 2);
		Assert.assertEquals(SALUD_ELFO, e2.getSalud());
		Assert.assertEquals(ENERGIA_ELFO, e2.getEnergia());
		Assert.assertEquals(FUERZA_HECHICERO, e2.getFuerza());
		Assert.assertEquals(DESTREZA_HECHICERO, e2.getDestreza());
		Assert.assertEquals(INTELIG_HECHICERO, e2.getInteligencia());

		Elfo e3 = new Elfo("Hernan", new Asesino(), ID_ELFO);
		Assert.assertEquals(SALUD_ELFO, e3.getSalud());
		Assert.assertEquals(ENERGIA_ELFO, e3.getEnergia());
		Assert.assertEquals(FUERZA_ASESINO, e3.getFuerza());
		Assert.assertEquals(DESTREZA_ASESINO, e3.getDestreza());
		Assert.assertEquals(INTELIG_ASESINO, e3.getInteligencia());
	}

	/**
	 * Test orco.
	 */
	@Test
	public void testOrco() {
		Orco o = new Orco("Nicolas", new Guerrero(), 1);
		Assert.assertEquals(SALUD_ORCO, o.getSalud());
		Assert.assertEquals(ENERGIA_ORCO, o.getEnergia());
		Assert.assertEquals(FUERZA_GUERRERO, o.getFuerza());
		Assert.assertEquals(DESTREZA_GUERRERO, o.getDestreza());
		Assert.assertEquals(INTELIGENCIA_GUERRERO, o.getInteligencia());

		Orco o2 = new Orco("Lautaro", new Hechicero(), 2);
		Assert.assertEquals(SALUD_ORCO, o2.getSalud());
		Assert.assertEquals(ENERGIA_ORCO, o2.getEnergia());
		Assert.assertEquals(FUERZA_HECHICERO, o2.getFuerza());
		Assert.assertEquals(DESTREZA_HECHICERO, o2.getDestreza());
		Assert.assertEquals(INTELIG_HECHICERO, o2.getInteligencia());

		Orco o3 = new Orco("Hernan", new Asesino(), ID_ORCO);
		Assert.assertEquals(SALUD_ORCO, o3.getSalud());
		Assert.assertEquals(ENERGIA_ORCO, o3.getEnergia());
		Assert.assertEquals(FUERZA_ASESINO, o3.getFuerza());
		Assert.assertEquals(DESTREZA_ASESINO, o3.getDestreza());
		Assert.assertEquals(INTELIG_ASESINO, o3.getInteligencia());
	}

}
