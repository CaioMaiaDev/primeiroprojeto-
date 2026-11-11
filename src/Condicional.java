public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDaSerie = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022){
            System.out.println("Lançamentos que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir");
        }

        if (incluidoNoPlano == true || tipoPlano.equals("plus")){
            System.out.println("Você pode assistir sem pagar taxa extra");
        } else {
            System.out.println("Você preisa assinar o plano plus");
        }
    }
}
