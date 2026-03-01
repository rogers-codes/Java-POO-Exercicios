package ColaboradorAtt;

import java.util.Scanner;

public class Colaborador {

    String nome;
    String cargo;
    int acesso;

    void alteraFuncionario(String novoCargo, int novoNivel) {
        System.out.println("--------- Antes da atualização ---------");
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Nivel de acesso: " + acesso);

        cargo = novoCargo;
        acesso = novoNivel;

        System.out.println("--------- Após atualização ---------");
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Nivel de acesso: " + acesso);

        }
    }

