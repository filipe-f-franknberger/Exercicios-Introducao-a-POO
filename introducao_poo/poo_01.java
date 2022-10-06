package com.filipe.introducao_poo;

	public class poo_01 {
		
		private String Name;
		private String Sname;
		
	    public poo_01(String nome , String sob) {
	    	this.Name = nome;
	    	this.Sname = sob;
	     	
	    }

		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getSname() {
			return Sname;
		}
		public void setSname(String sname) {
			Sname = sname;
		}

		@Override
		public String toString() {
			return "poo_01 [Name=" + Name + ", Sname=" + Sname + "]";
		}
		
		public String montaNome() {
			StringBuilder output = new StringBuilder();
			
			output.append("Seu nome completo é: "+Name+" "+Sname);
			
			return output.toString();
		}
		
}	
	

	
