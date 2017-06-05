package dominio;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;

import javax.imageio.ImageIO;

public class Item implements Serializable{
	private final int idItem;
	private final String foto;
	private final String nombre;
	private final int wearLocation;
	private final int bonusSalud;
	private final int bonusEnergia;
	private final int bonusFuerza;
	private final int bonusDestreza;
	private final int bonusInteligencia;
	private final String fotoEquipado;
	public Item(int idItem, String nombre, int wearLocation, int bonusSalud, int bonusEnergia, int bonusAtaque, int bonusDefensa, int bonusMagia, String foto, String fotoEquipado) throws IOException {
		this.foto = foto;
		this.idItem = idItem;
		this.nombre = nombre;
		this.wearLocation = wearLocation;
		this.bonusSalud = bonusSalud;
		this.bonusEnergia = bonusEnergia;
		this.bonusFuerza = bonusAtaque;
		this.bonusDestreza = bonusDefensa;
		this.bonusInteligencia = bonusMagia;
		this.fotoEquipado = fotoEquipado;
	}

	public BufferedImage getFoto() throws IOException {
		// TODO Auto-generated method stub
		return ImageIO.read(new File("recursos//"+foto));
	}

	public String getNombre() {
		return nombre;
	}

	public int getBonusSalud() {
		return bonusSalud;
	}

	public int getBonusEnergia() {
		return bonusEnergia;
	}

	public int getBonusFuerza() {
		return bonusFuerza;
	}

	public int getBonusDestreza() {
		return bonusDestreza;
	}

	public int getBonusInteligencia() {
		return bonusInteligencia;
	}

	public int getIdItem() {
		return idItem;
	}
	


	
	
	
}