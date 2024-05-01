package br.edu.principal;

public class Principal {
	public static void perfeitos(int v[]) {
		double r, soma = 0; 
		int a;
		int num = 1;int cont = 0;
		while(cont < 3) {
			
			soma = 0;
			
			for (a = 1; a < num; a++) {
				r = num % a;
				if (r == 0) {
					soma = soma + a;
				}
			}
			if (soma == num) {
				v[cont] = num;
				cont = cont + 1;
			}
			num = num + 1;
		}
	}
	public static void main(String[] args) {
		int v [] = new int [3]; int i = 0;
		perfeitos(v);
		for (i = 0; i < 3; i++) {
			System.out.println(v[i]);
		}	
	}

}