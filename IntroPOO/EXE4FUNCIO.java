package IntroPOO;

public class EXE4FUNCIO {

	public static void main(String[] args) {
		Funcionario c1 = new Funcionario();
		Funcionario c2 = new Funcionario();
		Funcionario c3 = new Funcionario();
		
		System.out.println("Funcionário 1");
		c1.registrado=true;
		c1.nome="Geordan";
		c1.registro="02030405";
		c1.hora=6.50;
		c1.entrada();
		c1.desconto();
		System.out.println("\nFuncionário 2");
		
		c2.registrado=true;
		c2.nome="Jorge";
		c2.registro="02030406";
		c2.hora=7.50;
		c2.entrada();
		c2.desconto();
		System.out.println("\nFuncionário 3");
		c3.registrado=false;
		c3.entrada();
		
		
		

	}

}
