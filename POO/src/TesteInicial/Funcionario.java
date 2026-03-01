package TesteInicial;

public class Funcionario {

        String nome;
        String cargo;
        double salario;

        public void exibirInformacoes () {
            System.out.printf("Nome: %s, Cargo: %s, Salario: %.2f",
                    nome, cargo, salario);
        }
    }

