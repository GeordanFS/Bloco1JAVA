package Repeti�ao;

import java.util.Scanner;

public class Exercicio5dow {

	public static void main(String[] args) {
		int x=0, s=0;
		Scanner ler = new Scanner(System.in);
		do {
		System.out.println("Insira o n�mero ");
			x=ler.nextInt();
			s=s+x;
		}
		while(x!=0);
		
	
		System.out.println("A soma dos n�meros digitados �: "+s);
		ler.close();

	}

}
