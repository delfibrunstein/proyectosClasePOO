package ejerciciopractica;
import java.util.*;
public class Empresa {
	ArrayList <Empleados> listaEmpleados; //aca declaro mi array
	public Empresa() {
		listaEmpleados = new ArrayList <Empleados>(); //aca creo mi objeto
	}
	private boolean ValidarEmpleado(Empleados e) {
		for (int i = 0; i< listaEmpleados.size(); i++) {
			Empleados el = listaEmpleados.get(i);
			if (el.getDNI() == e.getDNI()){
				return false;
			}
		}
		return true;
	}
	public boolean AgregarEmpleado(Empleados e) {
		if (ValidarEmpleado(e)) {
			listaEmpleados.add(e);
			return true;
		}else {
			return false;
		}
	}
}
