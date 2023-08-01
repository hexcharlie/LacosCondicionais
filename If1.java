package If;

import java.util.Scanner;

public class If1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  A,B,C;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\nDigite um número: ");
		A = leia.nextInt();
		System.out.print("\nDigite um número: ");
		B = leia.nextInt();
		System.out.print("\nDigite um número: ");
		C = leia.nextInt();
	
		if(A+B>C) {
			System.out.print("\nA Soma de A + B é Maior do que C");
			
		 if(A+B<=C) {
				System.out.print("\nA Soma de A + B é Menor do que C");
			}
		}
		
	}

}
