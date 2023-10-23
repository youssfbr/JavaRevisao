import entities.Aluno;
import entities.Disciplina;

import java.time.LocalDate;

public class AlunoApplication {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setNome("Alisson");
        aluno.setDataNascimento(LocalDate.parse("1977-04-20"));

        Disciplina disciplina1 = new Disciplina();
        disciplina1.setDisciplina("Banco de Dados");
        disciplina1.setNota(90);
        aluno.getDisciplinas().add(disciplina1);

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setDisciplina("Java e OO");
        disciplina2.setNota(80.8);
        aluno.getDisciplinas().add(disciplina2);

        Disciplina disciplina3 = new Disciplina();
        disciplina3.setDisciplina("Algoritmos");
        disciplina3.setNota(70.9);
        aluno.getDisciplinas().add(disciplina3);

        Disciplina disciplina4 = new Disciplina();
        disciplina4.setDisciplina("Web");
        disciplina4.setNota(90.7);
        aluno.getDisciplinas().add(disciplina4);

        System.out.println();
        System.out.println(aluno);
        System.out.println(aluno.getMediaNota());
        System.out.println("Resultado: " + (aluno.getAlunoAprovado() ? "Aprovado!" : "Reprovado!"));

    }
}
