/*1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores 
anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde,
informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado
pertence ou não a sequência.*/
package main;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        String fibonacci = "";
        int x = 0, y = 1, z;
        int number = 0;
        boolean isFibonacci = false;

        number = Integer.parseInt(JOptionPane.showInputDialog("Calcular sequência Fibonacci\n\n Informe um número "));

        for (int i = 0; i < number; i++) {
            fibonacci = fibonacci + x + ", ";

            z = x + y;
            x = y;
            y = z;

            if (number == x) {
                isFibonacci = true;
            }
        }

        if (isFibonacci) {
            JOptionPane.showMessageDialog(null, fibonacci + "\n\nO Número " + number + " PERTENCE a sequência Fibonacci!");
        } else {
            JOptionPane.showMessageDialog(null, fibonacci + "\n\nO Número " + number + " NÃO pertence a sequência Fibonacci!");

        }
    }

}
