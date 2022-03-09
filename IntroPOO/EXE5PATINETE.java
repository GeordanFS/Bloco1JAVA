package IntroPOO;

public class EXE5PATINETE {

	public static void main(String[] args) {
		Patinete c1 = new Patinete();
		Patinete c2 = new Patinete();
		Patinete c3 = new Patinete();
		
		System.out.println("Patinete 1");
		c1.ligado=true;
		c1.carga=50;
		c1.velo=35;
		c1.liga();
		c1.bateria();
		System.out.println("A velocidade ultrapassou 30km/h");
		c1.funcionando();
		System.out.println("\nPatinete 2");
		c2.ligado=true;
		c2.carga=20;
		c2.liga();
		c2.bateria();
		System.out.println("\nPatinete 3");
		c3.ligado=false;
		c3.liga();
		
	}

}
