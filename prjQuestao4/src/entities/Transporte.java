package entities;

public abstract class Transporte {
	private String carga;

	public Transporte(String carga) {
		this.carga = carga;
	}
	
	public String getCarga() {
		return carga;
	}

	public void setCarga(String carga) {
		this.carga = carga;
	}

	public abstract double calculaFrete(double valor, double peso);
}
