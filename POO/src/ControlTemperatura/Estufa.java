package ControlTemperatura;

public class Estufa {

    String local;
    double tempAtual;

    void exibeRelatorio () {
        System.out.println("Local: " + local);

        System.out.printf("Temperatura atual: %.1f", tempAtual);

        if (tempAtual >= 37.5) {
            System.out.println("\nALERTA! Temperatura acima do limite");
        }
    }
    }