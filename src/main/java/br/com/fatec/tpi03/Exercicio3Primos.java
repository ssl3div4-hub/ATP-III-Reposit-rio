package br.com.fatec.tpi03;

import java.util.Scanner;

public class Exercicio3Primos {
    public static void executar(Scanner scanner) {
        System.out.println("\n--- Exercício 3: Números primos em intervalo ---");
        int inicio = InputUtils.lerInteiro(scanner, "Digite o início do intervalo: ");
        int fim = InputUtils.lerInteiro(scanner, "Digite o fim do intervalo: ");

        if (inicio > fim) {
            int temp = inicio;
            inicio = fim;
            fim = temp;
        }

        StringBuilder saida = new StringBuilder("Primos: ");
        boolean encontrou = false;

        for (int i = Math.max(2, inicio); i <= fim; i++) {
            if (ehPrimo(i)) {
                saida.append(i).append(' ');
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Não há números primos nesse intervalo.");
            return;
        }

        System.out.println(saida.toString().trim());
    }

    private static boolean ehPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        if (numero == 2) {
            return true;
        }
        if (numero % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= numero; i += 2) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
