package aula01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Fluxograma {
	
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		
		Scanner leia = new Scanner (System.in);
		double salario, abono;
		
		System.out.println("Digite o valor do salário: ");
		salario = leia.nextDouble();
		
		System.out.println("Digite o valor do abono: ");
		abono = leia.nextDouble();
		
		System.out.println("Novo salário:" + df.format(salario+abono));
		
	}

}
