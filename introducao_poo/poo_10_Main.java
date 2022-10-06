package com.filipe.introducao_poo;
import java.util.Scanner;
public class poo_10_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
		
	int volume = 42;
	int canal = 20;
	
	System.out.println("Digite 1 se quiser aumentar o volume: ");
	System.out.println("Digite 2 se quiser diminuir o volume: ");
	System.out.print("Digite 3 se trocar o canal: ");
	int opt = input.nextInt();
	
	poo_10 TV = new poo_10(volume,canal,opt);
	
	if(opt == 1) {
		System.out.println("O volume atual é: "+ TV.getVolume());
		System.out.print("Informe o quanto quer aumentar o volume: ");
		int aum = input.nextInt();
		System.out.println(TV.alteraVolume(aum));
	}else if (opt == 2) {
		System.out.println("O volume atual é: "+ TV.getVolume());
		System.out.print("Informe o quanto quer diminuir o volume: ");
		int dim = input.nextInt();
		System.out.println(TV.alteraVolume(dim));
	}else {
		System.out.println("O canal atual é: "+ TV.getCanal());
		System.out.print("Informe o número do canal para mudar(1 até 200): ");
		int can = input.nextInt();
		System.out.println(TV.alteraCanal(can));
	}
		
	input.close();
	}

}
