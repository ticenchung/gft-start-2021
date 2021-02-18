package entities;

public class Soma extends Operacao{
	/*private int valor1;
	private int valor2;
	
	public Soma(int valor1, int valor2) {
		this.valor1 = valor1;
		this.valor2 = valor2;
	}*/

	@Override
	public double efetuarOperacao(double num1, double num2) {
		return num1 + num2;
	}
}
