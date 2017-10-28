package tests.Dominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.*;

public class TestEnemigo {
	
	@Test
	public void crearEnemigo() {
		Enemigo e = new Enemigo("Enemigo");
		Assert.assertTrue(e.getSalud() == 60);
		Assert.assertTrue(e.getFuerza() == 25);
		Assert.assertTrue(e.getDefensa() == 0);
		Assert.assertTrue(e.getMagia() == 0);
		Assert.assertTrue(e.getNivel() == 1);
	}
	
	@Test
	public void testAtacarEnemigo() {
		Enemigo e = new Enemigo("Enemigo");
		Enemigo e1 = new Enemigo("Enemigo2");
		e.atacar(e1);
		Assert.assertTrue(e1.getSalud() == 35);
	}
	
	@Test
	public void testMatarEnemigo() {
		Enemigo e = new Enemigo("Enemigo");
		Enemigo e1 = new Enemigo("Enemigo2");
		e.atacar(e1);
		e.atacar(e1);
		e.atacar(e1);
		Assert.assertTrue(e1.getSalud() == 0);
	}
	
	@Test
	public void testSaludTope() {
		Enemigo e = new Enemigo("Enemigo");
		Assert.assertTrue(e.getSaludTope() == 60);
	}
	
	@Test
	public void testSetAtaque() {
		Enemigo e = new Enemigo("Enemigo");
		e.setAtaque(20);
		Assert.assertTrue(e.getAtaque() == 45);
	}
	
	@Test
	public void testEnemigoYaMuerto() {
		Enemigo e = new Enemigo("Enemigo");
		Enemigo e1 = new Enemigo("Enemigo");
		e.atacar(e1);
		e.atacar(e1);
		e.atacar(e1);
		Assert.assertTrue(e1.getSalud() == 0);
		Assert.assertTrue(e.atacar(e1) == 0);		
	}
	
	@Test
	public void testOtorgarExperiencia() {
		Enemigo e = new Enemigo("Enemigo");
		Assert.assertTrue(e.otorgarExp() == 40);
	}
}
