package com.filipe.introducao_poo;

public class poo_03 {
	
	private float n1;
	private float n2;
	
	public poo_03(float n1, float n2){
		this.n1 = n1;
		this.n2 = n2;

	}
	
	public float getN1() {
		return n1;
	}

	public void setN1(float n1) {
		this.n1 = n1;
	}

	public float getN2() {
		return n2;
	}

	public void setN2(float n2) {
		this.n2 = n2;
	}

	@Override
	public String toString() {
		return "poo_03 [n1=" + n1 + ", n2=" + n2 + "]";
	}

	public String soma() {
		StringBuilder output = new StringBuilder();
		
		output.append("A Soma é: "+(n1+n2));
		
		return output.toString();
	}
	
	public String sub() {
		StringBuilder output = new StringBuilder();
		
		output.append("A Subtração é: "+(n1-n2));
		
		return output.toString();
	}
	
	public String mult() {
		StringBuilder output = new StringBuilder();
		
		output.append("A Multiplicação é: "+(n1*n2));
		
		return output.toString();
	}
	
	public String div() {
		StringBuilder output = new StringBuilder();
		
		output.append("A Divisão é: "+(n1/n2));
		
		return output.toString();
	}
		
}	


