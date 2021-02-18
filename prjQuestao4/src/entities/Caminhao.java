package entities;

public class Caminhao extends Transporte {
	
	public Caminhao(String carga) {
		super(carga);
	}

	@Override
	public double calculaFrete(double valor, double peso) {
		return (peso * 0.12) + (valor * 0.3);
	}
	
}
