package dominio;

/**
 * La clase Enemigo se utiliza para
 *  crear los enemigos (NPC's), con
 *  los cuales un Personaje podrá
 *  pelear contra ellos y ganar experiencia
 *  si gana la batalla.
 */
public class Enemigo extends MadreDeTodo implements Peleable {

	/**  Constante EXPERIENCIA_OTORGADA. */
	private static final int EXPERIENCIA_OTORGADA = 40;

	/**  Constante DEFENSA_ENEMIGO. */
	private static final int DEFENSA_ENEMIGO = 0;

	/**
	 * Rango en el cual el enemigo me va a atacar.
	 */
	public static final int RANGO = 70;

	/**
	 * Salud tope del enemigo.
	 */
	private int saludTope = 60;
	/**
	 * Salud actual del enemigo.
	 */
	private int salud;

	/**
	 * Constructor de Enemigo.
	 *
	 * @param fuerza fuerza del enemigo
	 * @param nivel nivel del enemigo
	 * @param nombre nombre del enemigo
	 * @param saludParam salud del enemigo
	 */
	public Enemigo(final String nombre, final int fuerza, final int nivel, final int saludParam) {
		super(fuerza, DEFENSA_ENEMIGO, nivel, nombre);
		this.salud = saludParam;
	}

	/**
	 * Método implementado en la interfaz
	 * Peleable Se le resta la salud al
	 * enemigo tomando en cuenta el daño
	 * recibido menos la defensa del enemigo.
	 */
	@Override
	public int serAtacado(int daño) {
		daño -= this.getDefensa();
		if (daño > 0) {
			if (salud <= daño) {
				daño = salud;
				salud = 0;
			} else {
				salud -= daño;
			}
			return daño;
		}
		return 0;
	}

	/**
	 * Método implementado en la interfaz Peleable.
	 *
	 * @return retorna la salud actual del enemigo
	 */

	@Override
	public int getSalud() {
		return salud;
	}

	/**
	 * Retorna siempre valor entero 0 porque el Enemigo no tiene magia.
	 */
	@Override
	public int getMagia() {
		return 0;
	}

	/**
	 * Metodo sin implementar
	 */
	// @Override
	// public void despuesDeTurno() { }

	/**
	 * Método implementado en la interfaz Peleable Verifica que el personaje
	 * este vivo y si lo esta lo ataca.
	 */
	@Override
	public int atacar(final Peleable personaje) {

		if (((personaje instanceof Personaje)) &&  ((Personaje) personaje).isModoDios()) {
			return 0;
		}
		if (!personaje.estaVivo()) {
			return 0;
		}
		return personaje.serAtacado(this.getFuerza());

	}

	/**
	 * Método implementado en la interfaz Peleable.
	 *
	 * @return booleano si esta vivo el enemigo o no
	 */
	@Override
	public boolean estaVivo() {
		return salud > 0;
	}

	/**
	 * Método implementado en la interfaz Peleable.
	 *
	 * @return la experiencia que otorga el enemigo.
	 */
	@Override
	public int otorgarExp() {
		return EXPERIENCIA_OTORGADA;
	}

	/**
	 * Método implementado en la interfaz Peleable.
	 *
	 * @return la fuerza del enemigo. Fuerza y ataque poseen el mismo valor
	 */
	@Override
	public int getAtaque() {
		return this.getFuerza();
	}

	/**
	 * Método que aumenta la fuerza del enemigo.
	 */
	@Override
	public void setAtaque(final int ataque) {
		this.aumentarFuerza(ataque);
	}

	/**
	 * Método que retorna la saludTope del Enemigo.
	 *
	 * @return saludTope
	 */
	public int getSaludTope() {
		return saludTope;
	}

	/**
	 * Sets the salud tope.
	 *
	 * @param saludTopeParam the new salud tope
	 */
	public void setSaludTope(final int saludTopeParam) {
		this.saludTope = saludTopeParam;
	}
}
