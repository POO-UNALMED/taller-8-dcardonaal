package futbol;

public abstract class Jugador extends Futbolista{
	public short golesMarcados;
	public byte dorsal;
	public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}
	
	public Jugador() {
		super();
		golesMarcados = 289;
		dorsal = 7;
	}
	
	public  int compareTo(Futbolista f) {
		return this.getEdad() - f.getEdad();
	}
	
	public String toString() {
		return "El futbolista " + super.getNombre() + " tiene " + super.getEdad() + " y juega de " + super.getPosicion() + " con el dorsal "  + dorsal + ". Ha marcado " + golesMarcados;
	}
	

}
