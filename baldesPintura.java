package bimestre2;

import java.util.Scanner;

public class baldesPintura {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double largura, comprimento, parede, baldes;
		
		System.out.println("Digite a largura da parede");
		largura=leia.nextDouble();
		
		System.out.println("Digite o comprimento da parede: ");
		comprimento=leia.nextDouble();
		
		parede=largura*comprimento;
		
		baldes=parede/3.8;
		
		System.out.println("A quantidade de baldes necessaria é "+baldes);
		
		leia.close();
	}

}
