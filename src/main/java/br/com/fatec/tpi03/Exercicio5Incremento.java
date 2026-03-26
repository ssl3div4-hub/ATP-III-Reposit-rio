package br.com.fatec.tpi03;

public class Exercicio5Incremento {
    public static void executar() {
        Integer limiteSuperior = InputUtils.lerInteiro("Exercício 5\nDigite o limite superior (> 0):");
        if (limiteSuperior == null) {
            return;
        }

        Integer incremento = InputUtils.lerInteiro("Exercício 5\nDigite o incremento (> 0):");
        if (incremento == null) {
            return;
        }

        if (limiteSuperior <= 0 || incremento <= 0) {
            InputUtils.mostrarErro("Erro: limite superior e incremento devem ser maiores que zero.");
            return;
        }

        StringBuilder saida = new StringBuilder("Saída: ");
        for (int i = 0; i <= limiteSuperior; i += incremento) {
            saida.append(i).append(' ');
        }

        InputUtils.mostrarInfo(saida.toString().trim());
    }
}
