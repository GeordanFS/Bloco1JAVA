package Condicional;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		double n;
		
		System.out.println("Insira um n�mero ");
		Scanner ler= new Scanner(System.in);
		n=ler.nextInt();
		
		if(n%2!=0)
			System.out.println("O n�mero � �mpar e elevado ao quadrado �: "+ Math.pow(n,2));
			else
				System.out.println("O n�mero � par e sua raiz quadrada �: "+ Math.sqrt(n));
			
		
		ler.close();
			

}}