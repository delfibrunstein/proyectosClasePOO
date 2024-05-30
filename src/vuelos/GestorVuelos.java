package vuelos;

public abstract class GestorVuelos {
	private int numVuelo;
	private String destino;
	private int capacidadMax;
	private int asientosOcupados;
	
	public int getNumVuelo() {
		return numVuelo;
	}
	public void setNumVuelo(int numVuelo) {
		this.numVuelo = numVuelo;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public int getCapacidadMax() {
		return capacidadMax;
	}
	public void setCapacidadMax(int capacidadMax) {
		this.capacidadMax = capacidadMax;
	}
	public int getAsientosOcupados() {
		return asientosOcupados;
	}
	public void setAsientosOcupados(int asientosOcupados) {
		this.asientosOcupados = asientosOcupados;
	}
	public int CantAsientos() {
		return this.capacidadMax-this.asientosOcupados;
		
	}
	
	public abstract int CantEscalas(int numVuelo);
	public abstract int Categoria();
	
	
}
