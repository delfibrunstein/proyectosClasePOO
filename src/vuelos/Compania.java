package vuelos;
import java.util.*;
public class Compania {
	private ArrayList<GestorVuelos>listadoVuelos;
	public Compania() {
		listadoVuelos = new ArrayList<GestorVuelos>();
	}
	public void AgregarVuelo(GestorVuelos x) {
		listadoVuelos.add(x);
	}
	public int CantidadAsientos(int numVuelo) {
		for (int i =0; i<listadoVuelos.size();i++) {
			if(listadoVuelos.get(i).getNumVuelo()==numVuelo) {
				return listadoVuelos.get(i).CantAsientos();
			}
		}
		return -1;
	}
	public int CantEscalas(int numVuelo) {
	    for (int i=0; i<listadoVuelos.size();i++) {
	        if (listadoVuelos.get(i).getNumVuelo()==numVuelo) {
	            return listadoVuelos.get(i).CantEscalas(numVuelo); // Devuelve el resultado de CantEscalas() cuando se encuentra el vuelo
	        }
	    }
	    return -1; // Devuelve -1 si el vuelo no se encuentra
	}

	
	public void buscarVuelo(int numVuelo) {
	    for (int i=0; i<listadoVuelos.size();i++) {
	    	if (listadoVuelos.get(i).getNumVuelo()==numVuelo){
	    		System.out.println("Vuelo encontrado");
	    	}
	    }
	}

}
