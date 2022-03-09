package Condicional;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int I;
		
		System.out.println("Insira a idade da pessoa ");
		Scanner ler= new Scanner(System.in);
		I=ler.nextInt();
		if (I>9 && I<15)
		{
		System.out.println("A categoria é Infantil");
		}
		if (I>14 && I<18)
		{
			System.out.println("A categoria é Juvenil");
		}	
		if (I>17 && I<26) 
		{
			System.out.println("A categoria é Adulto");
		}	
		ler.close();
	}

}
