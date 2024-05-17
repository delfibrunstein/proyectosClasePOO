package ejerciciopractica;
import java.util.*;
public class InterfazEmpleados {
	private static Empresa empresa;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		empresa = new Empresa();
		ingresoEmpleados();
	}
	public static void ingresoEmpleados(){
		Scanner scanner = new Scanner(System.in);
		int dni;
		String nombre;
		double sueldoBruto;
		Empleados e; //en e voy a almacenar todo lo de empleados
		
		System.out.print("Ingrese el dni o presione 0: ");
		dni = scanner.nextInt();
		while (dni > 0){
			System.out.print("Ingrese su nombre: ");
			nombre = scanner.next();
			System.out.print("Ingrese su sueldo Bruto: " );
			sueldoBruto = scanner.nextDouble();
			e = new Empleados(dni,nombre,sueldoBruto);//almaceno en e los datos de cada empleado
			if (empresa.AgregarEmpleado(e)) {
				System.out.println("Usuario agregado con exit0");
			}else {
				System.out.println("uSUARIO invalido");
			}
			System.out.print("Ingrese otro dni o 0 para salir: ");
			dni = scanner.nextInt();
		}
		scanner.close();
	}
}
