package AtividadesPendentes;

public class Atividade {
    String descricao;
    boolean concluida;

    void exibirStatus () {
        System.out.println("Atividade: " + descricao);
        if (concluida) {
            System.out.println("Status: Concluido." );
        }else System.out.println("Status: Pendente." );
    }
}
