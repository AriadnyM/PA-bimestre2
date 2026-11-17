package bimes2TomadaD;

import java.util.Scanner;

public class imparPar {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n;
		
		System.out.println("Digite um número");
		n=leia.nextInt();
		
		if(n%2==0) {
			System.out.println("O número é par");
		}else {
			System.out.println("O número é impar");
		}
		leia.close();
	}

}
