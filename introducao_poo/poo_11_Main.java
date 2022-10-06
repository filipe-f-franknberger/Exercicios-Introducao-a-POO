package com.filipe.introducao_poo;
import java.util.Scanner;
public class poo_11_Main {

	public static void main(String[] args) {
	// TODO Auto-generated method stub]

	Scanner input = new Scanner(System.in);

	System.out.print("Informe o tipo de combustivel: ");
	String tipoCombustivel = input.nextLine();
	System.out.print("Informe o valor do litro: ");
	double valorLitro = input.nextDouble();
	System.out.print("Informe a reserva de combustivel do posto: ");
	double quantidadeCombustivel = input.nextDouble();

	poo_11 posto = new poo_11(tipoCombustivel,valorLitro,quantidadeCombustivel);
	//method

	int method = 0;
	boolean continuar = true;
	do {
		System.out.println("Qual método deseja realizar? ");
		System.out.println("1 - Abastecer por valor; ");
		System.out.println("2 - Abastecer por litro; ");
		System.out.println("3 - Alterar o valor do litro; ");
		System.out.println("4 - Alterar o tipo de combustivel; ");
		System.out.print("5 - Alterar a reserva de combustivel do posto. ");
		method = input.nextInt();
		
		if(method == 1) {
			System.out.print("Informe o valor para abastecer: \n");
			double abas = input.nextDouble();
			System.out.println(posto.abastecerPorValor(abas));
		}else if(method == 2) {
			System.out.print("Informe os litros para abastecer:\n ");
			double lit = input.nextDouble();
			System.out.println(posto.abastecerPorLitro(lit));
		}else if(method == 3) {
			System.out.print("Informe o valor do litro para alterar: \n");
			double lit_alt = input.nextDouble();
			System.out.println(posto.alterarValor(lit_alt));
		}else if(method == 4) {
			System.out.print("Informe o tipo do combustivel para alterar: \n");
			String comb_alt = input.next();
			System.out.println(posto.alterarCombustivel(comb_alt));
			}else{
			System.out.print("Informe a quantidade de combustivel para alterar: \n");
			double qtd_comb = input.nextDouble();
			System.out.println(posto.alterarQuantidadeCombustivel(qtd_comb));
		}
		System.out.println(posto.dadosFinais());
		
		System.out.print("\nDigite 0 se quiser fechar programa , caso contrário digite outro número: ");
		int opt = input.nextInt();
		if(opt == 0 || posto.getQuantidadeCombustivel() <= 0) {
			if( posto.getQuantidadeCombustivel() <= 0) {
				System.out.println("\nO Combustivel acabou , fim do programa. :(");
			}else {
				System.out.println("\nFim do programa. :(");
			}
			continuar = false;
		}else if(posto.getQuantidadeCombustivel() > 0)
			continuar = true;
		
	
		}while(continuar);

	input.close();
	}

}