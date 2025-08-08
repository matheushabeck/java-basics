import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double media = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Qual a sua avaliação para o filme?");
            nota = sc.nextDouble();
            media += nota;
        }

        System.out.println("Média: " + media/3);

    }
}
