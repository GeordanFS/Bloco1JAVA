package IntroPOO;

public class EXE3ELETRO {

	public static void main(String[] args) {
		Eletronico c1 = new Eletronico();
		
		
		c1.ligado=true;
		c1.energia();
		c1.nome="Alexa";
		c1.comando="Olá Alexa";
		c1.apresentar();
		System.out.println("\n");
		System.out.println("Usuário disse: "+c1.comando);
		System.out.println("\n");
		c1.comando="Olá Alexa";
		c1.ligar();
		
		System.out.println("\n");
		c1.comando="Desligar Alexa";
		
		System.out.println("Usuário disse: "+c1.comando);
		System.out.println("\n");
		c1.desligar();
	}

}
