package dominio;

public class Enemigo extends MadreDeTodo implements Peleable {

	public Enemigo(int fuerza, int defensa, int nivel, String nombre) {
		super(fuerza, defensa, nivel, nombre);
		
	}

	@Override
	public int serAtacado(int daño) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getSalud() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMagia() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void despuesDeTurno() {
		// TODO Auto-generated method stub

	}

	@Override
	public int atacar(Peleable atacado) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int otorgarExp() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getAtaque() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setAtaque(int ataque) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean estaVivo() {
		// TODO Auto-generated method stub
		return false;
	}

}
