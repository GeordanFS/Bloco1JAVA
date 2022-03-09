package IntroPOO;

public class EXE2AVIAO {

	public static void main(String[] args) {
		Aviao c1 = new Aviao();
		Aviao c2 = new Aviao();
		
		
		c1.piloto="Jorge";
		c1.rota="Brasil - Espanha";
		c1.voo();
		c1.gas=70;
		c1.people=true;
		c1.turb=true;
		c1.passageiros();
		c1.aviao();
		c1.turbinas();
		 System.out.println("\n");
		 
		c2.piloto="Jonas";
		c2.rota="Brasil - Espanha";
		c2.voo();
		c1.gas=50;
		c1.people=false;
		c1.turb=false;
		c1.passageiros();
		c1.aviao();
		c1.turbinas();
	}

}
