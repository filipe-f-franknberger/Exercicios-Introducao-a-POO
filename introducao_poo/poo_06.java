package com.filipe.introducao_poo;

public class poo_06 {

	private int lado;
	
	public poo_06(int lado) {
		this.lado = lado;	
	}	

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}


	@Override
	public String toString() {
		return "poo_06 [lado=" + lado + "]";
	}

	public String voltaLado() {
		StringBuilder output = new StringBuilder();
		output.append("Seu lado é: "+lado);
		return output.toString();
	}
	public String mudaLado(int lad) {
		StringBuilder output = new StringBuilder();
		lado = lad;
		output.append("Seu lado foi modificado, agora é: "+lado);
		return output.toString();
	}
	public String calculaArea() {
		StringBuilder output = new StringBuilder();
		output.append("Sua área é: "+(lado*lado));
		return output.toString();
	}

}
