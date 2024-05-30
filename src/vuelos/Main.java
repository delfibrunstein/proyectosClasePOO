package vuelos;
import java.util.*;
public class Main {
	private static Compania compania;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		compania = new Compania();
		String opcion= "";
		do {
			System.out.println("Ingrese a- para agregar un vuelo, b- para saber la cantidad de asientos disponibles y c- para saber la cantidad de escalas e un vuelo internacional");
			opcion = scanner.next();
			if (opcion.equals("a")) {
				agregarVuelo();
			}else if (opcion.equals("b")) {
				cantidadAsientos();
			}else if(opcion.equals("c")) {
				cantidadEscalas();
			}
		}while(!opcion.equals("s"));	
		scanner.close();
	}
	private static void cantidadEscalas() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//compania = new Compania();
		System.out.println("Ingrese el id del vuelo que quiere saber las escalas: ");
		int NumVuelo= scanner.nextInt();
		int escalas = compania.CantEscalas(NumVuelo);
		if (escalas!=-1) {
			System.out.println("Cantidad de escalas: "+escalas);
		}else {
			System.out.println("Error");
		}
	}
	private static void cantidadAsientos() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//compania = new Compania();
		int n = 0;
		System.out.println("Ingrese el id del vuelo que quiere saber la cantidad de asientos: ");
		n = scanner.nextInt();
		int num = 0;
		num = compania.CantidadAsientos(n);
		System.out.println("Asientos Disponibles: "+num );
	}
		
	private static void agregarVuelo() {
	    String variante = "";
	    Scanner scanner = new Scanner(System.in);
	    do {
	        System.out.println("Ingrese c- si es de cabotaje, i- si es internacional, o s- para salir");
	        variante = scanner.next();
	        if (variante.equals("c")) {
	            Cabotaje c = new Cabotaje();
	            System.out.println("Ingrese el numero de vuelo");
	            c.setNumVuelo(scanner.nextInt());
	            System.out.println("Ingrese el destino del vuelo");
	            c.setDestino(scanner.next());
	            System.out.println("Ingrese la capacidad maxima del vuelo");
	            c.setCapacidadMax(scanner.nextInt());
	            System.out.println("Ingrese el numero de asientos ocupados de vuelo");
	            c.setAsientosOcupados(scanner.nextInt());
	            compania.AgregarVuelo(c);
	        } else if(variante.equals("i")) {
	            Internacional i = new Internacional();
	            System.out.println("Ingrese el numero de vuelo");
	            i.setNumVuelo(scanner.nextInt());
	            System.out.println("Ingrese el destino del vuelo");
	            i.setDestino(scanner.next());
	            System.out.println("Ingrese la capacidad maxima del vuelo");
	            i.setCapacidadMax(scanner.nextInt());
	            System.out.println("Ingrese el numero de asientos ocupados de vuelo");
	            i.setAsientosOcupados(scanner.nextInt());
	            System.out.println("Ingrese el numero de escalas del vuelo");
	            i.setCantidadEscalas(scanner.nextInt());
	            compania.AgregarVuelo(i);
	        }
	    } while (!variante.equals("s"));
	    //scanner.close();
	}

}
