import entities.Aluno;

import java.time.LocalDate;

public class AlunoApplication {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setNome("Alisson");
        aluno.setDataNascimento(LocalDate.parse("1977-04-20"));

        aluno.getDisciplina().setDisciplina1("Banco de Dados");
        aluno.getDisciplina().setNota1(90);

        aluno.getDisciplina().setDisciplina2("Java e OO");
        aluno.getDisciplina().setNota2(80.8);

        aluno.getDisciplina().setDisciplina3("Algoritmos");
        aluno.getDisciplina().setNota3(70.9);

        aluno.getDisciplina().setDisciplina4("Web");
        aluno.getDisciplina().setNota4(90.7);

        System.out.println();
        System.out.println(aluno);
        System.out.println(aluno.getMediaNota());
        System.out.println("Resultado: " + (aluno.getAlunoAprovado() ? "Aprovado!" : "Reprovado!"));

    }
}
