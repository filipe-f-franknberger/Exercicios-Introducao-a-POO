package com.filipe.introducao_poo;
import java.util.Scanner;
public class poo_04_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe quanto ganha por hora: ");
		double sal = input.nextDouble();
		
		System.out.print("Informe o número de horas trabalhadas: ");
		int hour = input.nextInt();
		
		poo_04 mostraSalario = new poo_04(sal,hour);
		
		System.out.println(mostraSalario.verResult());

		input.close();
	}

}
