package IntroPOO;

public class Funcionario {
	
	
			String nome;
			double hora ;
			String registro;
			boolean registrado;
			
			
			
			public void entrada()
			{
				if (this.registrado==true)
					System.out.println("Funcion�rio de Registro N� "+registro+ " e nome "+nome+ " entrada liberada");
				else
					System.out.println("Registro n�o encontrado, voc� n�o � mais funcion�rio");
			}
			
			public void desconto()
			{
				if(this.hora>7.00)
					System.out.println("Voc� est� atrasado e ser� descontado");
				else
					System.out.println("Voc� chegou no hor�rio");
			}
			
}
