package ColaboradorAtt;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Colaborador colaborador1 = new Colaborador();

        colaborador1.nome = "Rogério";
        colaborador1.cargo = "Desenvolvedor Java Júnior";
        colaborador1.acesso = 1;

        colaborador1.alteraFuncionario("Desenvolvedor Java Pleno",2);
    }
}
