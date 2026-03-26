package br.com.fatec.tpi03;

public class Exercicio4MediaFatec {
    private static final double NOTA_MINIMA = 0.0;
    private static final double NOTA_MAXIMA = 10.0;

    public static void executar() {
        Double p1 = lerNota("Exercício 4\nDigite a nota da P1 (0 a 10):");
        if (p1 == null) {
            return;
        }

        Double p2 = lerNota("Exercício 4\nDigite a nota da P2 (0 a 10):");
        if (p2 == null) {
            return;
        }

        double mediaSemestral = (p1 + p2) / 2.0;

        if (mediaSemestral >= 6.0) {
            InputUtils.mostrarInfo(String.format("Média semestral: %.2f\nSituação: APROVADO.", mediaSemestral));
            return;
        }

        Double exame = lerNota(String.format("Média semestral: %.2f\nAluno em exame.\nDigite a nota do exame (0 a 10):", mediaSemestral));
        if (exame == null) {
            return;
        }

        double mediaFinal = (mediaSemestral + exame) / 2.0;
        if (mediaFinal >= 6.0) {
            InputUtils.mostrarInfo(String.format("Média final: %.2f\nSituação: APROVADO APÓS EXAME.", mediaFinal));
        } else {
            InputUtils.mostrarInfo(String.format("Média final: %.2f\nSituação: REPROVADO.", mediaFinal));
        }
    }

    private static Double lerNota(String mensagem) {
        while (true) {
            Double nota = InputUtils.lerDouble(mensagem);
            if (nota == null) {
                return null;
            }
            if (nota >= NOTA_MINIMA && nota <= NOTA_MAXIMA) {
                return nota;
            }
            InputUtils.mostrarErro("Nota fora do intervalo permitido (0 a 10).");
        }
    }
}
