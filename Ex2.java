package CanvasD8;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		float n1,n2,n3,n4,media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com a primeira nota:");
		n1 = leia.nextFloat();
		System.out.println("\nEntre com a segunda nota:");
		n2 = leia.nextFloat();
		System.out.println("\nEntre com a terceira nota:");
		n3 = leia.nextFloat();
		System.out.println("\nEntre com a quarta nota:");
		n4 = leia.nextFloat();
		
		media = (n1+n2+n3+n4)/4;
		System.out.println("\nA média final é:"+media);
		
		
		

	}

}
