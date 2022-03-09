package IntroPOO;

public class EXE1CLIENTE {

	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		
		c1.cadastrado=true;
		c1.existecadastro();
		
		c1.nome="Geordan";
		c1.email="geordan@email.com";
		c1.telefone=1140028922;
		c1.cpf="0000001000200";
		c1.cadastro();
		c1.carrinho();
		System.out.println("\n");
		c2.cadastrado=false;
		c2.existecadastro();
		c2.carrinho();
		
	
		
	}
	}


