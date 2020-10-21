package futbol;


public class Portero extends Futbolista {
	public short golesRecibidos;
	public byte dorsal;
	
	
	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		super(nombre, edad, "portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}
	
	public boolean jugarConLasManos() {
		return true;
	}
	
	public String toString() {
		return "El futbolista " + super.getNombre() + " tiene " + super.getEdad() + ", y juega de " + super.getPosicion() + " con el dorsal "  + dorsal + ". Le han marcado " + golesRecibidos;
	}
	
	public  int compareTo(Object f) {
		
		return this.golesRecibidos - ((Portero)f).golesRecibidos;

}
	
	
	
	
}
