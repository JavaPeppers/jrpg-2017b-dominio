package tests.Dominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Enemigo;


/**
 * The Class TestEnemigo.
 */
public class TestEnemigo {

	/** The Constant EXP. */
	private static final int EXP = 40;

	/** The Constant VALOR_ATAQUE. */
	private static final int VALOR_ATAQUE = 45;

	/** The Constant INCRE_ATAQUE. */
	private static final int INCRE_ATAQUE = 20;

	/** The Constant SALUD_TOPE. */
	private static final int SALUD_TOPE = 60;

	/** The Constant SALUD2. */
	private static final int SALUD2 = 35;

	/** The Constant FUERZA. */
	private static final int FUERZA = 25;

	/** The Constant SALUD. */
	private static final int SALUD = 60;

	/**
	 * Crear enemigo.
	 */
	@Test
	public void crearEnemigo() {
		Enemigo e = new Enemigo("Enemigo");
		Assert.assertEquals(SALUD, e.getSalud());
		Assert.assertEquals(FUERZA, e.getFuerza());
		Assert.assertEquals(0, e.getDefensa());
		Assert.assertEquals(0, e.getMagia());
		Assert.assertEquals(1, e.getNivel());
	}

	/**
	 * Test atacar enemigo.
	 */
	@Test
	public void testAtacarEnemigo() {
		Enemigo e = new Enemigo("Enemigo");
		Enemigo e1 = new Enemigo("Enemigo2");
		e.atacar(e1);
		Assert.assertEquals(SALUD2, e1.getSalud());
	}

	/**
	 * Test matar enemigo.
	 */
	@Test
	public void testMatarEnemigo() {
		Enemigo e = new Enemigo("Enemigo");
		Enemigo e1 = new Enemigo("Enemigo2");
		e.atacar(e1);
		e.atacar(e1);
		e.atacar(e1);
		Assert.assertEquals(0, e1.getSalud());
	}

	/**
	 * Test salud tope.
	 */
	@Test
	public void testSaludTope() {
		Enemigo e = new Enemigo("Enemigo");
		Assert.assertEquals(SALUD_TOPE, e.getSaludTope());
	}

	/**
	 * Test set ataque.
	 */
	@Test
	public void testSetAtaque() {
		Enemigo e = new Enemigo("Enemigo");
		e.setAtaque(INCRE_ATAQUE);
		Assert.assertEquals(VALOR_ATAQUE, e.getAtaque());
	}

	/**
	 * Test enemigo muerto no ataca.
	 */
	@Test
	public void testEnemigoMuertoNoAtaca() {
		Enemigo e = new Enemigo("Enemigo");
		Enemigo e1 = new Enemigo("Enemigo");
		e.atacar(e1);
		e.atacar(e1);
		e.atacar(e1);
		Assert.assertEquals(0, e1.getSalud());
		Assert.assertEquals(0, e.atacar(e1));
	}

	/**
	 * Test otorgar experiencia.
	 */
	@Test
	public void testOtorgarExperiencia() {
		Enemigo e = new Enemigo("Enemigo");
		Assert.assertEquals(EXP, e.otorgarExp());
	}
}
