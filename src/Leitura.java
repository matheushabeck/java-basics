import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o seu filme favorito?");
        String filme = sc.nextLine();
        System.out.println("Qual o ano de lançamento desse filme?");
        int anoLancamento = sc.nextInt();
        System.out.println("Qual a sua avaliação para o filme?");
        double avaliacao = sc.nextDouble();

        System.out.println();
        System.out.println("Seu filme favorito é: " + filme);
        System.out.println("O ano de lançamento do filme é: " + anoLancamento);
        System.out.println("Sua avaliação para esse filme é: " + avaliacao);

    }
}
