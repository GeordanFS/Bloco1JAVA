package Repetiçao;

import java.util.Scanner;

public class Exercicio6dow {

	public static void main(String[] args) {
		
			double x=0, s=0,q=0;
			Scanner ler = new Scanner(System.in);
			do {
			System.out.println("Insira o número ");
				x=ler.nextInt();
				if(x%3==0 && x!=0) {
					s=s+x;
					q=q+1;
				}
			}
			while(x!=0);
			
		
			System.out.println("A média dos números múltiplos de 3 é: "+  (s/q));
			ler.close();

		}

	}


