package IntroPOO;

public class Paciente {
	String nome, endere�o;
	int telefone;
	String cpf;
	int risco;
	int interna;
	
	public void interna�oes()
	{
		if(interna>=10)
			System.out.println("N�o h� mais lugares dispon�veis no hospital");
		else
			System.out.println("H� "+(10-interna)+" vagas no hospital");
			
	}
	public void ficha()
	{
		System.out.println("Nome: "+ this.nome);
		System.out.println("Telefone: " + this.telefone);
		System.out.println("Endere�o: "+ this.endere�o);
		System.out.println("CPF: "+this.cpf);
		System.out.println("O risco de vida do paciente � de classe: "+risco);
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
