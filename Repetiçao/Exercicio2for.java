package Repeti�ao;

import java.util.Scanner;


public class Exercicio2for {

	public static void main(String[] args) {
		int x=0,i=0,p=0,n;
		Scanner ler = new Scanner(System.in);
		
		for(x=0;x<10;x++)
		{
			System.out.println("Insira um n�mero: ");
			n=ler.nextInt();
			if(n%2!=0)
				i=i+1;
				else
					p=p+1;
		
		}
		
		System.out.println("Existem "+i+" n�meros �mpares, e "+p+" n�meros pares");
		ler.close();
	}
}
	
