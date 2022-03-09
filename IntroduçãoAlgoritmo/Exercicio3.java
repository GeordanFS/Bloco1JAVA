package IntroduçãoAlgoritmo;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int seg,min,horas;
		System.out.println("Insira o tempo em segundos:");
		Scanner ler = new Scanner(System.in);
		seg=ler.nextInt();
			
		horas= (seg/3600);
		min= (seg%3600)/60;
		seg= (seg%3600)%60;
		System.out.println("O tempo é "+ horas + " horas, "+ min+ " minutos e "+ seg +" seg"); 
	ler.close();}

}
