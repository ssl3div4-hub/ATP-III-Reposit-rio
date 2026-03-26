package br.com.fatec.tpi03;

import java.util.Scanner;

public class Exercicio5Incremento {
    public static void executar(Scanner scanner) {
        System.out.println("\n--- Exercício 5: Intervalo com incremento ---");
        int limiteSuperior = InputUtils.lerInteiro(scanner, "Digite o limite superior (> 0): ");
        int incremento = InputUtils.lerInteiro(scanner, "Digite o incremento (> 0): ");

        if (limiteSuperior <= 0 || incremento <= 0) {
            System.out.println("Erro: limite superior e incremento devem ser maiores que zero.");
            return;
        }

        StringBuilder saida = new StringBuilder("Saída: ");
        for (int i = 0; i <= limiteSuperior; i += incremento) {
            saida.append(i).append(' ');
        }

        System.out.println(saida.toString().trim());
    }
}
