package ejecucion;

public class Ejecucion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Televisor tvNro1 = new Televisor();
		Televisor tvNro2 = new Televisor();
	
		tvNro1.encender();
		tvNro1.subirVolumen();
		
		tvNro2.encender();
		tvNro2.subirVolumen();
		
		System.out.println("Volumen de tv1: " + tvNro1.getVolumen());
		System.out.println("Volumen de tv2: " + tvNro2.getVolumen());
		
		Televisor canal1 = new Televisor();
		canal1.encender();
		canal1.cambiarCanal(11);
		System.out.println("canal: " + canal1.nCanal());
	}
}
