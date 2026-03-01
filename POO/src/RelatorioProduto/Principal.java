package RelatorioProduto;

public class Principal {
    public static void main(String[] args) {

        Produto produto1 = new Produto();

        produto1.nome = "Mouse Gamer Redragon";
        produto1.preco = 120;
        produto1.quantidade = 25;

        produto1.exibirInformacoes();
    }
}
