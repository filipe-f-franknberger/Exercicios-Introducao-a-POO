package com.filipe.introducao_poo;
import java.util.Scanner;
public class poo_01_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe seu nome: ");
		String Name = input.nextLine();
		
		System.out.print("Informe seu sobrenome: ");
		String Sname = input.nextLine();
				
		poo_01 Names = new poo_01(Name , Sname);	
		
		System.out.println(Names.montaNome());
		
		input.close();
	}

}
