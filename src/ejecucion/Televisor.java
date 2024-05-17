package ejecucion;

public class Televisor {
	private boolean estaEncendido = false;
	private int volumen;
	private int canal;
	
	public void encender() {
		estaEncendido = true;
	}
	public void subirVolumen() {
		if (estaEncendido) {
			volumen ++;
		}else {
			System.out.println("El tv no esta enendido");
		}
	}
	public int getVolumen(){
		return volumen;
	}
	public void cambiarCanal(int pcanal){
		if (estaEncendido) {
			canal = pcanal;
		}else {
			System.out.println("El televisor esta apagado");
		}
			}
	public int nCanal() {
		return canal;
	}
}
