package br.com.fatec.tpi03;

public class Exercicio1Pares {
    public static void executar() {
        Integer inicio = InputUtils.lerInteiro("Exercício 1\nDigite o início do intervalo:");
        if (inicio == null) {
            return;
        }

        Integer fim = InputUtils.lerInteiro("Exercício 1\nDigite o fim do intervalo:");
        if (fim == null) {
            return;
        }

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
            InputUtils.mostrarInfo("Não há números pares nesse intervalo.");
            return;
        }

        InputUtils.mostrarInfo(saida.toString().trim());
    }
}
