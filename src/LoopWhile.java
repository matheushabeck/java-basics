import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double media = 0;
        double nota = 0;
        int total = 0;

        while (nota != -1) {
            System.out.println("Diga sua avaliação para o filme ou -1 para encerrar: ");
            nota = sc.nextDouble();

            if (nota != -1) {
                media += nota;
                total++;
            }
        }
        System.out.println("Média: " + media/total);
    }
}
