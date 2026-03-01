package CalcNotas;

public class Aluno {

    String nome;
    double nota1;
    double nota2;

    void exibeRelatorio () {
        System.out.println("Nome: " + nome);
        System.out.println("Nota 1 = " + nota1);
        System.out.println("Nota 2 = " + nota2);

        var media = (nota1 + nota2) / 2;
        System.out.printf("Média: %.1f\n" , media);

        if (media >= 7) {
            System.out.println("Aprovado!");
        }else System.out.println("Reprovado!");


    }
}
