package IntroPOO;

public class Conta {
	String nome;
	double saldo;
	String cpf;
	int senha;
	double saque;
	double deposito;
	
	
	
	public void entrar()
	{
		if (this.senha!=12345678)
			System.out.println("Você errou a senha da sua conta");
		else
			System.out.println("Senha correta, acesso liberado");
	}
	
	public void dados()
	{
		System.out.println("Nome: "+ this.nome);
		System.out.println("CPF: "+this.cpf);
		System.out.println("Saldo: "+this.saldo);
	}
	public void sacar()
	{
		if (this.saldo>0)
			System.out.println("Insira o valor de saque: "+saque);
			System.out.println("Seu saldo ficou: "+(this.saldo-this.saque));
		
	}
	public void depositar()
	{
		if (this.deposito>0)
			System.out.println("Insira o valor do deposito: "+deposito);
			System.out.println("Seu saldo ficou: "+(this.saldo+this.deposito));
	}
	public void encerrar()
		{
			
		System.out.println("Obrigado e volte sempre");
		
	}
}
