package br.com.fiapride.main;
import br.com.fiapride.model.Veiculos;

public class SistemaPrincipal {
	public static void main(String[] args) {
		System.out.println("Sistema de gasto de combustivel"); 
		Veiculos v1 = new Veiculos("Carlos", "ABC1234",50.0);
		v1.adicionarGasolina(50.0);
        v1.consumirGasolina(20.0);
		
        System.out.println("Sr(a): " + v1.getDono() + 
                ", dono do carro de placa " + v1.getplaca() + 
                ", está com " + v1.getcombustivel() + " litros.");
	}
}
