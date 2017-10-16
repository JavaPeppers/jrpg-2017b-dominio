package dominio;

public class Enemigo extends MadreDeTodo implements Peleable {
	
	public static final int RANGO = 100;
	private static final int saludTope = 60;
	private int salud;
	
	public Enemigo(int fuerza, int defensa, String nombre, int salud) {
		super(fuerza, defensa, 1, nombre);
		this.salud = salud;	
	}

	@Override
	public int serAtacado(int daño) {
		if(daño > 0) {
			salud -= daño;
			return daño;
		}
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
	public int atacar(final Peleable personaje) {
		
		if(!personaje.estaVivo())
			return 0;
		return personaje.serAtacado(this.getFuerza());
			
	}

	@Override
	public boolean estaVivo() {
		return salud > 0;
	}

	public final void setSalud(final int salud) {
		this.salud = salud;
	}


	@Override
	public int otorgarExp() { 
		return 0;
	}

	@Override
	public int getAtaque() {
		return this.getFuerza();
	}

	@Override
	public void setAtaque(int ataque) {
		this.aumentarFuerza(ataque);
	}

	public int getSaludTope() {
		return saludTope;
	}
}
