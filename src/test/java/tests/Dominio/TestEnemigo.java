package tests.Dominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.*;

public class TestEnemigo {
	
	@Test
	public void crearEnemigo() {
		Enemigo e = new Enemigo("Enemigo");
		Assert.assertEquals(60,e.getSalud());
		Assert.assertEquals(25,e.getFuerza());
		Assert.assertEquals(0,e.getDefensa());
		Assert.assertEquals(0,e.getMagia());
		Assert.assertEquals(1,e.getNivel());
	}
	
	@Test
	public void testAtacarEnemigo() {
		Enemigo e = new Enemigo("Enemigo");
		Enemigo e1 = new Enemigo("Enemigo2");
		e.atacar(e1);
		Assert.assertEquals(35,e1.getSalud());
	}
	
	@Test
	public void testMatarEnemigo() {
		Enemigo e = new Enemigo("Enemigo");
		Enemigo e1 = new Enemigo("Enemigo2");
		e.atacar(e1);
		e.atacar(e1);
		e.atacar(e1);
		Assert.assertEquals(0,e1.getSalud());
	}
	
	@Test
	public void testSaludTope() {
		Enemigo e = new Enemigo("Enemigo");
		Assert.assertEquals(60,e.getSaludTope());
	}
	
	@Test
	public void testSetAtaque() {
		Enemigo e = new Enemigo("Enemigo");
		e.setAtaque(20);
		Assert.assertEquals(45,e.getAtaque());
	}
	
	@Test
	public void testEnemigoMuertoNoAtaca() {
		Enemigo e = new Enemigo("Enemigo");
		Enemigo e1 = new Enemigo("Enemigo");
		e.atacar(e1);
		e.atacar(e1);
		e.atacar(e1);
		Assert.assertEquals(0,e1.getSalud());
		Assert.assertEquals(0,e.atacar(e1));		
	}
	
	@Test
	public void testOtorgarExperiencia() {
		Enemigo e = new Enemigo("Enemigo");
		Assert.assertEquals(40, e.otorgarExp());
	}
}
