package IntroPOO;

public class Paciente {
	String nome, endereço;
	int telefone;
	String cpf;
	int risco;
	int interna;
	
	public void internaçoes()
	{
		if(interna>=10)
			System.out.println("Não há mais lugares disponíveis no hospital");
		else
			System.out.println("Há "+(10-interna)+" vagas no hospital");
			
	}
	public void ficha()
	{
		System.out.println("Nome: "+ this.nome);
		System.out.println("Telefone: " + this.telefone);
		System.out.println("Endereço: "+ this.endereço);
		System.out.println("CPF: "+this.cpf);
		System.out.println("O risco de vida do paciente é de classe: "+risco);
	}
	public void estado()
	{
		if (this.risco<=1)
			System.out.println("O paciente pode voltar para casa");
		if(this.risco>1 && risco<3)
			System.out.println("O paciente fica mais um dia no hospital");
		if(risco>2)
			System.out.println("O paciente vai para a UTI");
	}
}
