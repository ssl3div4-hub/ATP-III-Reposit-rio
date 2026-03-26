package br.com.fatec.tpi03;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        while (true) {
            String menu = "=== LISTA DE EXERCÍCIOS - TPI-03 ===\n"
                    + "1) Números pares em intervalo\n"
                    + "2) Sequência de Fibonacci até n termos\n"
                    + "3) Números primos em intervalo\n"
                    + "4) Média do aluno (modelo Fatec)\n"
                    + "5) Intervalo de 0 ao limite com incremento\n"
                    + "0) Sair\n\n"
                    + "Escolha uma opção:";

            Integer opcao = InputUtils.lerInteiro(menu);
            if (opcao == null || opcao == 0) {
                JOptionPane.showMessageDialog(null, "Encerrando programa.", "Fim", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            switch (opcao) {
                case 1 -> Exercicio1Pares.executar();
                case 2 -> Exercicio2Fibonacci.executar();
                case 3 -> Exercicio3Primos.executar();
                case 4 -> Exercicio4MediaFatec.executar();
                case 5 -> Exercicio5Incremento.executar();
                default -> InputUtils.mostrarErro("Opção inválida. Tente novamente.");
            }
        }
    }
}
