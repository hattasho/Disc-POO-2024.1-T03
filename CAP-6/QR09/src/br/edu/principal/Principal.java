package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Esse programa efetua reserva de passagens aéreas.");
        
        // Inicialização dos arrays
        int[] voos = new int[12];
        int[] origens = new int[12];
        int[] destinos = new int[12];
        int[] assentosDisponiveis = new int[12];
        
        // Preencher os arrays com dados fornecidos pelo usuário
        preencherDados(sc, voos, origens, destinos, assentosDisponiveis);
        
        int opcao;
        do {
            // Exibe o menu principal
            System.out.println("\nMenu:");
            System.out.println("1 - Consultar");
            System.out.println("2 - Realizar reserva");
            System.out.println("3 - Encerrar");
            System.out.println("Escolha uma opção:");
            opcao = sc.nextInt();
            
            // Trata as opções do menu
            switch (opcao) {
                case 1:
                    consultarVoos(sc, voos, origens, destinos, assentosDisponiveis);
                    break;
                case 2:
                    realizarReserva(sc, voos, assentosDisponiveis);
                    break;
                case 3:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (opcao != 3);
        
        sc.close();
    }

    // Função para preencher os dados de voos, origem, destino e assentos disponíveis
    private static void preencherDados(Scanner sc, int[] voos, int[] origens, int[] destinos, int[] assentosDisponiveis) {
        for (int i = 0; i < 12; i++) {
            System.out.println("Insira os dados do voo " + (i + 1));
            System.out.println("Digite o número do voo:");
            voos[i] = sc.nextInt();
            
            System.out.println("Digite a origem (número de 1 a 12):");
            origens[i] = sc.nextInt();
            
            System.out.println("Digite o destino (número de 1 a 12):");
            destinos[i] = sc.nextInt();
            
            System.out.println("Digite o número de assentos disponíveis:");
            assentosDisponiveis[i] = sc.nextInt();
        }
    }

    // Função para consultar voos
    private static void consultarVoos(Scanner sc, int[] voos, int[] origens, int[] destinos, int[] assentosDisponiveis) {
        System.out.println("\nMenu de consulta:");
        System.out.println("1 - Consulta por voo");
        System.out.println("2 - Consulta por origem");
        System.out.println("3 - Consulta por destino");
        System.out.println("Escolha uma opção:");
        
        int opcao = sc.nextInt();
        
        switch (opcao) {
            case 1:
                System.out.println("Digite o número do voo para consulta:");
                int numVoo = sc.nextInt();
                consultarVooPorNumero(numVoo, voos, origens, destinos, assentosDisponiveis);
                break;
                
            case 2:
                System.out.println("Digite a origem para consulta:");
                int origemConsulta = sc.nextInt();
                consultarPorOrigem(origemConsulta, voos, origens, destinos, assentosDisponiveis);
                break;
                
            case 3:
                System.out.println("Digite o destino para consulta:");
                int destinoConsulta = sc.nextInt();
                consultarPorDestino(destinoConsulta, voos, origens, destinos, assentosDisponiveis);
                break;
                
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }

    // Função para realizar reservas
    private static void realizarReserva(Scanner sc, int[] voos, int[] assentosDisponiveis) {
        System.out.println("Digite o número do voo desejado:");
        int numVoo = sc.nextInt();
        
        // Verifica se o voo existe
        boolean vooEncontrado = false;
        for (int i = 0; i < 12; i++) {
            if (voos[i] == numVoo) {
                vooEncontrado = true;
                
                // Verifica se há assentos disponíveis
                if (assentosDisponiveis[i] > 0) {
                    assentosDisponiveis[i]--;
                    System.out.println("Reserva confirmada! Restam " + assentosDisponiveis[i] + " assentos disponíveis.");
                } else {
                    System.out.println("Voo lotado.");
                }
                break;
            }
        }
        
        if (!vooEncontrado) {
            System.out.println("Voo não encontrado.");
        }
    }

    // Função para consultar voo por número
    private static void consultarVooPorNumero(int numVoo, int[] voos, int[] origens, int[] destinos, int[] assentosDisponiveis) {
        boolean vooEncontrado = false;
        
        for (int i = 0; i < 12; i++) {
            if (voos[i] == numVoo) {
                vooEncontrado = true;
                System.out.println("Número do voo: " + voos[i]);
                System.out.println("Origem: " + origens[i]);
                System.out.println("Destino: " + destinos[i]);
                System.out.println("Assentos disponíveis: " + assentosDisponiveis[i]);
                break;
            }
        }
        
        if (!vooEncontrado) {
            System.out.println("Voo não encontrado.");
        }
    }

    // Função para consultar por origem
    private static void consultarPorOrigem(int origemConsulta, int[] voos, int[] origens, int[] destinos, int[] assentosDisponiveis) {
        boolean vooEncontrado = false;
        
        for (int i = 0; i < 12; i++) {
            if (origens[i] == origemConsulta) {
                vooEncontrado = true;
                System.out.println("Número do voo: " + voos[i]);
                System.out.println("Origem: " + origens[i]);
                System.out.println("Destino: " + destinos[i]);
                System.out.println("Assentos disponíveis: " + assentosDisponiveis[i]);
            }
        }
        
        if (!vooEncontrado) {
            System.out.println("Nenhum voo encontrado com a origem especificada.");
        }
    }

    // Função para consultar por destino
    private static void consultarPorDestino(int destinoConsulta, int[] voos, int[] origens, int[] destinos, int[] assentosDisponiveis) {
        boolean vooEncontrado = false;
        
        for (int i = 0; i < 12; i++) {
            if (destinos[i] == destinoConsulta) {
                vooEncontrado = true;
                System.out.println("Número do voo: " + voos[i]);
                System.out.println("Origem: " + origens[i]);
                System.out.println("Destino: " + destinos[i]);
                System.out.println("Assentos disponíveis: " + assentosDisponiveis[i]);
            }
        }
        
        if (!vooEncontrado) {
            System.out.println("Nenhum voo encontrado com o destino especificado.");
        }
    }
}