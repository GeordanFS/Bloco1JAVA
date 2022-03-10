package PolimPOO;

public class Animais {

	public static void main(String[] args) 
	{
		Cachorro dog = new Cachorro();
		Cavalo cav = new Cavalo();
		Preguiça pre = new Preguiça();
		
		//Cachorro
		dog.setNome("Braia");
		dog.setIdade(2);
		dog.correr=true;
		System.out.println("O nome do meu cachorro é "+dog.getNome()+", ele tem "+dog.getIdade()+" anos, faz ");
		dog.som();
		System.out.println("e no momento");
		dog.correndo();
		System.out.println("\n");
		
		//Cavalo
		cav.setNome("Pé de pano");
		cav.setIdade(7);
		cav.correr=true;
		System.out.println("O nome do meu cavalo é "+cav.getNome()+", ele tem "+cav.getIdade()+" anos, faz ");
		cav.som();
		System.out.println("e no momento");
		cav.correndo();		
		System.out.println("\n");
		
		//Preguiça
		pre.setNome("Cansada");
		pre.setIdade(3);
		pre.subir=true;
		System.out.println("O nome da minha preguiça é "+pre.getNome()+", ela tem "+pre.getIdade()+" anos, faz ");
		pre.som();
		System.out.println("e no momento");
		pre.subindo();	
		
	}

}
