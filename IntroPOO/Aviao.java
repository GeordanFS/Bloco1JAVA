package IntroPOO;

public class Aviao {
	
	
			String piloto;
			boolean people;
			int gas ;
			boolean turb;
			String rota;
			
			
			
			public void passageiros()
			{
				if (this.people==false)
					System.out.println("O voo ainda n�o est� cheio, aguarde os passageiros");
				else
					System.out.println("O voo j� est� cheio, podemos viajar");
			}
			
			public void voo()
			{
				System.out.println("Nome do piloto: "+ this.piloto);
				System.out.println("Rota do voo: " + this.rota);
	
				
			}
			public void aviao()
			{
				if (this.gas<=50)
					System.out.println("O tanque est� ficando vazio, encha-o para viajar");
				else
					System.out.println("O tanque est� cheio, pode ligar as turbinas");
			}
			public void turbinas()
			{
				if(turb==false)
					System.out.println("Ligue as turbinas");
				else
					System.out.println("Turbinas ligadas, decolando...");
			}
				
				
}
