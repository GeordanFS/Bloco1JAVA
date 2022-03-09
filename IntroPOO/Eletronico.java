package IntroPOO;

public class Eletronico {
	
	
	
	//ASSISTENTE VIRTUAL (ESTILO ALEXA E SIRI)
	String nome;
	boolean ligado;
	
	boolean luz;
	String comando;
	
	
	
	public void energia()
	{
		if(ligado==true)
		
			System.out.println("A assistente está na tomada e pode executar comandos");
			else
				System.out.println("Ligue na tomada primeiro");
		
	}
	
	public void apresentar()
	{
		this.luz=true;
		System.out.println("Olá meu nome é "+ this.nome+" e eu sou sua assistente virtual");
		System.out.println("Para me chamar diga: " + this.comando + " e eu aparecerei para ajudar");
		System.out.println("desligando...");
		this.luz=false;
		
		
	}
	public void ligar()
	{
		if (this.comando=="Olá Alexa")
			this.luz=true;
			System.out.println("**luz da assistente liga**");
			System.out.println("Olá, em que posso ajudar? ");
	}
	public void desligar() {		
		if (this.comando=="Desligar Alexa")
		{
			System.out.println("Estou a disposição");
			this.luz=false;
			System.out.println("**luz da assistente desliga**");
			
		}
	}
	
		
		
}
