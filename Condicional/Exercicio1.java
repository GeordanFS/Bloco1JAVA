package Condicional;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int n1, n2, n3;
		System.out.println("Insira três números inteiros:");
		Scanner ler= new Scanner(System.in);
		n1=ler.nextInt();
		n2=ler.nextInt();
		n3=ler.nextInt();
		if(n1>n2 && n1>n3)
			System.out.println("o número "+ n1 + " é o maior");
		if (n2>n1 && n2>n3)
			System.out.println("o número "+ n2 + " é o maior");
		if (n3>n2 && n3>n1)
			System.out.println("o número "+ n3 + " é o maior");
		
		ler.close();
	}

}
