package situacoesDesafiadoras;

import java.util.Scanner;

public class situacaoDesafiadora1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int dependentes, plano, valeTransp, valeAlimen, valeRefeicao;
        double salarioLiquido, descontoAcumulado = 0;
        
        System.out.println("Digite seu salário bruto: ");
        double salarioBruto = sc.nextDouble();
        //Entrada de dados sobre salário
        
        if (salarioBruto <= 1302) {
        	descontoAcumulado += salarioBruto * 0.08;
        } else if (salarioBruto > 1302 && salarioBruto <= 2571) {
        	descontoAcumulado += salarioBruto * 0.09;
        } else if (salarioBruto > 2571 && salarioBruto <= 3856) {
        	descontoAcumulado += salarioBruto * 0.11;
        } else if (salarioBruto > 3856 && salarioBruto <= 7087.22) {
        	descontoAcumulado += salarioBruto * 0.14;
        } else if (salarioBruto > 7087.22) {
        	descontoAcumulado += 570.88;
        }
        
        if (salarioBruto <= 1903.98) {
        	descontoAcumulado += 0;
        } else if (salarioBruto > 1903.98 && salarioBruto <= 2826.65) {
        	descontoAcumulado += (salarioBruto - 1903.98) * 0.075;
        } else if (salarioBruto > 2826.65 && salarioBruto <= 3751.05) {
        	descontoAcumulado += (922.66 * 0.075) + (salarioBruto - 2826.65) * 0.15;
        } else if (salarioBruto > 3751.05 && salarioBruto <= 4664.68) {
        	descontoAcumulado += (922.66 * 0.075) + (924.39 * 0.15) + (salarioBruto - 3751.05) * 0.225;
        } else if (salarioBruto > 4664.68) {
        	descontoAcumulado += (922.66 * 0.075) + (924.39 * 0.15) + (913.62 * 0.225) + (salarioBruto - 4664.68) * 0.275;
        }
        
        System.out.println("Digite o número de dependentes em sua casa: ");
        dependentes = sc.nextInt();
        descontoAcumulado -= 189.59 * dependentes;
        //Entrada de dados sobre dependentes
        
        System.out.println("Qual o seu plano de saúde?\n"
        		+ "1- Básico\n"
        		+ "2- Avançado\n"
        		+ "0- Não possui");
        plano = sc.nextInt();
        
        if (plano == 1) {
        	System.out.println("Você escolheu Plano Básico.");
        	descontoAcumulado += 150; //Desconto de 150 reais
        } else if (plano == 2) { 
        	System.out.println("Você escolheu Plano Avançado.");
        	descontoAcumulado += 300; //Desconto de 300 reais
        } else if (plano == 0) { 
        	System.out.println("Você escolheu que não possui plano de saúde.");
        }
        
        System.out.println("Você utiliza vale transporte?\n"
        		+ "1- Sim.\n"
        		+ "2- Não.");
        valeTransp = sc.nextInt();
        
        if (valeTransp == 1) {
        	System.out.println("Você utiliza vale transporte");
        	descontoAcumulado += salarioBruto * 0.06; //Desconto de 6% do Vale Transporte sobre o salário
        	System.out.println(descontoAcumulado);
        } else if (valeTransp == 2) { 
        	System.out.println("Você não utiliza vale transporte");
        }
        
        System.out.println("Você utiliza vale alimentação?\n"
        		+ "1- Sim.\n"
        		+ "2- Não.");
        valeAlimen = sc.nextInt();
        
        if (valeAlimen == 1) {
        	System.out.println("Você utiliza vale alimentação");
        	descontoAcumulado += 200;
        } else if (valeAlimen == 2) { 
        	System.out.println("Você não utiliza vale alimentação");
        }
        
        System.out.println("Você utiliza vale refeição?\n"
        		+ "1- Sim.\n"
        		+ "2- Não.");
        valeRefeicao = sc.nextInt();
        
        if (valeRefeicao == 1) {
        	System.out.println("Você utiliza vale refeição");
        	descontoAcumulado += 250;
        } else if (valeRefeicao == 2) { 
        	System.out.println("Você não utiliza vale refeição");
        }
        
        salarioLiquido = salarioBruto - descontoAcumulado;
        System.out.printf("\nSalário Líquido: %.2f", salarioLiquido);
        System.out.printf("\nPercentual de descontos: %.2f", descontoAcumulado);
        
        }


}
