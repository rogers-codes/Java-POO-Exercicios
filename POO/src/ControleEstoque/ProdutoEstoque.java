package ControleEstoque;

public class ProdutoEstoque {

    String nome;
    int quantidade;

    void vendas(int vender) {
        vender = (quantidade - vender);
        if (vender == 0) {
            System.out.println("estoque insuficiente");
        }

        System.out.println("Item: " + nome);
        System.out.println("Quantidade atual: " + vender);
    }
}