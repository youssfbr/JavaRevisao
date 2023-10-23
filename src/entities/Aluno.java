package entities;

import java.time.LocalDate;

public class Aluno {
    private String nome;
    private LocalDate dataNascimento;
    private String registroGeral;
    private String cpf;
    private String nomeMae;
    private String nomePai;

    private double nota1;
    private double nota2;
    private double nota3;
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

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
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

        if (media >= 70) {
            return true;
        }
        else {
            return false;
        }
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
                '}';
    }
}
