package br.com.fatec.tpi03;

public class Main {
    public static void main(String[] args) {
        Double p1 = lerNota("Exercício 04\nDigite a nota da P1 (0 a 10):");
        if (p1 == null) return;
        Double p2 = lerNota("Exercício 04\nDigite a nota da P2 (0 a 10):");
        if (p2 == null) return;

        double media = (p1 + p2) / 2.0;
        if (media >= 6.0) {
            InputUtils.info(String.format("Média: %.2f\nSituação: APROVADO", media));
            return;
        }

        Double exame = lerNota(String.format("Média: %.2f\nAluno em exame. Digite nota do exame (0 a 10):", media));
        if (exame == null) return;

        double mediaFinal = (media + exame) / 2.0;
        if (mediaFinal >= 6.0) InputUtils.info(String.format("Média final: %.2f\nSituação: APROVADO APÓS EXAME", mediaFinal));
        else InputUtils.info(String.format("Média final: %.2f\nSituação: REPROVADO", mediaFinal));
    }

    private static Double lerNota(String msg) {
        while (true) {
            Double n = InputUtils.lerDouble(msg);
            if (n == null) return null;
            if (n >= 0 && n <= 10) return n;
            InputUtils.erro("Nota deve estar entre 0 e 10.");
        }
    }
}
