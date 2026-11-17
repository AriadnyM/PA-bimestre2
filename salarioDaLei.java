package bimes2TomadaD;

import java.util.Scanner;

public class salarioDaLei {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double salario, mSalario;
		
		System.out.println("Digite o salario: ");
		salario=leia.nextDouble();
		
		System.out.println("Digite o salario minimo: ");
		mSalario=leia.nextDouble();
		if(salario<mSalario) {
			System.out.println("Seu salário está fora da lei imposta");
		}else {
			System.out.println("Seu salário está dentro da lei imposta");
		}
		
		leia.close();
	}

}
