package br.com.fatec.tpi03;

import java.util.Scanner;

public final class InputUtils {
    private InputUtils() {
    }

    public static int lerInteiro(Scanner scanner, String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String valor = scanner.nextLine();
            try {
                return Integer.parseInt(valor.trim());
            } catch (NumberFormatException ex) {
                System.out.println("Valor inválido. Digite um número inteiro.");
            }
        }
    }

    public static double lerDouble(Scanner scanner, String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String valor = scanner.nextLine();
            try {
                return Double.parseDouble(valor.trim().replace(',', '.'));
            } catch (NumberFormatException ex) {
                System.out.println("Valor inválido. Digite um número válido.");
            }
        }
    }
}
