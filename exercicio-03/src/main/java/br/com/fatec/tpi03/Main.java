package br.com.fatec.tpi03;

public class Main {
    public static void main(String[] args) {
        Integer inicio = InputUtils.lerInteiro("Exercício 03\nDigite o início do intervalo:");
        if (inicio == null) return;
        Integer fim = InputUtils.lerInteiro("Exercício 03\nDigite o fim do intervalo:");
        if (fim == null) return;

        if (inicio > fim) { int t = inicio; inicio = fim; fim = t; }

        StringBuilder sb = new StringBuilder("Primos: ");
        boolean encontrou = false;
        for (int i=Math.max(2, inicio); i<=fim; i++) {
            if (ehPrimo(i)) { sb.append(i).append(' '); encontrou = true; }
        }
        if (!encontrou) InputUtils.info("Não há números primos nesse intervalo.");
        else InputUtils.info(sb.toString().trim());
    }

    private static boolean ehPrimo(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i=3; i*i<=n; i+=2) if (n % i == 0) return false;
        return true;
    }
}
