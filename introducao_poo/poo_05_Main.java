package com.filipe.introducao_poo;
import java.util.Scanner;
public class poo_05_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int cod = 0;
		
		do {
			System.out.println("Especificação     Código     Preço  ");
			System.out.println("Cachorro Quente   100        R$ 1,20");
			System.out.println("Bauru Simples     101        R$ 1,30");
			System.out.println("Bauru com ovo     102        R$ 1,50");
			System.out.println("Hambúrguer        103        R$ 1,20");
			System.out.println("Cheeseburguer     104        R$ 1,30");
			System.out.println("Refrigerante      105        R$ 1,00");
			System.out.print("\ninforme o código do produto: ");
			cod = input.nextInt();
		}while(cod < 100 || cod > 105);
		
		System.out.print("\ninforme a quantidade: ");
		int quant = input.nextInt();
		
		poo_05 compra = new poo_05(cod,quant);
		
		System.out.println(compra.verFatura());
		
		
		input.close();
	}

}
