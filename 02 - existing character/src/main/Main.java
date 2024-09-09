/*
  2) Escreva um programa que verifique, em uma string, a existência da letra ‘a’, 
seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.
 */
package main;

import java.util.FormattableFlags;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int contador = 0;
        String texto = JOptionPane.showInputDialog("Escreva uma letra, palavra ou frase: ");

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);

            if (letra == 'a' || letra == 'A') {
                contador++;
            }
        }

        if (contador > 0) {
            System.out.println("A letra 'a' (maiúscula ou minúscula) aparece " + contador + " vez(es) no texto.");
        } else {
            System.out.println("A letra 'a' não aparece no texto.");
        }
    }
}
