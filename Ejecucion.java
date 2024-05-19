package preparcial;
import java.util.Scanner;
public class Ejecucion {
	private static ListadoAutos listado;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		listado = new ListadoAutos();
		Scanner scanner = new Scanner(System.in);
		String variantes = "";
		do {
			System.out.println("ingrese la opcion deseada: (a- agregar auto, e- eliminar, c- calcular costos, ct- calcular costos totales)");
			variantes = scanner.next();
			if (variantes.equals("a")) {
				agregarAuto();
			}else if (variantes.equals("e")) {
				eliminarAuto();
			}else if(variantes.equals("c")) {
				calcularCostos();
			}else if (variantes.equals("ct")){
				costosTotales();
			}
		}while (!variantes.equals("s"));
	
	}
	private static void calcularCostos() {
		// TODO Auto-generated method stub
		int id = 0;
		double ganancia = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el id del que quiere saber la ganancia	");
		id = scanner.nextInt();
		ganancia = listado.calcularGanancia(id);
		System.out.println("Ganancia: " + ganancia);
	}
	private static void costosTotales() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double costosT = 0;
		costosT = listado.gananciaTotal();
		System.out.println("Ganancias totales: "+ costosT);
		
	}
	private static void eliminarAuto() {
		// TODO Auto-generated method stub
		int id = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el id del que quiere eliminar");
		id = scanner.nextInt();
		listado.eliminarAuto(id);
	}
	private static void agregarAuto() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String tipo = "";
		System.out.println("Ingrese (importado si es de ese tipo, nacional si es de este tipo)");
		tipo = scanner.next();
			if (tipo.equals("importado")){
				Agencia i = new Agencia();
				System.out.println("Ingrese el id del auto: ");
				i.setidAuto(scanner.nextInt());
				System.out.println("Ingrese el modelo del auto: ");
				i.setmodelo(scanner.next());
				System.out.println("Ingrese la marca del auto: ");
				i.setmarca(scanner.next());
				System.out.println("Ingrese el precio del auto: ");
				i.setprecioV(scanner.nextDouble());
				System.out.println("Ingrese el impuesto del auto: ");
				i.setimpuesto(scanner.nextDouble());
				System.out.println("Ingrese el costo de produccion del auto: ");
				i.setcosto(scanner.nextDouble());
				listado.agregarAuto(i);
			}else if (tipo.equals("nacional")) {
				Agencia i = new Agencia();
				System.out.println("Ingrese el id del auto: ");
				i.setidAuto(scanner.nextInt());
				System.out.println("Ingrese el modelo del auto: ");
				i.setmodelo(scanner.next());
				System.out.println("Ingrese la marca del auto: ");
				i.setmarca(scanner.next());
				System.out.println("Ingrese el precio del auto: ");
				i.setprecioV(scanner.nextDouble());
				System.out.println("Ingrese el costo de produccion del auto: ");
				i.setcosto(scanner.nextDouble());
				listado.agregarAuto(i);
			}else {
				System.out.println("Error");
			}
	}

}
