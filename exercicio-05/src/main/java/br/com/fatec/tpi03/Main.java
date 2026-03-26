package br.com.fatec.tpi03;

public class Main {
    public static void main(String[] args) {
        Integer limite = InputUtils.lerInteiro("Exercício 05\nDigite o limite superior (>0):");
        if (limite == null) return;
        Integer incremento = InputUtils.lerInteiro("Exercício 05\nDigite o incremento (>0):");
        if (incremento == null) return;

        if (limite <= 0 || incremento <= 0) {
            InputUtils.erro("Limite e incremento devem ser maiores que zero.");
            return;
        }

        StringBuilder sb = new StringBuilder("Saída: ");
        for (int i=0; i<=limite; i+=incremento) sb.append(i).append(' ');
        InputUtils.info(sb.toString().trim());
    }
}
