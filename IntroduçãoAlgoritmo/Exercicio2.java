package IntroduçãoAlgoritmo;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int anos,meses,dias;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira sua idade em dias:");
		dias= ler.nextInt();
		anos= (dias/365);
		meses= (dias%365)/30;
		dias= (dias%365)%30;
		System.out.println("Você tem "+ anos+ " anos "+ meses+ " meses e "+ dias +" dias");
	ler.close();}
		
}
