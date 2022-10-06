package com.filipe.introducao_poo;
import java.util.Scanner;
public class poo_03_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe n1: ");
		float n1 = input.nextFloat();
		System.out.print("Informe n2: ");
		float n2 = input.nextFloat();
			
		int opt;
		
		do {
			System.out.println("Informe a opção que deseja realizar: ");
			System.out.println("1 - Soma; ");
			System.out.println("2 - Subtração; ");
			System.out.println("3 - Multiplicação; ");
			System.out.println("4 - Divisão. ");
			opt = input.nextInt();
		}while(opt < 1 && opt > 4);
		
		poo_03 operation = new poo_03(n1,n2);
		
		if(opt == 1) {
			System.out.println(operation.soma());
		}else if(opt == 2) {
			System.out.println(operation.sub());
		}else if(opt == 3) {
			System.out.println(operation.mult());
		}else{
			System.out.println(operation.div());
		}
	
		
		input.close();
	}

}
