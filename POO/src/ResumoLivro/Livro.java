package ResumoLivro;

public class Livro {

    String autor;
    String titulo;
    int paginas;

    void exibirInformacoes() {
        System.out.printf(titulo + " De: " + autor + " Com: " + paginas + " paginas.");
    }
}
