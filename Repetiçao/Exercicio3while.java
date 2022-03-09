package Repetiçao;

import java.util.Scanner;

public class Exercicio3while {

	public static void main(String[] args) {
		int x=0,v=0,c=0;
		Scanner ler = new Scanner(System.in);
		
		while(x!=-99)
		{
			System.out.println("Insira a idade: ");
			x=ler.nextInt();
			if(x<21 && x>=0)
				v=v+1;
			if(x>50)
				c=c+1;
		
		}
		
		System.out.println("Existem "+v+" pessoas com menos de 21 anos, e "+c+" pessoas com mais de 50 anos");
		ler.close();

	}

}
