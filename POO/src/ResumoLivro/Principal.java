package ResumoLivro;

public class Principal {
    public static void main(String[] args) {

        Livro livro1 = new Livro();

        livro1.titulo = "O guia do mochileiro das galaxias";
        livro1.autor = "Douglas Adams";
        livro1.paginas = 208;

        livro1.exibirInformacoes();
    }

}
