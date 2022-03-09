package IntroduçãoAlgoritmo;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		double x1,y1,x2,y2,D, DRaiz;
		System.out.println("Insira os pontos do primeiro plano (x1,y1):");
		Scanner ler= new Scanner(System.in);
		x1=ler.nextDouble();
		y1=ler.nextDouble();
		System.out.println("Insira os pontos do primeiro plano (x2,y2):");
		x2=ler.nextDouble();
		y2=ler.nextDouble();
		D= Math.pow((x2-x1),2)+Math.pow((y2-y1),2);
		DRaiz= Math.sqrt(D);  
		System.out.println("Resultado: "+ DRaiz);
	ler.close();}

}
