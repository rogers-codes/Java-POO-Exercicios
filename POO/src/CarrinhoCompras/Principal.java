package CarrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        ProdutoCarrinho p1 = new ProdutoCarrinho();

        p1.nome = "Teclado";
        p1.preco = 120.0;
        p1.quantidade = 1;

        ProdutoCarrinho p2 = new ProdutoCarrinho();

        p2.nome = "Mouse";
        p2.preco = 60.0;
        p2.quantidade = 2;

        List<ProdutoCarrinho> carrinho = new ArrayList<>();

        carrinho.add(p1);
        carrinho.add(p2);

        double totalCompra = 0;
        for (ProdutoCarrinho item : carrinho) {
            totalCompra += item.valorTotal();
        }
        System.out.printf("Total da compra: R$%.2f\n" ,totalCompra);

    }
}
