package bimes2TomadaD;

import java.util.Scanner;

public class idadeClasse {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int anoA, anoN, idade;
		
		System.out.println("Digite o ano atual: ");
		anoA=leia.nextInt();
		
		System.out.println("Digite o ano de nascimento: ");
		anoN=leia.nextInt();
		
		idade=anoA-anoN;
		
		if(idade<10) {
			System.out.println("");
		}
		leia.close();
	}

}
