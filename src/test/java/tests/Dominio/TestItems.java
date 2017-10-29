package tests.Dominio;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.junit.Assert;
import org.junit.Test;

import dominio.Item;

public class TestItems {
	
	@Test
	public void testCrearItem() {
		try {
			Item i = new Item(1, "Cuchillo", 1, 0, 1, 1, 1, 1, "TunicaRoja.png", "TunicaRoja.png");
			Assert.assertEquals(1,i.getIdItem());
			Assert.assertEquals("Cuchillo",i.getNombre());
			Assert.assertEquals(0,i.getBonusSalud());
			Assert.assertEquals(1,i.getBonusEnergia());
			Assert.assertEquals(1,i.getBonusFuerza());
			Assert.assertEquals(1,i.getBonusDestreza());
			Assert.assertEquals(1,i.getBonusInteligencia());
		} catch (IOException e) {
			System.out.println("No se encontraron las imagenes");
		}
		
	}

}