package projetoSalario;

import java.util.Scanner;

public class projetoSalario {
	
	// Função que garante que a resposta do usuário seja válida ("sim" ou "não")
	public static String obterRespostaValida(Scanner sc) {
	    // Lê a entrada do usuário
	    String resposta = sc.nextLine();

	    // Enquanto a resposta não for "sim" ou "não", continua pedindo
	    while (!resposta.equals("sim") && !resposta.equals("não")) {
	        System.out.println("Opção inválida. Por favor, digite \"sim\" ou \"não\".");
	        resposta = sc.nextLine(); // Lê novamente a entrada
	    }

	    // Retorna a resposta válida
	    return resposta;
	}


	public static void main(String[] args) {
		
		// Cria um objeto Scanner para leitura de dados
		Scanner sc = new Scanner(System.in);
		
		// Solicita ao usuário o valor do salário bruto
		System.out.print("Digite seu salário bruto: ");
		double Salario = sc.nextDouble();
		
		// Consome a linha restante após o nextDouble
		sc.nextLine(); 

		// Inicializa a variável INSS
		double INSS = 0.0;
		
		// Cálculo do desconto do INSS com base no salário
		if (Salario <= 1302.00) {
			INSS = Salario * 0.08;
		} else if (Salario > 1302 && Salario <= 2571.00) {
			INSS = Salario * 0.09;
		} else if (Salario > 2571 && Salario <= 3856.00) {
			INSS = Salario * 0.11;
		} else if (Salario > 3856 && Salario <= 7087.22) {
			INSS = Salario * 0.14;
		} else if (Salario > 7087.22) {
			INSS = 570.88;
		}
		
		// Solicita ao usuário o número de dependentes
		System.out.print("Digite o número de dependentes: ");
		int Dependentes = sc.nextInt();
		
		// Consome a linha restante após o nextInt
		sc.nextLine(); 
		
		// Calcula o desconto de dependentes
		double DP = Dependentes * 189.59;
		
		// Inicializa a variável Imposto de Renda (IR)
		double IR = 0.0;
		
		// Cálculo do Imposto de Renda com base no salário e dependentes
		if (Salario <= 1903.98) {
			IR = 0;
		} else if (Salario <= 2826.65) {
			IR = (Salario * 0.075) - DP;
		} else if (Salario <= 3751.05) {
			IR = (Salario * 0.15) - DP;
		} else if (Salario <= 4664.68) {
			IR = (Salario * 0.225) - DP;
		} else if (Salario > 4664.68) {
			IR = (Salario * 0.275) - DP;
		}
		
		// Garante que o imposto de renda não seja negativo
		if (IR < 0.0) {
			IR = 0.0;
		}
		else {
			IR=IR;
		}
		
		// Solicita ao usuário se utiliza Vale Transporte
		System.out.print("Utiliza Vale Transporte?(sim/não): ");
		String RVT = obterRespostaValida(sc);
		// Calcula o desconto do Vale Transporte
		double VT = (RVT.equals("sim")) ? Salario * 0.06 : 0;
	
		// Solicita ao usuário se utiliza Vale Alimentação
		System.out.print("Utilza Vale Alimentação?(sim/não): ");
		String RVA = obterRespostaValida(sc);
		// Calcula o desconto do Vale Alimentação
		double VA = (RVA.equals("sim")) ? 200 : 0;

		// Solicita ao usuário se utiliza Vale Refeição
		System.out.print("Utilza Vale Refeição?(sim/não): ");
		String RVR = obterRespostaValida(sc);
		// Calcula o desconto do Vale Refeição
		double VR = (RVR.equals("sim")) ? 250 : 0;
	
		// Solicita o plano de saúde do usuário
		System.out.printf("Informe o seu plano de saúde: \n"
			+"Plano de Básico (Digite 1) \n"
			+"Plano de Avançado (Digite 2) \n"
			+"Não possui plano (Digite 3) \n");
		
		// Lê a escolha do plano de saúde
		String RPS = sc.nextLine();
		
		// Inicializa o valor do plano de saúde
		double PS = 0.0;
		
		// Verifica a escolha do usuário para o plano de saúde
		while (!RPS.equals("1") && !RPS.equals("2") && !RPS.equals("3")) {
		    System.out.println("Opção inválida. Por favor, digite 1, 2 ou 3.");
		    RPS = sc.nextLine();
		}
		
		// Define o valor do plano de saúde com base na escolha
		if (RPS.equals("1")) {
			PS = 150;
		}
		else if (RPS.equals("2")) {
			PS = 300;
		}
		else { 
			PS = 0;
		}
		
		// Exibe os descontos calculados
		System.out.printf("Descontos:\n"
		    + "INSS R$ %.2f\n"
		    + "Imposto de Renda R$ %.2f\n"
		    + "Vale Transporte R$ %.2f\n"
		    + "Vale Alimentação R$ %.2f\n"
		    + "Vale Refeição R$ %.2f\n"
		    + "Plano de Saúde R$ %.2f\n", INSS, IR, VT, VA, VR, PS);
		
		// Calcula o total dos descontos
		double Total = (INSS+IR+VT+VA+VR+PS);
		
		// Exibe o total dos descontos e o salário líquido
		System.out.printf("Descontos totais: R$ %.2f\n",Total);
		System.out.printf("Salário liquido: R$ %.2f\n",(Salario-Total));
	}
}
