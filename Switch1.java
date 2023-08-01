package Switch;

import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome = null;
		int codigo;
		int quantidade;
		double valorU = 0;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\n\t\tMenu");
		System.out.println("\n1- Cachorro Quente");
		System.out.println("\n2- X-Salada");
		System.out.println("\n3- X-Bacon");
		System.out.println("\n4- Bauru");
		System.out.println("\n5- Refrigerante");
		System.out.println("\n6- Suco de Laranja");
		
		System.out.println("\nDigite o Codigo do produto");
		codigo = leia.nextInt();
		System.out.println("\nDigite a Quantidade");
		quantidade = leia.nextInt();
		
		switch (codigo) {
		case 1:
			valorU = 10.00;	
			nome = "Cachorro Quente";
		break;
		
		case 2:
			valorU = 15.00;	
			nome = "X-Salada";
		break;
		
		case 3:
			valorU =18.00;
			nome = "X-Bacon";
		break;
		
		case 4:
			valorU = 12.00;
			nome = "Bauru";
		break;
		
		case 5:
			valorU = 8.00;
			nome = "Refrigerante";
		break;
		
		case 6:
			valorU =13.00;
			nome = "Suco de Laranja";
		break;
		default:
			System.out.println("\nOpção Invalida!");
		}
			
			
			double valorTotal = valorU * quantidade;
			
			
			System.out.println("\nValor total: R$ " + valorTotal);
			System.out.println("\nNome dos produtos: " + nome);
			
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
