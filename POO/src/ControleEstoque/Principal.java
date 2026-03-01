package ControleEstoque;

import RelatorioProduto.Produto;

public class Principal {
    public static void main(String[] args) {
        ProdutoEstoque produto1 = new ProdutoEstoque();
        produto1.nome = "Teclado";
        produto1.quantidade = 25;
        produto1.vendas(25);


    }

}
