package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);		
		
		int valor[] = new int[3];
		int maior = 0, menor = 0, i;
		
		for (i = 0; i < valor.length; i++) {
			System.out.println("Digite o valor: ");
			valor[i] = entrada.nextInt();
		
			if (i == 0) {  
				maior = valor[i];  
			    menor = valor[i];  
			} else if (valor[i] > maior) {
				maior = valor[i];
			} else if (valor[i] < menor) {
				menor = valor[i];
			} else {
				System.out.println("Os números são iguais.");
			}
		}
		
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
			
		entrada.close();
	}

}
