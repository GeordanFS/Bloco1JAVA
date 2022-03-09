package IntroPOO;

public class Patinete {
	
	
	
		//PATINETE FREIO AUTOMÁTICO
		boolean ligado;
		int carga;
		int velo;
		boolean freio;
		
		
	
		
		public void liga()
		{
			if(ligado==true)
			
				System.out.println("O patinete está ligado");
				else
				System.out.println("Ligue o primeiro");
					
				
		}
		
		public void bateria()
		{
			if(carga>25)
			System.out.println("E tem bateria para funcionar");
			
			else
			System.out.println("Mas não tem bateria para funcionar os freios");
			
			
		}
		public void funcionando()
		{
			if (velo>=30)
				freio=true;
				if(freio==true)
					velo=velo-10;
				System.out.println("**freios acionados**");
				System.out.println("Velocidade reduzida para "+velo);
		}
		
		
		
}
