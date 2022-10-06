package com.filipe.introducao_poo;

public class poo_05 {
	private int cod;
	private int quant;
	private double result;
	
	public poo_05(int cod , int quant) {
		this.cod = cod;
		this.quant = quant;
		
		if(cod == 100) {
			result = (1.20*quant);
		}else if(cod == 101) {
			result = (1.30*quant);
		}else if(cod == 102) {
			result = (1.50*quant);
		}else if(cod == 103) {
			result = (1.20*quant);
		}else if(cod == 104) {
			result = (1.30*quant);
		}else {
			result = (quant);
		}
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "poo_05 [cod=" + cod + ", quant=" + quant + ", result=" + result + "]";
	}
	
	public String verFatura() {
		StringBuilder output = new StringBuilder();
		
		if(cod == 100) {
			result = (1.20*quant);
		}else if(cod == 101) {
			result = (1.30*quant);
		}else if(cod == 102) {
			result = (1.50*quant);
		}else if(cod == 103) {
			result = (1.20*quant);
		}else if(cod == 104) {
			result = (1.30*quant);
		}else {
			result = (quant);
		}
		output.append("O Valor final é: "+result+" R$.");
		
		return output.toString();
	}
	
}

