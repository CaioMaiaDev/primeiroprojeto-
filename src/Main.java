public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Serie: The Rookie");

        int anoDeLancamento = 2018;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        System.out.println("Qual a nota do filme? " + notaDoFilme);

        double  media = (10.0 + 10.0 + notaDoFilme) /3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Serie The Rookie
                de um novato na policia do EUA
                ano de lançamento
                """ +  anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media /2);
        System.out.println(classificacao);
    }
}
