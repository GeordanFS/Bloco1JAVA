package IntroPOO;

public class EXE6CONTA {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		Conta c3 = new Conta();
		
		System.out.println("Conta 1");
		c1.senha=12345678;
		c1.nome="Geordan";
		c1.cpf="0000001000200";
		c1.saldo=200.0;
		c1.saque=50;
		c1.entrar();
		c1.dados();
		c1.sacar();
		c1.encerrar();
		System.out.println("\nConta 2");
		c2.senha=12345678;
		c2.nome="Geordan";
		c2.cpf="0000001000200";
		c2.saldo=200.0;
		c2.deposito=50;
		c2.entrar();
		c2.dados();
		c2.depositar();
		c2.encerrar();
		System.out.println("\nConta 3");
		c3.senha=1234;
		c3.entrar();

	}

}
