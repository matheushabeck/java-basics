package Desafios;

import java.util.Random;
import java.util.Scanner;

public class Desafio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroGerado = new Random().nextInt(100); // gera um número aleatório entre 0 e 100
        int tentativas = 0;
        int numeroDigitado = 0;

        while (tentativas < 10) {
            System.out.print("Digite um número entre 0 e 100: ");
            numeroDigitado = sc.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerado) {
                System.out.println("Parabéns, você acertou o número em " + tentativas + " tentativas!");
                break;
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("O número secreto é maior");
            } else {
                System.out.println("O número é menor.");
            }
        }

        if (tentativas == 5 && numeroDigitado != numeroGerado) {
            System.out.println("Você não conseguiu acertar o número em 05 tentativas. O número era: " + numeroGerado);
        }
    }
}