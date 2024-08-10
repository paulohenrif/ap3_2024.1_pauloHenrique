package unidade1.gabarito_aula4;

import java.time.LocalDate;

public class Aluno {
    
    String nome;
    double nota1 = 5;
    double nota2;
    double nota3;
    String nomeDaMae = "Maezinha";
    boolean aprovadoMedia = false;
    LocalDate dataNascimento = null;
    LocalDate dataCadastro = LocalDate.now();    

    public LocalDate getDataNascimento(LocalDate dataNascimento) {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public String getNomeEmMaiusculo() {
        return this.nome.toUpperCase();
    }
    public String getNomeEmMinusculo() {
        return this.nome.toLowerCase();
    }

    // double getMedia()
    public double getMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }
    // boolean aprovadomedia
    public boolean aprovadoMedia() {
        if (getMedia() >= 7)
            return true;
            
        return false;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
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

    public double nota3() {
        return nota3;
    }
    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public String getnomeDaMae() {
        return nomeDaMae;
    }
    public void setnomeDaMae(String nomeDaMae) {
        this.nomeDaMae = nomeDaMae;
    }
    
    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + ", nomeDaMae="
                + nomeDaMae + ", aprovadoMedia=" + aprovadoMedia + ", dataNascimento=" + dataNascimento
                + ", dataCadastro=" + dataCadastro + "]";
    }
}