package br.com.fatec.tpi03;

import java.util.Scanner;

public class Exercicio4MediaFatec {
    private static final double NOTA_MINIMA = 0.0;
    private static final double NOTA_MAXIMA = 10.0;

    public static void executar(Scanner scanner) {
        System.out.println("\n--- Exercício 4: Média do aluno (modelo Fatec) ---");

        double p1 = lerNota(scanner, "Digite a nota da P1 (0 a 10): ");
        double p2 = lerNota(scanner, "Digite a nota da P2 (0 a 10): ");

        double mediaSemestral = (p1 + p2) / 2.0;
        System.out.printf("Média semestral: %.2f%n", mediaSemestral);

        if (mediaSemestral >= 6.0) {
            System.out.println("Situação: APROVADO.");
            return;
        }

        System.out.println("Aluno em exame.");
        double exame = lerNota(scanner, "Digite a nota do exame (0 a 10): ");
        double mediaFinal = (mediaSemestral + exame) / 2.0;

        System.out.printf("Média final: %.2f%n", mediaFinal);
        if (mediaFinal >= 6.0) {
            System.out.println("Situação: APROVADO APÓS EXAME.");
        } else {
            System.out.println("Situação: REPROVADO.");
        }
    }

    private static double lerNota(Scanner scanner, String mensagem) {
        while (true) {
            double nota = InputUtils.lerDouble(scanner, mensagem);
            if (nota >= NOTA_MINIMA && nota <= NOTA_MAXIMA) {
                return nota;
            }
            System.out.println("Nota fora do intervalo permitido (0 a 10).");
        }
    }
}
