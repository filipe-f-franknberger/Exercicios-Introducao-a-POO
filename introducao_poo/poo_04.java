package com.filipe.introducao_poo;

public class poo_04 {

	private double sal;
	private int hour;
	
	public poo_04(double sal, int hour) {
		this.hour = hour;
		this.sal = sal;
	}


	public double getSal() {
		return sal;
	}


	public void setSal(double sal) {
		this.sal = sal;
	}


	public int getHour() {
		return hour;
	}


	public void setHour(int hour) {
		this.hour = hour;
	}

	@Override
	public String toString() {
		return "poo_04 [sal=" + sal + ", hour=" + hour + "]";
	}


	public String verResult() {
		StringBuilder output = new StringBuilder();
		
		double Bruto = (hour*sal);
		double INSS = (Bruto* 0.08);
		double Sind = (Bruto*0.05);
		double IR = (Bruto*0.11);
		double Liq = (((Bruto-IR)-INSS)-Sind);
		
		output.append("Salário bruto: "+Bruto+" R$.");
		output.append("\nValor pago ao INSS: "+INSS+" R$.");
		output.append("\nValor pago ao sindicato: "+Sind+" R$.");
		output.append("\nSalário líquido: "+Liq+" R$.");
	
		return output.toString();	
	}
	
}
