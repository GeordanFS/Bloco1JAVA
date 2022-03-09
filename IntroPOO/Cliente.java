package IntroPOO;

public class Cliente {
	
	
		String nome, email;
		int telefone ;
		String cpf;
		boolean cadastrado;
		
		
		
		public void existecadastro()
		{
			if (this.cadastrado==false)
				System.out.println("O cliente não está cadastrado, por favor cadastre-o");
			else
				System.out.println("Exibindo cadastro do cliente");
		}
		
		public void cadastro()
		{
			System.out.println("Nome: "+ this.nome);
			System.out.println("Telefone: " + this.telefone);
			System.out.println("Email: "+ this.email);
			System.out.println("CPF: "+this.cpf);
		}
		public void carrinho()
		{
			if (this.cadastrado==true)
				System.out.println("Prossiga para o carrinho de compras do cliente");
			else
				System.out.println("Não é possível adicionar itens no carrinho sem cadastro");
		}
		

		
		
}
