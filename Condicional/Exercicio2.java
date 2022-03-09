package Condicional;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		double n1, n2, n3;
		System.out.println("Insira três números:");
		Scanner ler= new Scanner(System.in);
		n1=ler.nextInt();
		n2=ler.nextInt();
		n3=ler.nextInt();
		if(n1>=n2 && n1>=n3 && n2>=n3)
		    System.out.println("A ordem crescente é "+n3+ ","+ n2 +" e "+ n1);
		    else if (n1>=n2 && n1>=n3 && n3>=n2)
				System.out.println("A ordem crescente é "+n2+ ","+ n3 +" e "+ n1);
			else if (n2>=n1 && n2>=n3 && n1>=n3)
				System.out.println("A ordem crescente é "+n3+ ","+ n1 +" e "+ n2);
			else if (n2>=n1 && n2>=n3 && n3>=n1)
				System.out.println("A ordem crescente é "+n1+ ","+ n3 +" e "+ n2);
			else if (n3>=n1 && n3>=n2 && n1>=n2)
				System.out.println("A ordem crescente é "+n2+ ","+ n1 +" e "+ n3);
			else if (n3>=n1 && n3>=n2 && n2>=n1)
				System.out.println("A ordem crescente é "+n1+ ","+ n2 +" e "+ n3);
		
		
		ler.close();
	}

}
