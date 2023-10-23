package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private LocalDate dataNascimento;
    private String registroGeral;
    private String cpf;
    private String nomeMae;
    private String nomePai;

    private List<Disciplina> disciplinas = new ArrayList<>();


    public Aluno() {
    }

    public Aluno(String nome) {
        this.nome = nome;
    }

    public Aluno(String nome, double nota1, double nota2, double nota3, double nota4) {
        this.nome = nome;
//        this.disciplina.setNota1(nota1);
//        this.disciplina.setNota2(nota2);
//        this.disciplina.setNota3(nota3);
//        this.disciplina.setNota2(nota4);
    }

    public Aluno(String nome, LocalDate dataNascimento, String registroGeral, String cpf, String nomeMae, String nomePai) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.registroGeral = registroGeral;
        this.cpf = cpf;
        this.nomeMae = nomeMae;
        this.nomePai = nomePai;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRegistroGeral() {
        return registroGeral;
    }

    public void setRegistroGeral(String registroGeral) {
        this.registroGeral = registroGeral;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public double getMediaNota() {

        double somaNotas = 0.0;

        for (Disciplina disciplina : disciplinas) {
            somaNotas += disciplina.getNota();
        }

        return somaNotas / disciplinas.size();
    }

    public boolean getAlunoAprovado() {

        double media = getMediaNota();

        return media >= 70;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", registroGeral='" + registroGeral + '\'' +
                ", cpf='" + cpf + '\'' +
                ", nomeMae='" + nomeMae + '\'' +
                ", nomePai='" + nomePai + '\'' +
                ", disciplinas=" + disciplinas +
                '}';
    }
}
