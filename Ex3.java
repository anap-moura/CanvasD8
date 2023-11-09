package CanvasD8;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		float sb,an,he,d,sl;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o valor do Salário Bruto:");
		sb = leia.nextFloat();
		System.out.println("\nDigite o valor do Adicional Noturno:");
		an = leia.nextFloat();
		System.out.println("\nDigite o valor das Horas Extras:");
		he = leia.nextFloat();
		System.out.println("\nDigite o valor dos Descontos:");
		d = leia.nextFloat();
		
		sl = sb+an+(he*5)-d;
		System.out.println("\nO valor do Salário Líquido é de:"+sl);
		
		
		
	}

}
