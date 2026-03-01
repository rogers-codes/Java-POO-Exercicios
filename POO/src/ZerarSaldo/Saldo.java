package ZerarSaldo;

public class Saldo {

    double valor;

    void zeraSaldo () {
        if (valor > 0) {
            valor = 0;
        }
    }

    void exibirSaldo() {
        System.out.println("Saldo atual: " + valor);
    }
}
