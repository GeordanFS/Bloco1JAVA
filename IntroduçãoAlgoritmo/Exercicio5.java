package IntroduçãoAlgoritmo;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		double n1, n2, n3, soma;
		System.out.println("Insira as notas 1,2 e 3:");
		Scanner ler= new Scanner(System.in);
		n1=ler.nextDouble();
		n2=ler.nextDouble();
		n3=ler.nextDouble();
		n1= n1*0.2;
		n2= n2*0.3;
		n3= n3*0.5;
		soma= n1+n2+n3;
		System.out.println("Média ponderada: "+ soma);
		ler.close();

	}

}
