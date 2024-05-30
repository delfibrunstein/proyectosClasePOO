package vuelos;

public class Internacional extends GestorVuelos{
	private int cantidadEscalas;
	private int nVuelo;
	
	public int getCantidadEscalas() {
		return cantidadEscalas;
	}

	public void setCantidadEscalas(int cantidadEscalas) {
		this.cantidadEscalas = cantidadEscalas;
	}
	public int CantEscalas(int nVuelo) {
		return this.cantidadEscalas;
	}

	public int CantEscalas() {
	   
	    return 0; 
	}

	@Override
	public int Categoria() {
	    
	    return 0;
	}

	
}
