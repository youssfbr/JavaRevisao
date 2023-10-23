package entities;

import java.time.LocalDate;

public class Aluno {
    private String nome;
    private LocalDate dataNascimento;
    private String registroGeral;
    private String cpf;
    private String nomeMae;
    private String nomePai;

    private String disciplina1;
    private double nota1;

    private String disciplina2;
    private double nota2;

    private String disciplina3;
    private double nota3;

    private String disciplina4;

    private double nota4;

    public Aluno() {
    }

    public Aluno(String nome) {
        this.nome = nome;
    }

    public Aluno(String nome, double nota1, double nota2, double nota3, double nota4) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
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

    public String getDisciplina1() {
        return disciplina1;
    }

    public void setDisciplina1(String disciplina1) {
        this.disciplina1 = disciplina1;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public String getDisciplina2() {
        return disciplina2;
    }

    public void setDisciplina2(String disciplina2) {
        this.disciplina2 = disciplina2;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public String getDisciplina3() {
        return disciplina3;
    }

    public void setDisciplina3(String disciplina3) {
        this.disciplina3 = disciplina3;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public String getDisciplina4() {
        return disciplina4;
    }

    public void setDisciplina4(String disciplina4) {
        this.disciplina4 = disciplina4;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public double getMediaNota() {
        return (nota1 + nota2 + nota3 + nota4) / 4;
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
                ", disciplina1='" + disciplina1 + '\'' +
                ", nota1=" + nota1 +
                ", disciplina2='" + disciplina2 + '\'' +
                ", nota2=" + nota2 +
                ", disciplina3='" + disciplina3 + '\'' +
                ", nota3=" + nota3 +
                ", disciplina4='" + disciplina4 + '\'' +
                ", nota4=" + nota4 +
                '}';
    }
}
