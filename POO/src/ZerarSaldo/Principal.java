package ZerarSaldo;

public class Principal {
    public static void main(String[] args) {

        Saldo saldo = new Saldo();

        saldo.valor = 1579.42;

        saldo.exibirSaldo();
        saldo.zeraSaldo();
        saldo.exibirSaldo();


    }

}
