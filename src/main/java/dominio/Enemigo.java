package dominio;

public class Enemigo extends MadreDeTodo implements Peleable {
	

	private int salud;
	private int ataque;
	
	public Enemigo(int fuerza, int defensa, String nombre, int ataque, int salud) {
		super(fuerza, defensa, 1, nombre);
		this.ataque = ataque;
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
		return personaje.serAtacado(this.ataque);
			
	}
	

	@Override
	public int getAtaque() {
		return this.ataque;
	}

	@Override
	public void setAtaque(int ataque) {
		this.ataque = ataque;
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
}
