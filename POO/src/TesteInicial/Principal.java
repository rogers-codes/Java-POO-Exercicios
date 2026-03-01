package TesteInicial;

public class Principal {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario();

        funcionario1.nome = "Rogério";
        funcionario1.cargo = "Analista Admnistrativo";
        funcionario1.salario = 2400;

        funcionario1.exibirInformacoes();


    }
}
