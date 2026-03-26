package br.com.fatec.tpi03;

import java.util.Scanner;

public class Exercicio1Pares {
    public static void executar(Scanner scanner) {
        System.out.println("\n--- Exercício 1: Números pares em intervalo ---");
        int inicio = InputUtils.lerInteiro(scanner, "Digite o início do intervalo: ");
        int fim = InputUtils.lerInteiro(scanner, "Digite o fim do intervalo: ");

        if (inicio > fim) {
            int temp = inicio;
            inicio = fim;
            fim = temp;
        }

        StringBuilder saida = new StringBuilder("Pares: ");
        boolean encontrou = false;

        for (int i = inicio; i <= fim; i++) {
            if (i % 2 == 0) {
                saida.append(i).append(' ');
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Não há números pares nesse intervalo.");
            return;
        }

        System.out.println(saida.toString().trim());
    }
}
