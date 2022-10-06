package com.filipe.introducao_poo;
import java.util.Scanner;
public class poo_02_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe n1: ");
		int n1 = input.nextInt();
		
		System.out.print("Informe n2: ");
		int n2 = input.nextInt();
		
		poo_02 intervalo = new poo_02(n1,n2);
		
		System.out.println(intervalo.inter());
		
		input.close();
	}

}
