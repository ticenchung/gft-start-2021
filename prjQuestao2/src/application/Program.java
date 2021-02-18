package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	    
		System.out.println("Digite um valor inteiro: ");
		int valor = entrada.nextInt();

		for (int i = 0; i < valor; i++) {
			System.out.print("Incomoda ");
		}

		System.out.println("muito mais");

		entrada.close();
	}

}
