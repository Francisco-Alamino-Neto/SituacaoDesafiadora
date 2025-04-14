package situacaoDesafiadora;

import java.util.Scanner;

public class SituacaoDesafiodora1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int dependentes, plano, valeTransp, valeAlimen, valeRefeicao;
        double salarioDesc;
        
        System.out.println("Digite seu salário bruto: ");
        double salarioBruto = sc.nextDouble();
        //Entrada de dados sobre salário
        
        System.out.println("Digite o número de dependentes em sua casa: ");
        dependentes = sc.nextInt();
        //Entrada de dados sobre dependentes
        
        System.out.println("Qual o seu plano de saúde?\n"
        		+ "1- Básico\n"
        		+ "2- Avançado\n"
        		+ "0- Não possui");
        plano = sc.nextInt();
        
        if (plano == 1) {
        	System.out.println("Você escolheu Plano Básico.");
        } else if (plano == 2) { 
        	System.out.println("Você escolheu Plano Avançado.");
        } else if (plano == 0) { 
        	System.out.println("Você escolheu que não possui plano de saúde.");
        }
        
        System.out.println("Você utiliza vale transporte?\n"
        		+ "1- Sim.\n"
        		+ "2- Não.");
        valeTransp = sc.nextInt();
        
        if (valeTransp == 1) {
        	System.out.println("Você utiliza vale transporte");
        	salarioDesc = (salarioBruto - (salarioBruto * 0.06)); //Desconto de 6% do Vale Transporte sobre o salário
        	System.out.println(salarioDesc);
        } else if (valeTransp == 2) { 
        	System.out.println("Você não utiliza vale transporte");
        }
        
        System.out.println("Você utiliza vale alimentação?\n"
        		+ "1- Sim.\n"
        		+ "2- Não.");
        valeAlimen = sc.nextInt();
        
        if (valeAlimen == 1) {
        	System.out.println("Você utiliza vale alimentação");
        } else if (valeAlimen == 2) { 
        	System.out.println("Você não utiliza vale alimentação");
        }
        
        System.out.println("Você utiliza vale alimentação?\n"
        		+ "1- Sim.\n"
        		+ "2- Não.");
        valeRefeicao = sc.nextInt();
        
        if (valeRefeicao == 1) {
        	System.out.println("Você utiliza vale refeição");
        } else if (valeRefeicao == 2) { 
        	System.out.println("Você não utiliza vale refeição");
        }
        
        }
	}

