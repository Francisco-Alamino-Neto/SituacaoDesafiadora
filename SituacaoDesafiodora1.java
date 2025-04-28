package situacaoDesafiadora;

import java.util.Scanner;

public class SituacaoDesafiodora1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int dependentes, inserirPlano, inserirValeTransp, inserirValeAlimen, inserirValeRefeicao;
        double salarioLiquido, inss = 0, ir = 0, plano = 0, valeTransp = 0, valeAlimen = 0, valeRefeicao = 0;
        
        System.out.println("Digite seu salário bruto: ");
        double salarioBruto = sc.nextDouble();
        //Entrada de dados sobre salário
        
        if (salarioBruto <= 1302) {
        	inss += salarioBruto * 0.08;
        } else if (salarioBruto > 1302 && salarioBruto <= 2571) {
        	inss += salarioBruto * 0.09;
        } else if (salarioBruto > 2571 && salarioBruto <= 3856) {
        	inss += salarioBruto * 0.11;
        } else if (salarioBruto > 3856 && salarioBruto <= 7087.22) {
        	inss += salarioBruto * 0.14;
        } else if (salarioBruto > 7087.22) {
        	inss += 570.88;
        } //Cálculo de contribuição para o INSS
        
        if (salarioBruto <= 1903.98) {
        	ir += 0;
        } else if (salarioBruto > 1903.98 && salarioBruto <= 2826.65) {
        	ir += (salarioBruto - 1903.98) * 0.075;
        } else if (salarioBruto > 2826.65 && salarioBruto <= 3751.05) {
        	ir += (922.66 * 0.075) + (salarioBruto - 2826.65) * 0.15;
        } else if (salarioBruto > 3751.05 && salarioBruto <= 4664.68) {
        	ir += (922.66 * 0.075) + (924.39 * 0.15) + (salarioBruto - 3751.05) * 0.225;
        } else if (salarioBruto > 4664.68) {
        	ir += (922.66 * 0.075) + (924.39 * 0.15) + (913.62 * 0.225) + (salarioBruto - 4664.68) * 0.275;
        } //Cálculo do Imposto de Renda
        
        System.out.println("Digite o número de dependentes em sua casa: ");
        dependentes = sc.nextInt();
        ir -= 189.59 * dependentes;
        //Entrada de dados sobre dependentes
        
        System.out.println("Qual o seu plano de saúde?\n"
        		+ "1- Básico\n"
        		+ "2- Avançado\n"
        		+ "0- Não possui");
        inserirPlano = sc.nextInt();
        
        if (inserirPlano == 1) {
        	System.out.println("Você escolheu Plano Básico.");
        	plano += 150; //Desconto de 150 reais
        } else if (inserirPlano == 2) { 
        	System.out.println("Você escolheu Plano Avançado.");
        	plano += 300; //Desconto de 300 reais
        } else if (inserirPlano == 0) { 
        	System.out.println("Você escolheu que não possui plano de saúde.");
        }
        
        System.out.println("Você utiliza vale transporte?\n"
        		+ "1- Sim.\n"
        		+ "2- Não.");
        inserirValeTransp = sc.nextInt();
        
        if (inserirValeTransp == 1) {
        	System.out.println("Você utiliza vale transporte");
        	valeTransp += salarioBruto * 0.06; //Desconto de 6% do Vale Transporte sobre o salário
        } else if (inserirValeTransp == 2) { 
        	System.out.println("Você não utiliza vale transporte");
        }
        
        System.out.println("Você utiliza vale alimentação?\n"
        		+ "1- Sim.\n"
        		+ "2- Não.");
        inserirValeAlimen = sc.nextInt();
        
        if (inserirValeAlimen == 1) {
        	System.out.println("Você utiliza vale alimentação");
        	valeAlimen += 200; //desconto de 200 reais
        } else if (inserirValeAlimen == 2) { 
        	System.out.println("Você não utiliza vale alimentação");
        }
        
        System.out.println("Você utiliza vale refeição?\n"
        		+ "1- Sim.\n"
        		+ "2- Não.");
        inserirValeRefeicao = sc.nextInt();
        
        if (inserirValeRefeicao == 1) {
        	System.out.println("Você utiliza vale refeição");
        	valeRefeicao += 250; //desconto de 250 reais
        } else if (inserirValeRefeicao == 2) { 
        	System.out.println("Você não utiliza vale refeição");
        }
        
        salarioLiquido = salarioBruto - (valeTransp + valeAlimen + valeRefeicao + inss + ir + plano);
        System.out.printf("\nSalário Líquido: %.2f", salarioLiquido);
        System.out.printf("\nINSS: %.2f", inss);
        System.out.printf("\nImposto de Renda: %.2f", ir);
        System.out.printf("\nVale Transporte: %.2f", plano);
        System.out.printf("\nVale Transporte: %.2f", valeTransp);
        System.out.printf("\nVale Alimentação: %.2f", valeAlimen);
        System.out.printf("\nVale Refeição: %.2f", valeRefeicao);
        
        }


}
