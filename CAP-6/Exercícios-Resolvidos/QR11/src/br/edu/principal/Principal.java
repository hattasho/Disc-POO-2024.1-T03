package br.edu.principal;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] temperaturas = new float[12];        
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.printf("Informe a temperatura média do mês %d: ", i + 1);
            temperaturas[i] = input.nextFloat();
        }
        float maiorTemperatura = temperaturas[0];
        float menorTemperatura = temperaturas[0];
        int mesMaiorTemperatura = 0;
        int mesMenorTemperatura = 0;       
        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] > maiorTemperatura) {
                maiorTemperatura = temperaturas[i];
                mesMaiorTemperatura = i;
            }
            if (temperaturas[i] < menorTemperatura) {
                menorTemperatura = temperaturas[i];
                mesMenorTemperatura = i;
            }
        }        
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};        
        System.out.printf("Maior temperatura: %.1f graus Celsius em %s\n", maiorTemperatura, meses[mesMaiorTemperatura]);
        System.out.printf("Menor temperatura: %.1f graus Celsius em %s\n", menorTemperatura, meses[mesMenorTemperatura]);
    }
}