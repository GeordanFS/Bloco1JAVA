package IntroPOO;

public class Funcionario {
	
	
			String nome;
			double hora ;
			String registro;
			boolean registrado;
			
			
			
			public void entrada()
			{
				if (this.registrado==true)
					System.out.println("Funcionário de Registro Nº "+registro+ " e nome "+nome+ " entrada liberada");
				else
					System.out.println("Registro não encontrado, você não é mais funcionário");
			}
			
			public void desconto()
			{
				if(this.hora>7.00)
					System.out.println("Você está atrasado e será descontado");
				else
					System.out.println("Você chegou no horário");
			}
			
}
