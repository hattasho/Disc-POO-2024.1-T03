package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double menor_cons = 0; 
		int menor_vei = 0;
		int i2 = 0;
		String [] veiculo = {"Toyota", "Gol", "Vectra", "Fusca", "Fiat"};
		double [] consumo = {100, 150, 175, 225, 160};
		for (int i = 0; i <= 4; i = i + 5) {
			System.out.println("Qual o carro que você deseja ver? (OBS: 0 = Toyota, 1 = Gol, 2 = Vectra, 3 = Fusca, 4 = Fiat");
			i2 = sc.nextInt();
		}
		System.out.println("O consumo de seu carro é: " + consumo[i2]);
		if (i2 == 1) {
			menor_cons = consumo[i2];
			menor_vei = i2;
		} else {
			if (consumo[i2] < menor_cons) {
				menor_cons = consumo[i2];
				menor_vei = i2;
			}
		}
		double valor = Math.ceil(1000/consumo[i2]);
		int i = 0;
		System.out.println("O veículo " + veiculo[i2] + " consome aproximadamente " + valor + " litro(s) de combustível para percorrer 1000 Km");
		for (i = 0; i <= consumo.length; i++) {
			if (consumo[i] > 200) {
				break;
			}
		}
		System.out.println("O veículo mais econômico é o veículo " + veiculo[i]);
		System.out.println("consumo dos outros carros:");
		System.out.print("Toyota: " + consumo[0] + " Litro(s). Gol: " + consumo[1] + " Litro(s). Vectra: " + consumo[2] + " Litro(s).");
		System.out.print(" Fusca: " + consumo[3] + " Litro(s). Fiat: " + consumo[4]);
     }

}