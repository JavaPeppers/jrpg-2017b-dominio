package dominio;

public class Enemigo extends MadreDeTodo implements Peleable {
	/**
	 * Rango en el cual el enemigo me va a atacar
	 */
	public static final int RANGO = 70;
	
	/**
	 * Salud tope del enemigo
	 */
	private static final int saludTope = 60;
	/**
	 * Salud actual del enemigo
	 */
	private int salud;
	
	/**
	 * Constructor de Enemigo
	 * @param fuerza
	 * @param defensa
	 * @param nombre
	 * @param salud
	 */
	public Enemigo(String nombre) {
		super(25, 0, 1, nombre);
		this.salud = saludTope;	
	}

	/**
	 * Método implementado en la interfaz Peleable
	 * Se le resta la salud al enemigo tomando
	 * en cuenta el daño recibido menos la defensa del enemigo
	 */
	@Override
	public int serAtacado(int daño) {
		daño-=this.getDefensa();
		if (daño > 0) {
			if (salud <= daño) {
				daño = salud;
				salud = 0;
			} else {
				salud -= daño;
			}
		}
		return 0;
	}
	
	/**
	 * Método implementado en la interfaz Peleable
	 * @return retorna la salud actual del enemigo
	 */

	@Override
	public int getSalud() {
		return salud;
	}
	

	/**
	 * Retorna siempre valor entero 0 
	 * porque el Enemigo no tiene magia 
	 */
	@Override
	public int getMagia() {
		return 0;
	}
	
	/**
	 * Metodo sin implementar
	 */
//	@Override
//	public void despuesDeTurno() {	}

	/**
	 * Método implementado en la interfaz Peleable
	 * Verifica que el personaje este vivo y si lo esta lo ataca.
	 */
	@Override
	public int atacar(final Peleable personaje) {
		
		if(!personaje.estaVivo())
			return 0;
		return personaje.serAtacado(this.getFuerza());
			
	}
	
	/**
	 * Método implementado en la interfaz Peleable
	 * @return booleano si esta vivo el enemigo o no
	 */
	@Override
	public boolean estaVivo() {
		return salud > 0;
	}

	/**
	 * Método implementado en la interfaz Peleable
	 * @return la experiencia que otorga el enemigo.
	 */
	@Override
	public int otorgarExp() { 
		return 40;
	}

	/**Método implementado en la interfaz Peleable
	 * @return la fuerza del enemigo. Fuerza y ataque poseen el mismo valor
	 */
	@Override
	public int getAtaque() {
		return this.getFuerza();
	}

	/**
	 * Método que aumenta la fuerza del enemigo
	 */
	@Override
	public void setAtaque(int ataque) {
		this.aumentarFuerza(ataque);
	}

	/**
	 * Método que retorna la saludTope del Enemigo
	 * @return
	 */
	public int getSaludTope() {
		return saludTope;
	}
}
