package PolimPOO;

public class Animais {

	public static void main(String[] args) 
	{
		Cachorro dog = new Cachorro();
		Cavalo cav = new Cavalo();
		Pregui�a pre = new Pregui�a();
		
		//Cachorro
		dog.setNome("Braia");
		dog.setIdade(2);
		dog.correr=true;
		System.out.println("O nome do meu cachorro � "+dog.getNome()+", ele tem "+dog.getIdade()+" anos, faz ");
		dog.som();
		System.out.println("e no momento");
		dog.correndo();
		System.out.println("\n");
		
		//Cavalo
		cav.setNome("P� de pano");
		cav.setIdade(7);
		cav.correr=true;
		System.out.println("O nome do meu cavalo � "+cav.getNome()+", ele tem "+cav.getIdade()+" anos, faz ");
		cav.som();
		System.out.println("e no momento");
		cav.correndo();		
		System.out.println("\n");
		
		//Pregui�a
		pre.setNome("Cansada");
		pre.setIdade(3);
		pre.subir=true;
		System.out.println("O nome da minha pregui�a � "+pre.getNome()+", ela tem "+pre.getIdade()+" anos, faz ");
		pre.som();
		System.out.println("e no momento");
		pre.subindo();	
		
	}

}
