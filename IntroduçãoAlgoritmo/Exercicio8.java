package Introdu��oAlgoritmo;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		double carro, contaimpostos;
		System.out.println("Insira o valor de f�brica do carro:");
		Scanner ler = new Scanner(System.in);
		carro=ler.nextDouble();
		contaimpostos= carro+carro*0.28+carro*0.45;
		System.out.println("O custo do carro ao consumidor �: "+ contaimpostos);
ler.close();
	}

}
