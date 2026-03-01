package MultasAtraso;

public class Principal {
    public static void main(String[] args) {

        LivroAtrasado livro1 = new LivroAtrasado();

        livro1.titulo = "O pequeno principe";
        livro1.diasAtraso = 3;

        livro1.exibirDetalhes();

    }
}
