package br.com.fatec.tpi03;

public class Exercicio2Fibonacci {
    public static void executar() {
        Integer n = InputUtils.lerInteiro("Exercício 2\nDigite a quantidade de termos (n > 0):");
        if (n == null) {
            return;
        }

        if (n <= 0) {
            InputUtils.mostrarErro("Erro: n deve ser maior que zero.");
            return;
        }

        StringBuilder serie = new StringBuilder("Série: ");
        long a = 1;
        long b = 1;

        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == 2) {
                serie.append(1);
            } else {
                long proximo = a + b;
                serie.append(proximo);
                a = b;
                b = proximo;
            }

            if (i < n) {
                serie.append(", ");
            }
        }

        InputUtils.mostrarInfo(serie.toString());
    }
}
