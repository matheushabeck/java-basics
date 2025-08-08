public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Moovi");
        System.out.println("Filme: Velozes Furiosos 7");

        int anoLancamento = 2021;
        System.out.println("Ano de lançamento: " + anoLancamento);
        boolean incluidoPlano = true;
        double notaCriticos = 8.2;
        double notaPublico = 9.2;

        double media = (notaCriticos + notaPublico) /2;
        System.out.println("Media: " + media);

        String sinopse = "Um agente oferece ajuda para cuidar de Shaw em troca do resgate de um hacker. Dessa vez, não se trata apenas de velocidade: a corrida é pela sobrevivência.";
        System.out.println("Sinopse: " + sinopse);

        int classificacao = (int) (media /2);
        System.out.println("Estrelas: " + classificacao);
    }
}