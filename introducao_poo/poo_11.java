package com.filipe.introducao_poo;
public class poo_11 {

	private String tipoCombustivel;
	private double valorLitro;
	private double quantidadeCombustivel;

	public poo_11(String tipoCombustivel,double valorLitro , double quantidadeCombustivel) {
		this.quantidadeCombustivel = quantidadeCombustivel;
		this.tipoCombustivel = tipoCombustivel;
		this.valorLitro = valorLitro;
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		if(tipoCombustivel.length() > 0)
			this.tipoCombustivel = tipoCombustivel;
	}

	public double getValorLitro() {
		return valorLitro;
	}

	public void setValorLitro(float valorLitro) {
		if(valorLitro > 0)
			this.valorLitro = valorLitro;
	}

	public double getQuantidadeCombustivel() {
		return quantidadeCombustivel;
	}

	public void setQuantidadeCombustivel(float quantidadeCombustivel) {
		if (quantidadeCombustivel > 0)
			this.quantidadeCombustivel = quantidadeCombustivel;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bomba [tipoCombustivel=");
		builder.append(tipoCombustivel);
		builder.append(", valorLitro=");
		builder.append(valorLitro);
		builder.append(", quantidadeCombustivel=");
		builder.append(quantidadeCombustivel);
		builder.append("]");
		return builder.toString();
	}
	public String abastecerPorValor(double valor) {
		StringBuilder builder = new StringBuilder();
		builder.append("O valor "+valor+" resultou em "+(valor/valorLitro)+" litros.");
		quantidadeCombustivel -= (valor/valorLitro);
		builder.append("\nLitros restantes na bomba: "+quantidadeCombustivel);
		return builder.toString();
	}

	public String abastecerPorLitro(double litros) {
		StringBuilder builder = new StringBuilder();
		builder.append("Os "+litros+" litros custaram "+(litros*valorLitro)+" R$.");
		quantidadeCombustivel -= (litros);
		builder.append("\nLitros restantes na bomba: "+quantidadeCombustivel);
		return builder.toString();
	}

	public String alterarValor(double valor) {
		this.valorLitro = valor;
		StringBuilder builder = new StringBuilder();
		
		builder.append("O Valor do litro agora é: "+valor);

		return builder.toString();
	}
	public String alterarCombustivel(String comb) {
		this.tipoCombustivel = comb;
		StringBuilder builder = new StringBuilder();

		builder.append("O tipo de combustivel agora é: "+comb);

		return builder.toString();
	}
	public String alterarQuantidadeCombustivel(double qtdcomb) {
		this.quantidadeCombustivel = qtdcomb;
		StringBuilder builder = new StringBuilder();

		builder.append("A quantidade da bomba agora é: "+qtdcomb);

		return builder.toString();
	}
	public String dadosFinais(){
		StringBuilder builder = new StringBuilder();
		
		builder.append("Combustivel atual: "+tipoCombustivel);
		builder.append("\nValor do litro atual: "+valorLitro);
		builder.append("\nLitros restantes na bomba: "+quantidadeCombustivel);
		
		return builder.toString();
	}

}

