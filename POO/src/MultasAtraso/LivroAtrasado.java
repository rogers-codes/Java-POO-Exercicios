package MultasAtraso;

public class LivroAtrasado {

    String titulo;
    int diasAtraso;

    void exibirDetalhes (){
        double multa = 2.50 * diasAtraso;

        System.out.println("Titulo: " + titulo);
        System.out.println("Multa a pagar por " + diasAtraso + " dias de atraso  R$ " + multa);
    }
}
