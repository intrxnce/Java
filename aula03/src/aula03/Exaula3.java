package aula03;

import java.util.Scanner;

public class Exaula3 {
	
	public static void main(String[] args) {
	
		Scanner leia = new Scanner (System.in);
	
		int numero = 0, soma = 0;
	
		do {
		
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
		
			if (numero > 0)
				soma += numero;
		
		}while(numero != 0);
		
		System.out.println("Soma dos números positivos: " + soma);
	
	}
	
}
