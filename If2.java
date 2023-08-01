package If;

import java.util.Scanner;

public class If2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o número");
		numero = leia.nextInt();
		
		if(numero %2 == 0) {
			System.out.println("\nO número é par!  :)  ");}
			else  {
				System.out.println("\nO número é impar!  :(  ");
			}
		if(numero >= 0) {
			System.out.println("\nO número é positivo");
		}
		else {
			System.out.println("\nO número é negativo");
		}
		}

	}


