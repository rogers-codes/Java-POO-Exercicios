package ControlTemperatura;

public class Principal {
    public static void main(String[] args) {

        Estufa estufa1 = new Estufa();

        estufa1.local = "Moega A";
        estufa1.tempAtual = 39.2;

       estufa1.exibeRelatorio();
    }
}
