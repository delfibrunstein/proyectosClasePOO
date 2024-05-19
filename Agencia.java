package preparcial;

public class Agencia {
	private int idAuto;
	private String modelo;
	private String marca;
	private double precioV;
	private double costo;
	private double impuesto;
	
	public int getidAuto() {
		return idAuto;
	}
	public void setidAuto(int idAuto) {
		this.idAuto = idAuto;
	}
	
	public String modelo() {
		return modelo;
	}
	public void setmodelo(String modelo) {
		this.modelo =modelo;
	}
	
	public String getmarca() {
		return marca;
	}
	public void setmarca(String marca) {
		this.marca = marca;
	}
	
	public double getprecioV() {
		return precioV;
	}
	public void setprecioV(double precioV) {
		this.precioV = precioV;
	}
	public double getimpuesto() {
		return impuesto;
	}
	public void setimpuesto(double impuesto) {
		this.impuesto = impuesto;
	}
	
	public double getcosto() {
		return costo;
	}
	public void setcosto(double costo) {
		this.costo = costo;
	}
	public double calcularCosto() {
		return precioV - (costo+impuesto);
	}
}


