package RelatorioProduto;

public class Produto {

    String nome;
    double preco;
    int quantidade;

    public void exibirInformacoes () {
        System.out.printf("Produto: %s, \nPreço: R$ %.2f, \nQuantidade: %s",nome,preco,quantidade);
    }
}
