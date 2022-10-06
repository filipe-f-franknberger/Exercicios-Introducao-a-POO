package com.filipe.introducao_poo;
public class poo_08 {

	private int num;
	private  String name;
	private double saldo;
	private int o;

	public poo_08(int num , String name , double saldo , int o) {
		this.num = num;
		this.name = name;
		this.saldo = saldo;
		this.o = o;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		if(num > 0)
			this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name.length()>0)
			this.name = name;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		if(saldo > 0)
			this.saldo = saldo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("poo_08 [num=");
		builder.append(num);
		builder.append(", name=");
		builder.append(name);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append(", o=");
		builder.append(o);
		builder.append("]");
		return builder.toString();
}

	public String cadastro() {
		StringBuilder saida = new StringBuilder();
		saida.append("Incluindo conta...");
		saida.append("Olá "+name+" conta n° "+num+" você foi cadastrado com sucesso.");
		saida.append("\nSaldo da conta: "+saldo);

		return saida.toString();
	}

	public String alterarNome(String nome) {
		this.name=nome;

		StringBuilder saida = new StringBuilder();
		saida.append("Olá, seu nome foi modificado para: "+nome);
		saida.append("\nSaldo da conta: "+saldo);
		return saida.toString();
	}

	public String deposito(double dep) {
		StringBuilder saida = new StringBuilder();
		saida.append("Olá,"+name+"o valor "+dep+"foi depositado.");
		saida.append("\nSaldo da conta: "+(saldo+dep));
		return saida.toString();
	}
	public String saque(double saque) {
		StringBuilder saida = new StringBuilder();
		saida.append("Olá,"+name+"o valor "+saque+"foi sacado.");
		saida.append("\nSaldo da conta: "+(saldo-saque));
		return saida.toString();
	}
}