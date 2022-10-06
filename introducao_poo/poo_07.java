package com.filipe.introducao_poo;

public class poo_07 {

	private String name;
	private int idade;
	private double peso;
	private double altura;
	
	public poo_07(String name, int idade , double peso, double altura) {
		this.altura = altura;
		this.idade = idade;
		this.peso = peso;
		this.idade = idade;		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "poo_07 [name=" + name + ", idade=" + idade + ", peso=" + peso + ", altura=" + altura + "]";
	}
	
	public String methodEnvelhecer(int ano) {
		StringBuilder output = new StringBuilder();
		idade += ano; 	
		output.append("Você envelheceu "+ano+" anos, agora está com "+idade+" anos.");
		return output.toString();
	}
	public String methodEngordar(double npeso) {
		StringBuilder output = new StringBuilder();
		peso += npeso; 	
		output.append("Você engordou "+npeso+" KGs, agora está pesando "+peso+" KGs.");	
		return output.toString();
	}
	public String methodEmagrecer(double npeso) {
		StringBuilder output = new StringBuilder();
		peso -= npeso; 	
		output.append("Você emagreceu "+npeso+" KGs, agora está pesando "+peso+" KGs.");
		return output.toString();
	}
	
	public String methodCrescer(double alt) {
		StringBuilder output = new StringBuilder();
		altura += alt; 	
		output.append("Você cresceu "+alt+" CM, agora está com "+altura+" CM de altura.");
		return output.toString();
	}
}
