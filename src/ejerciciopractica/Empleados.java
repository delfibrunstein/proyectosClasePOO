package ejerciciopractica;

public class Empleados {
	private int dni;
	private String nombre;
	private double sueldoBruto;
	
	public Empleados(int dni, String nombre, double sueldoBruto) {
		this.dni = dni;
		this.nombre = nombre;
		this.sueldoBruto = sueldoBruto;
	}
	public int getDNI(){
		return dni;
	}
	
	public void setDNI(int dni){
		this.dni = dni;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setSueldoBruto(double sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}
	public double getSueldoBruto(){
		return sueldoBruto;
	}
	
	
}
