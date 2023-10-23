import entities.Aluno;

import java.time.LocalDate;

public class AlunoApplication {
    public static void main(String[] args) {

        //Aluno aluno = new Aluno("Alisson");
        Aluno aluno = new Aluno();
        aluno.setNome("Alisson");
        aluno.setDataNascimento(LocalDate.parse("1977-04-20"));
        aluno.setNota1(90);
        aluno.setNota2(80.8);
        aluno.setNota3(70.9);
        aluno.setNota4(90.7);

        System.out.println(aluno);
        System.out.println(aluno.getMediaNota());

    }
}
