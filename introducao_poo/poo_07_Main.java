package com.filipe.introducao_poo;
import java.util.Scanner;
public class poo_07_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int opt = 0;
		String name = "Rogerkkk ";
		int idade = 22;
		double peso = 72;
		double altura = 189;
		
		do {
			System.out.println("Selecione o que deseja fazer: ");
			System.out.println("1 - Envelhercer; ");
			System.out.println("2 - Engordar; ");
			System.out.println("3 - Emagrecer; ");
			System.out.println("4 - Crescer. ");
			opt = input.nextInt();
		}while(opt < 1 && opt > 4);
		
		poo_07 metodo = new poo_07(name,idade,peso,altura);
		
		if (opt == 1) {
			System.out.println(metodo.methodEnvelhecer(12));
		}else if (opt == 2) {
			System.out.println(metodo.methodEngordar(27.32));
		}else if (opt == 3) {
			System.out.println(metodo.methodEmagrecer(14.32));
		}else{
			System.out.println(metodo.methodCrescer(14.32));
		}
		
		input.close();
	}

}
