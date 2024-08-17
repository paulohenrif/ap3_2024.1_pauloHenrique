package construct;

public class Pessoa {
    private String nome = "Paulo Henrique";

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Questao 4 [nome = " + nome + ", nome em maísculo = " + getNome().toUpperCase() + "]";
    }
}
