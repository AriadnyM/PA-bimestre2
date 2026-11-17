package bimestre2;

import java.util.Scanner;

public class reajusteSal {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double sal, rea, nSal;
		
		System.out.println("Digite o valor do salario: ");
		sal=leia.nextDouble();
		
		rea=sal/100*10;
		
		nSal=sal+rea;
		
		System.out.println("O salario após reajuste ficou: "+nSal);
		
		leia.close();

	}

}
