package br.com.fatec.tpi03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            exibirMenu();
            int opcao = InputUtils.lerInteiro(scanner, "Escolha uma opção: ");

            switch (opcao) {
                case 1 -> Exercicio1Pares.executar(scanner);
                case 2 -> Exercicio2Fibonacci.executar(scanner);
                case 3 -> Exercicio3Primos.executar(scanner);
                case 4 -> Exercicio4MediaFatec.executar(scanner);
                case 5 -> Exercicio5Incremento.executar(scanner);
                case 0 -> {
                    System.out.println("Encerrando programa.");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void exibirMenu() {
        System.out.println("\n=== LISTA DE EXERCÍCIOS - TPI-03 ===");
        System.out.println("1) Números pares em intervalo");
        System.out.println("2) Sequência de Fibonacci até n termos");
        System.out.println("3) Números primos em intervalo");
        System.out.println("4) Média do aluno (modelo Fatec)");
        System.out.println("5) Intervalo de 0 ao limite com incremento");
        System.out.println("0) Sair");
    }
}
