package IntroPOO;

public class EXE7PACIEN {

	public static void main(String[] args) {
		Paciente c1 = new Paciente();
		Paciente c2 = new Paciente();
		Paciente c3 = new Paciente();
		
		
		System.out.println("Paciente 1");
		c1.nome="Geordan";
		c1.endereço="Rua das laranjas 37";
		c1.telefone=1140028922;
		c1.cpf="0000001000200";
		c1.risco=1;
		c1.interna=8;
		c1.ficha();
		c1.internaçoes();
		c1.estado();
		System.out.println("\nPaciente 2");
	
		c2.nome="Jeordan";
		c2.endereço="Rua das Goiabas 47";
		c2.telefone=1140028923;
		c2.cpf="0000001000300";
		c2.risco=2;
		c2.interna=9;
		c2.ficha();
		c2.internaçoes();
		c2.estado();
		System.out.println("\nPaciente 3");
		
		c3.nome="Jordan";
		c3.endereço="Rua das Maças 57";
		c3.telefone=1140028924;
		c3.cpf="0000001000400";
		c3.risco=3;
		c3.interna=10;
		c3.ficha();
		c3.internaçoes();
		c3.estado();

	}

}
