package tests.Dominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Alianza;

/**
 * Clase TestAlianzaNuevo se utiliza para testear las alianzas.
 */
public class TestAlianzaNuevo {

	/**
	 * Test getNombre se usa para testear obtener nombre de la alianza.
	 */
	@Test
	public void testGetNombre() {
		Alianza ali = new Alianza("Los Isotopos");
		Assert.assertEquals("Los Isotopos", ali.obtenerNombre());
	}

}
