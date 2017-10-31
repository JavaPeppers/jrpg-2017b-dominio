
package dominio;

import java.util.ArrayList;

/** Clase abstracta.
 * Que tiene como funcion tener los atributos que
 * comparten las clases NPC y Personaje
 */
public abstract class MadreDeTodo {

	/**
	 * Fuerza que recibira el personaje o npc.
	 */
	private int fuerza;
	/**
	 * Defensa que recibira el personaje o npc.
	 */
	protected int defensa;
	/**
	 * Nivel que recibira el personaje o npc.
	 */
	private int nivel;
	/**
	 * Nombre que recibira el personaje o npc.
	 */
	private String nombre;
	/**
	 * Objeto para obtener valores aleatorios.
	 */
	private RandomGenerator random;

	/** Array list donde se almacenaran los items. */
	protected ArrayList<Item> items = new ArrayList<Item>();



	/** Clase abstracta.
	 * Que tiene como
	 * funcion tener los atributos que
	 * comparten las clases NPC y Personaje
	 * @param fuerzaParam valor otorgado por
	 * el constructor de NPC o Personaje.
	 * @param defensaParam valor otorgado por
	 * el constructor de NPC o Personaje.
	 * @param nivelParam valor otorgado por
	 * el constructor de NPC o Personaje.
	 * @param nombreParam valor otorgado por
	 * el constructor de NPC o Personaje.
	 */
	public MadreDeTodo(final int fuerzaParam, final int defensaParam,
			final int nivelParam, final String nombreParam) {
		this.fuerza = fuerzaParam;
		this.defensa = defensaParam;
		this.nivel = nivelParam;
		this.nombre = nombreParam;
		this.random = new MyRandom();
	}


	/** Método que devuelve la fuerza del personaje o NPC.
	 * @return fuerza del personaje o NPC.
	 */
	public final int getFuerza() {
		return fuerza;
	}

	/** Método que devuelve la defensa del personaje o NPC.
	 * @return defensa del personaje o NPC.
	 */
	public final int getDefensa() {
		return defensa;
	}

	/** Método que devuelve el nivel del personaje o NPC.
	 * @return nivel del personaje o NPC.
	 */
	public final int getNivel() {
		return nivel;
	}

	/** Método que devuelve el nombre del personaje o NPC.
	 * @return nombre del personaje o NPC.
	 */
	public final String getNombre() {
		return nombre;
	}
	/** Método void que sobreescribe el atributo nombre.
	 * Con el valor que se ingresa por parámetro.
	 * @param nombreParam valor a sobreescribir
	 */
	public final void setNombre(final String nombreParam) {
		this.nombre = nombreParam;
	}
	/** Método void que aumenta la fuerza del personaje o NPC.
	 * Con el valor que se ingresa por parámetro.
	 * @param aumento fuerza a aumentar.
	 */
	public final void aumentarFuerza(final int aumento) {
		fuerza += aumento;
	}
	/** Método void que aumenta el nivel del personaje o NPC.
	 */
	public final void aumentarNivel() {
		nivel++;
	}

	/**
	 * Getter del Randomizador.
	 * @return Retorna el randomizador.
	 */
	public final RandomGenerator getRandom() {
		return random;
	}

	/**
	 * Setter del Randomizador.
	 * @param randomParam Randomizador que reemplazará al actual.
	 */
	public final void setRandom(final RandomGenerator randomParam) {
		this.random = randomParam;
	}
	/**
	 * Aumenta la defensa del personaje / npc.
	 * @param bonus valor que se le agrega a la defensa.
	 */
	public final void aumentarDefensa(final int bonus) {
		defensa += bonus;
	}
	/**
	 * Reduce la defensa del personaje.
	 * @param reduc Valor que se reduce la defensa.
	 */
	public final void reducirDefensa(final int reduc) {
		defensa -= reduc;
	}
	/**
	 * Metodo para anadir items sin violar el encapsulamiento.
	 * @param i Item a agregar.
	 */
	public final void anadirItem(final Item i) {
		items.add(i);
	}
	/**
	 * Metodo para remover items sin violar el encapsulamiento.
	 * @param i Item a eliminar.
	 */
	public final void removerItem(final Item i) {
		items.remove(i);
	}
	/**
	 * Método para obtener la lista de items.
	 * @return Lista de items del personaje.
	 */
	public ArrayList<Item> getItems() {
		return items;
	}
}
