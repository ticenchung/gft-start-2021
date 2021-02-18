package application;

import java.util.Scanner;

import entities.Divisao;
import entities.Multiplicacao;
import entities.Soma;
import entities.Subtracao;

public class Program {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int valor1, valor2;
		
		System.out.println("Informe o primeiro valor: ");
		valor1 = entrada.nextInt();
		
		System.out.println("Informe o segundo valor: ");
		valor2 = entrada.nextInt();
		
		Soma soma = new Soma();
		System.out.println("Soma: " + soma.efetuarOperacao(valor1, valor2));
		
		Subtracao sub = new Subtracao();
		System.out.println("Subtracao: " + sub.efetuarOperacao(valor1, valor2));
		
		Multiplicacao mult = new Multiplicacao();
		System.out.println("Multiplicação: " + mult.efetuarOperacao(valor1, valor2));
		
		Divisao div = new Divisao();
		if (valor2 == 0)
			System.out.println("Divisão impossível.");
		else	
			System.out.println("Divisão: " + div.efetuarOperacao(valor1, valor2));
		
		entrada.close();
	}

}
