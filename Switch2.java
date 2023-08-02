package Switch;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite o Nome do Colaborador: ");
        String nomeColaborador = leia.nextLine();

        System.out.print("Digite o Código do Cargo (de 1 a 6): ");
        int codigoCargo = leia.nextInt();

        System.out.print("Digite o Salário: ");
        float salario = leia.nextFloat();
        
        float reajuste = 0;
        
        switch (codigoCargo) {
        case 1:
            reajuste = 0.10f; 
            break;
        case 2:
            reajuste = 0.07f; 
            break;
        case 3:
            reajuste = 0.09f; 
            break;
        case 4:
            reajuste = 0.06f; 
            break;
        case 5:
            reajuste = 0.05f; 
            break;
        case 6:
            reajuste = 0.08f; 
            break;
        default:
            System.out.println("Código de cargo inválido!");
            System.exit(1);
            }
           
            float novoSalario = salario + (reajuste * salario);
            
            System.out.println("\nNome do Colaborador: " + nomeColaborador);
            System.out.println("Cargo: " + obterCargo(codigoCargo));
            System.out.println("Novo Salário: R$" + novoSalario);}
            
            
            public static String obterCargo(int codigoCargo) {
                switch (codigoCargo) {
                    case 1:
                        return "Gerente";
                    case 2:
                        return "Vendedor";
                    case 3:
                        return "Supervisor";
                    case 4:
                        return "Motorista";
                    case 5:
                        return "Estoquista";
                    case 6:
                        return "Técnico de TI";
                    default:
                        return "Cargo desconhecido";
                }

            
		
		
		
	}

}
