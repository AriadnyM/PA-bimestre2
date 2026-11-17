package bimestre2;

import java.util.Scanner;

public class cotacaoEuro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double euro, cotacaoE, real;
		
		System.out.println("Digite o valor em euro: ");
		euro=leia.nextDouble();
		
		System.out.println("Digite a cotação em euro ");
		cotacaoE=leia.nextDouble();
		
		real=euro*cotacaoE;
		
		System.out.println("O valor em real é "+real);
		
		leia.close();
	}

}
