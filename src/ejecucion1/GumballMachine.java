package ejecucion1;

public class GumballMachine {
	final static int VACIO = 0;
	final static int SIN_MONEDA = 1;
	final static int TIENE_MONEDA = 2;
	final static int PELOTITA_VENDIDA = 3;
	
	int state = VACIO;
	int cantidad = 0;
	
	public GumballMachine(int cantidad) {
		this.cantidad = cantidad;
		if (cantidad > 0) {
			state = SIN_MONEDA;
		}
	}
	
	public void CargarMoneda() {
		if ( state == TIENE_MONEDA){
			System.out.println("No se puede insertar la moneda");	
		}else if(state == SIN_MONEDA) {
			state = TIENE_MONEDA;
			System.out.println("Se inserto correctamnte");
		}else if(state == VACIO){
			System.out.println("ERROR");
		}else if(state == PELOTITA_VENDIDA) {
			System.out.println("PELOTITA VENDIDA");
		}
			
	}
}

