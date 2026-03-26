package br.com.fatec.tpi03;

public class Exercicio3Primos {
    public static void executar() {
        Integer inicio = InputUtils.lerInteiro("Exercício 3\nDigite o início do intervalo:");
        if (inicio == null) {
            return;
        }

        Integer fim = InputUtils.lerInteiro("Exercício 3\nDigite o fim do intervalo:");
        if (fim == null) {
            return;
        }

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
            InputUtils.mostrarInfo("Não há números primos nesse intervalo.");
            return;
        }

        InputUtils.mostrarInfo(saida.toString().trim());
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
