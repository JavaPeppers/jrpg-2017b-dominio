package dominio;

public class Enemigo extends MadreDeTodo implements Peleable {
	
	/**
	 * Numero que sirve de argumento para obtener la dificultad.
	 */
	private static final int ELEGIRDIF = 3;
	/**
	 * Salud del Enemigo.
	 */
	private int salud;
	/**
	 * Dificultad aleatoria Enemigo.
	 */
	private static final int DIFICULTADALEATORIA = -1;
	/**
	 * Multiplicador de experiencia otorgada por el Enemigo.
	 */
	private static final int MULTIPLICADOREXPEnemigo = 30;
	/**
	 * Multiplicador de fuerza para el golpe critico del Enemigo.
	 */
	private static final double MULTIPLICADORFUERZA = 1.5;
	/**
	 * Numero a superar para poder ser atacado.
	 */
	private static final double NUMEROPARASERATACADO = 0.15;
	/**
	 * Numero a superar para poder atacar.
	 */
	private static final double NUMEROPARAATACAR = 0.15;
	/**
	 * Numero por el cual se divide la defensa cuando el Enemigo es atacado.
	 */
	private static final int DIVISORDEDEFENSA = 2;
	/**
	 * Fuerza base del Enemigo.
	 */
	private static final int MODIFICADORBASEF = 10;
	/**
	 * Salud base del Enemigo.
	 */
	private static final int MODIFICADORBASES = 30;
	/**
	 * Defensa base del Enemigo.
	 */
	private static final int MODIFICADORBASED = 2;
	/**
	 * Multiplicador fuerza del Enemigo.
	 */
	private static final int MULTIPLICADORF = 3;
	/**
	 * Multiplicador salud del Enemigo.
	 */
	private static final int MULTIPLICADORS = 15;
	/**
	 * Multiplicador defensa del Enemigo.
	 */
	private static final int MULTIPLICADORD = 1;
	
	public Enemigo(int fuerza, int defensa, int nivel, String nombre, final int dificultadEnemigo) {
		super(fuerza, defensa, nivel, nombre);
		
		int dificultad;
		if( dificultadEnemigo == DIFICULTADALEATORIA) {
			dificultad = this.getRandom().nextInt(ELEGIRDIF);
		} else {
			dificultad =  dificultadEnemigo;
		}
		
		
		this.aumentarFuerza(MODIFICADORBASEF * (dificultad + 1) +
				(nivel - 1) * MULTIPLICADORF * (dificultad + 1));
		this.salud = MODIFICADORBASES * (dificultad + 1) + (nivel - 1) * MULTIPLICADORS * (dificultad + 1);
		this.aumentarDefensa(MODIFICADORBASED * (dificultad + 1) +
				(nivel - 1) * MULTIPLICADORD * (dificultad + 1));
	}

	@Override
	public int serAtacado(int daño) {
		// TODO Auto-generated method stub
		return 0;
	}

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
	@Override
	public void despuesDeTurno() {	}

	@Override
	public int atacar(Peleable atacado) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/**
	 * Retorna la cantidad de experiencia que 
	 * se le otorgará al Personaje que produjo
	 * la disminucion a 0 la salud del Enemigo
	 */
	@Override
	public int otorgarExp() {
		
		return this.getNivel() * MULTIPLICADOREXPEnemigo;
	}

	@Override
	public int getAtaque() {
		return this.getFuerza();
	}

	@Override
	public void setAtaque(int ataque) {
		this.aumentarFuerza(ataque);
	}

	@Override
	public boolean estaVivo() {
		return salud > 0;
	}

	public final void setSalud(final int salud) {
		this.salud = salud;
	}
}
