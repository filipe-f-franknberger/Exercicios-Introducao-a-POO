package com.filipe.introducao_poo;

public class poo_02 {

	private int n1;
	private int n2;
	
	public poo_02(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;	
		
	}
	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public int getN2() {
		return n2;
	}
	public void setN2(int n2) {
		this.n2 = n2;
	}
	@Override
	public String toString() {
		return "poo_02 [n1=" + n1 + ", n2=" + n2 + "]";
	}
	
	public String inter() {
		StringBuilder output = new StringBuilder();
			
			if(n1 < n2) {
				for(int i = (n1+1); i < n2;i++) {
					output.append(i+" ");
				}
			}else {
				output.append("Invertendo valores: ");;
				for(int i = (n2+1); i < n1;i++) {
					output.append(i+" ");
				}
			}
			return output.toString();
	}
}