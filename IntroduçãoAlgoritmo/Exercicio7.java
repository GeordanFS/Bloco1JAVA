package IntroduçãoAlgoritmo;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		double A,B,C,D,E,F,X,Y;
		System.out.println("Insira os números A,B,C,D,E e F:");
		Scanner ler= new Scanner(System.in);
		A=ler.nextDouble();
		B=ler.nextDouble();
		C=ler.nextDouble();
		D=ler.nextDouble();
		E=ler.nextDouble();
		F=ler.nextDouble();
		X=(C*E-B*F)/(A*E-B*D);
		Y=(A*F-C*D)/(A*E-B*D);
		System.out.println("O resultado de X é "+ X +" e de Y é "+ Y);
		ler.close();
		

	}

}
