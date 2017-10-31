package tests.Dominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Asesino;
import dominio.Elfo;
import dominio.Hechicero;
import dominio.Humano;
import dominio.MyRandomStub;

public class TestHechicero {

	@Test
	public void testCurar() {
		Humano h = new Humano("Nico", 100, 100, 55, 20, 30, new Hechicero(0.2, 0.3, 1.5), 0, 1, 1);
		Elfo e = new Elfo("Nico", 100, 100, 25, 20, 30, new Asesino(0.2, 0.3, 1.5), 0, 3, 1);
		h.setRandom(new MyRandomStub(0.49, 3));
		e.setRandom(new MyRandomStub(0.49, 3));
		Assert.assertEquals(100, e.getSalud());
		e.reducirSalud(35);
		Assert.assertEquals(65, e.getSalud());
		h.habilidadCasta2(e);
		Assert.assertTrue(e.getSalud() > 65);
	}

	@Test
	public void testBolaDeFuego() {
		Humano h = new Humano("Nico", 100, 100, 55, 20, 30, new Hechicero(0.2, 0.3, 1.5), 0, 1, 1);
		Elfo e = new Elfo("Nico", 100, 100, 25, 20, 30, new Asesino(0.2, 0.3, 1.5), 0, 3, 1);
		h.setRandom(new MyRandomStub(0.49, 3));
		e.setRandom(new MyRandomStub(0.49, 3));
		Assert.assertEquals(100, e.getSalud());
		if (h.habilidadCasta1(e)) {
			Assert.assertEquals(true, e.getSalud() < 100);
		} else {
			Assert.assertEquals(true, e.getSalud() == 100);
		}
	}

	@Test
	public void testRobarEnergia_y_Salud() {
		Humano h = new Humano("Nico", 100, 100, 55, 20, 50, new Hechicero(0.2, 0.3, 1.5), 0, 1, 1);
		Elfo e = new Elfo("Nico", 100, 100, 25, 20, 30, new Asesino(0.2, 0.3, 1.5), 0, 3, 1);
		h.setRandom(new MyRandomStub(0.49, 3));
		e.setRandom(new MyRandomStub(0.49, 3));
		Assert.assertEquals(100, e.getSalud());
		h.reducirSalud(50);
		h.aumentarEnergia(-55);
		if (h.habilidadCasta3(e)) {
			Assert.assertEquals(true, e.getSalud() < 100);
			Assert.assertEquals(true, h.getEnergia() > 50);
			Assert.assertEquals(true, h.getSalud() > 50);
		} else {
			Assert.assertEquals(50, h.getSalud());
			Assert.assertEquals(true, h.getEnergia() < 50);
			Assert.assertEquals(100, e.getSalud());
		}
	}
}
