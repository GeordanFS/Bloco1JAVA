package Repetiçao;

import java.util.Scanner;

public class Exercicio4while {

	public static void main(String[] args) {
		int x=1,i,c,s,cc=0,mn=0,ha=0,oc=0,nq=0,cd=0;
		Scanner ler = new Scanner(System.in);
		
		while(x<151)
			
		{	System.out.println("");
			System.out.println("Pessoa "+x);
			System.out.println("Insira a idade: ");
			i=ler.nextInt();
			System.out.println("Insira o sexo: ");
			s=ler.nextInt();
			System.out.println("Insira o comportamento da pessoa: ");
			c=ler.nextInt();
			x++;
			
			if(c==1)
				cc=cc+1;
			if(c==2 && s==1)
				mn=mn+1;
			if(c==3 && s==2)
				ha=ha+1;
			if(c==1 && s==3)
				oc=oc+1;
			if(c==2 && i>40)
				nq=nq+1;
			if(c==1 && i<18)
				cd=cd+1;
		}
		
		System.out.println("Existem "+cc+" pessoas calmas");
		System.out.println("Existem "+mn+" mulheres nervosas");
		System.out.println("Existem "+ha+" homens agressivos");
		System.out.println("Existem "+oc+" outros calmos");
		System.out.println("Existem "+nq+" pessoas nervosas com mais de 40 anos");
		System.out.println("Existem "+cd+" pessoas calmas com menos de 18 anos");
		ler.close();

	}

}
