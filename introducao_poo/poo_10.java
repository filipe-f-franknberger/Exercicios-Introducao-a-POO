package com.filipe.introducao_poo;

public class poo_10 {

	private int volume;
	private int canal;
	private int opt;
	
	public poo_10(int volume , int canal, int opt) {
		this.volume = volume;
		this.canal = canal;
		this.opt = opt;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	@Override
	public String toString() {
		return "poo_10 [volume=" + volume + ", canal=" + canal + "]";
	}
	
	public String alteraVolume(int vol) {
		StringBuilder output = new StringBuilder();
		if(opt == 1) {
			volume += vol;
			if(volume > 100) {
				volume = 100;
			}
			output.append("O Volume foi aumentado para: "+volume);
		}else {
			volume -= vol;
			if(volume <= 0) {
				volume = 0;
			}
			output.append("O Volume foi diminuido para: "+volume);
		}
		
		return output.toString();
	}
	
	public String alteraCanal(int can) {
		StringBuilder output = new StringBuilder();
		canal = can;
		
		if(can <= 0) {
			canal = 1;
		}else if(can >= 200) {
			canal = 200;
		}else {
			canal = can;
		}
		output.append("O Canal foi alterado para: "+canal);
		
		return output.toString();
	
	}
	
}
