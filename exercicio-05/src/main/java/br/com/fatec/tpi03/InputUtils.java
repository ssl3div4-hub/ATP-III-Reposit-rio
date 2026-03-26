package br.com.fatec.tpi03;

import javax.swing.JOptionPane;

public final class InputUtils {
    private InputUtils() {}

    public static Integer lerInteiro(String mensagem) {
        while (true) {
            String valor = JOptionPane.showInputDialog(null, mensagem, "Entrada de dados", JOptionPane.QUESTION_MESSAGE);
            if (valor == null) return null;
            try {
                return Integer.parseInt(valor.trim());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Valor inválido. Digite um número inteiro.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static Double lerDouble(String mensagem) {
        while (true) {
            String valor = JOptionPane.showInputDialog(null, mensagem, "Entrada de dados", JOptionPane.QUESTION_MESSAGE);
            if (valor == null) return null;
            try {
                return Double.parseDouble(valor.trim().replace(',', '.'));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Valor inválido. Digite um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void info(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void erro(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
    }
}
