package Condicional;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		double n;
		
		System.out.println("Insira um número ");
		Scanner ler= new Scanner(System.in);
		n=ler.nextInt();
		
		if(n%2!=0)
			System.out.println("O número é ímpar e elevado ao quadrado é: "+ Math.pow(n,2));
			else
				System.out.println("O número é par e sua raiz quadrada é: "+ Math.sqrt(n));
			
		
		ler.close();
			

}}