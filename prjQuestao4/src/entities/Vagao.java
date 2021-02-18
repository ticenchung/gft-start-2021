package entities;

public class Vagao extends Transporte {
	
	public Vagao(String carga) {
		super(carga);
	}

	@Override
	public double calculaFrete(double valor, double peso) {
		return (peso * 0.2) + (valor * 0.1);
	}
	
}
