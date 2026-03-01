package AtividadesPendentes;

public class Principal {
    public static void main(String[] args) {

        Atividade atividade1 = new Atividade();

        atividade1.descricao = "Estudar java";
        atividade1.concluida = true;

        atividade1.exibirStatus();

        Atividade atividade2 = new Atividade();
        atividade2.descricao = "Fazer exercícios";
        atividade2.concluida = true;
        atividade2.exibirStatus();
    }
}
