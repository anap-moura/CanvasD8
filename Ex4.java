package CanvasD8;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		float n1,n2,n3,n4,dif;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nDigite o primeiro valor:");
		n1=leia.nextFloat();
		System.out.println("\nDigite o segundo valor:");
		n2=leia.nextFloat();
		System.out.println("\nDigite o terceiro valor:");
		n3=leia.nextFloat();
		System.out.println("\nDigite o quarto valor:");
		n4=leia.nextFloat();
		
		dif = (n1*n2)-(n3*n4);
		System.out.println("\nO valor do Cálculo é:" +dif);
		
		
		
		
		
	}

}
