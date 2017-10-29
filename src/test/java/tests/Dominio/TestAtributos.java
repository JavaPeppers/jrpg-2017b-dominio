package tests.Dominio;

import org.junit.Test;

import dominio.*;
import org.junit.Assert;

public class TestAtributos {

	@Test
	public void testIncrementarFuerza() {
		Humano h = new Humano("Nicolas", new Guerrero(), 1);
		
		Assert.assertEquals(15,h.getFuerza());
		h.AsignarPuntosSkills(10, 0, 0);
		Assert.assertEquals(25,h.getFuerza());
	}

	@Test
	public void testIncrementarDestreza() {
		Humano h = new Humano("Nicolas", new Guerrero(), 1);

		Assert.assertEquals(10,h.getDestreza());
		h.AsignarPuntosSkills(0, 10, 0);
		Assert.assertEquals(20,h.getDestreza());
	}

	@Test
	public void testIncrementarInteligencia() {
		Humano h = new Humano("Nicolas", new Guerrero(), 1);
		Assert.assertEquals(10,h.getInteligencia());
		h.AsignarPuntosSkills(0, 0, 10);
		Assert.assertEquals(20, h.getInteligencia());
	}
}
