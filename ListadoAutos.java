package preparcial;
import java.util.*;
public class ListadoAutos {
	private ArrayList<Agencia>listadoAutos;
	public ListadoAutos() {
		listadoAutos = new ArrayList<Agencia>();
	}
	public void agregarAuto(Agencia a) {
		listadoAutos.add(a);
	}
	public void eliminarAuto(int idAuto) {
		for (int i=0; i < listadoAutos.size(); i++) {
			if (listadoAutos.get(i).getidAuto()==idAuto) {
				listadoAutos.remove(i);
				return;
			}
		}
	}
	public double calcularGanancia(int id) {
		for (int i=0; i < listadoAutos.size(); i++) {
			if (listadoAutos.get(i).getidAuto()== id) {
				return listadoAutos.get(i).calcularCosto();
			}
		}
		return 0;
	}
	public double gananciaTotal() {
		double total = 0;
		for (int i=0; i<listadoAutos.size(); i++) {
			total+= listadoAutos.get(i).calcularCosto();
		}
		return total;
	}
}
