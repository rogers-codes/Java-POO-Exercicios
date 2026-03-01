package CarrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class ProdutoCarrinho {
    String nome;
    int quantidade;
    double preco;

    double valorTotal () {
        return preco * quantidade;

    }
}
