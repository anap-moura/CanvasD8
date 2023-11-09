package CanvasD8;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		float salario,abono,novoSal;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o Salário:");
		salario = leia.nextFloat();
		System.out.println("\nDigite o Abono:");
		abono = leia.nextFloat();
		
		novoSal= salario+abono;
		System.out.println("\nSeu novo salário é:" +novoSal);
		
		
		

	}

}
