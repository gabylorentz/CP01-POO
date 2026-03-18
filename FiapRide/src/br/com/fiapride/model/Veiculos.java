package br.com.fiapride.model;

public class Veiculos {
	// Dados foram privados, para manter o código mais seguro, sem que as possam alterar livremente.
	private String Dono;
	private String placa;
	private double combustivel;
	
	public Veiculos(String dono, String placa,double combustivelinicial) {
        this.Dono = dono;
        this.placa = placa;
        this.combustivel = combustivelinicial ; //Indica quanto tem no tanque, antes de abastecer e gasto.
}

	private void individuo (String Dono) {
	
}

	private void placa (String placa) {
	
}

	private void combustivel (double combustivel) {
	
}

	public String getDono() {
		return Dono;
}

	public String getplaca() {
		return placa;
}

	public double getcombustivel() {
		return combustivel;
	}
		// método para soma do combustivel adicioado.
		public void adicionarGasolina(double v) {
			if (v > 0) {
	            this.combustivel += v; 
	            //System.out.println("Foram adicionados " + v + " litros. Total: " + this.combustivel);
	}
	        }
		
		// método para subtração no combustivel utilizado.
		public void consumirGasolina (double v) {
	        if (v > 0) {
	            if (this.combustivel >= v) {
	                this.combustivel -= v; 
	                //System.out.println("Foram consumidos " + v + " litros.");
		}
	        }
		}

		
		
	}
