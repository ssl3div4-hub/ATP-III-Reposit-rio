package br.com.fatec.tpi03;

public class Main {
    public static void main(String[] args) {
        Integer inicio = InputUtils.lerInteiro("Exercício 01\nDigite o início do intervalo:");
        if (inicio == null) return;
        Integer fim = InputUtils.lerInteiro("Exercício 01\nDigite o fim do intervalo:");
        if (fim == null) return;

        if (inicio > fim) { int t = inicio; inicio = fim; fim = t; }

        StringBuilder sb = new StringBuilder("Pares: ");
        boolean encontrou = false;
        for (int i=inicio;i<=fim;i++) {
            if (i % 2 == 0) { sb.append(i).append(' '); encontrou = true; }
        }
        if (!encontrou) InputUtils.info("Não há números pares nesse intervalo.");
        else InputUtils.info(sb.toString().trim());
    }
}
