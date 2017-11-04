package dominio;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;

import javax.imageio.ImageIO;

/**
 * Clase que representa los Items que posee el personaje.
 */

public class Item implements Serializable {

	/** id del item. */
	private final int idItem;

	/** foto del item. */
	private final String foto;

	/**  nombre del item. */
	private final String nombre;

	/**  ubicacion del item. */
	private final int wearLocation;

	/** bonus salud que obtiene el personaje por poseer el item. */
	private final int bonusSalud;

	/**  bonus energia que obtiene el personaje por poseer el item. */
	private final int bonusEnergia;

	/**  bonus fuerza que obtiene el personaje por poseer el item.. */
	private final int bonusFuerza;

	/**  bonus destreza que obtiene el personaje por poseer el item.. */
	private final int bonusDestreza;

	/**  bonus inteligencia que obtiene el personaje por poseer el item.. */
	private final int bonusInteligencia;

	/**  foto equipado . */
	private final String fotoEquipado;
	/**
	 * Constructor del Item.
	 * @param idItemParam Entero que representa el id del item.
	 * @param nombreParam String que representa el nombre del item.
	 * @param wearLocationParam Entero que representa donde se usa el item.
	 * @param bonusSaludParam Entero que representa
	 *  el bonus de salud del item.
	 * @param bonusEnergiaParam Entero que representa
	 *  el bonus de energia del item.
	 * @param bonusFuerzaParam Entero que representa
	 *  el bonus de fuerza del item.
	 * @param bonusDestrezaParam Entero que representa
	 *  el bonus de destreza del item.
	 * @param bonusInteligenciaParam Entero que representa
	 *  el bonus de inteligencia del item.
	 * @param fotoParam String que representa el path de la foto del item.
	 * @param fotoEquipadoParam String que representa la foto
	 *  cuando el item está equipado.
	 * @throws IOException Cuando no se encuentra la foto del item.
	 */
	public Item(final int idItemParam, final String nombreParam,
			final int wearLocationParam,
			final int bonusSaludParam, final int bonusEnergiaParam,
			final int bonusFuerzaParam,
			final int bonusDestrezaParam,
			final int bonusInteligenciaParam,
			final String fotoParam,
			final String fotoEquipadoParam) throws IOException {
		this.foto = fotoParam;
		this.idItem = idItemParam;
		this.nombre = nombreParam;
		this.wearLocation = wearLocationParam;
		this.bonusSalud = bonusSaludParam;
		this.bonusEnergia = bonusEnergiaParam;
		this.bonusFuerza = bonusFuerzaParam;
		this.bonusDestreza = bonusDestrezaParam;
		this.bonusInteligencia = bonusInteligenciaParam;
		this.fotoEquipado = fotoEquipadoParam;
	}

	/**
	 * Método que retorna la foto del item.
	 * @return retorna la foto del item.
	 * @throws IOException Cuando no se encuentra la foto del item.
	 */
	public BufferedImage getFoto() throws IOException {
		return ImageIO.read(new File("recursos//" + foto));
	}
	/**
	 * Método que retorna el nombre del item.
	 * @return Retorna el nombre del item.
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Método que retorna el bonus de salud del item.
	 * @return Retorna bonus de salud.
	 */
	public int getBonusSalud() {
		return bonusSalud;
	}
	/**
	 * Método que retorna el bonus de energia del item.
	 * @return Retorna bonus de energia.
	 */
	public int getBonusEnergia() {
		return bonusEnergia;
	}
	/**
	 * Método que retorna el bonus de fuerza del item.
	 * @return Retorna bonus de fuerza.
	 */
	public int getBonusFuerza() {
		return bonusFuerza;
	}
	/**
	 * Método que retorna el bonus de destreza del item.
	 * @return Retorna bonus de destreza.
	 */
	public int getBonusDestreza() {
		return bonusDestreza;
	}
	/**
	 * Método que retorna el bonus de inteligencia del item.
	 * @return Retorna bonus de inteligencia.
	 */
	public int getBonusInteligencia() {
		return bonusInteligencia;
	}
	/**
	 * Método que retorna el id del item.
	 * @return Retorna el id del item.
	 */
	public int getIdItem() {
		return idItem;
	}

}
