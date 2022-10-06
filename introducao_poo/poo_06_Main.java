package com.filipe.introducao_poo;
import java.util.Scanner;
public class poo_06_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o lado do quadrado: ");
		int lado = input.nextInt();
		
		poo_06 calculos = new poo_06(lado);
		
		int opt = 0;
		
		do {
			System.out.println("Informe o que deseja fazer com o quadrado: ");
			System.out.println("1 - Retornar valor do lado; ");
			System.out.println("2 - Mudar valor do lado; ");
			System.out.println("3 - Calcular a área. ");
			opt = input.nextInt();
		}while(opt < 1 && opt > 3);
		
		if(opt == 1) {
			System.out.println(calculos.voltaLado());
		}else if(opt == 2) {
			System.out.println(calculos.mudaLado(3));
		}else{
			System.out.println(calculos.calculaArea());
		}
		
		input.close();
	}

}
