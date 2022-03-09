package IntroduçãoAlgoritmo;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		double A,B,C,D,R,S;
		System.out.println("Insira os números A,B e C:");
		Scanner ler= new Scanner(System.in);
		A=ler.nextInt();
		B=ler.nextInt();
		C=ler.nextInt();
		R= Math.pow((A+B),2);
		S= Math.pow((C+B),2);
		D= ((R+S)/2);
		System.out.println("Resultado: "+ D);
ler.close();

	}

}
