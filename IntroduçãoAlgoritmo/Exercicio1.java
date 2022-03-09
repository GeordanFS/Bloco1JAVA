package IntroduçãoAlgoritmo;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int anos,meses,dias,anosd,mesesd,conta;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira sua idade em anos, meses e dias:");
		anos=ler.nextInt();
		meses=ler.nextInt();
		dias=ler.nextInt();
		anosd= anos*365;
		mesesd= meses*30;
		conta= anosd+mesesd+dias;

		System.out.println("Sua idade em dias é:"+conta);
		ler.close();
	}

}

