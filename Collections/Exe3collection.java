package Collections;

import java.util.ArrayList;

public class Exe3collection {

	public static void main(String[] args) {
		
		ArrayList<String>estoque = new ArrayList<>();

		
		System.out.println("Adicionando produtos ao estoque da loja...");
		estoque.add("Arroz");
		estoque.add("Feijão");
		estoque.add("Óleo");
		System.out.println(estoque+"\n");
		
		System.out.println("Removendo produtos do estoque da loja...");
		estoque.remove(0);
		System.out.println(estoque+"\n");
		
		System.out.println("Atualizando produtos do estoque da loja...");
		estoque.add("Macarrão");
		estoque.add("Sal");
		estoque.set(0, "Café"); //SET atualizou o estoque
		estoque.set(1, "Ovos");
		System.out.println(estoque+"\n");
		
		System.out.println("Removendo item do estoque...");
		estoque.remove(3);
		System.out.println(estoque+"\n");
		
		System.out.println("Limpando dados do estoque...");
		estoque.clear();
		System.out.println(estoque);
		
			

	}

}
