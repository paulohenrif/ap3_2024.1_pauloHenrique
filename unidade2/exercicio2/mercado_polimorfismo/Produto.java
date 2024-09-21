package unidade2.exercicio2.mercado_polimorfismo;

public abstract class Produto {
    
    private String nome;
    private int quantidade;
    public Boolean verificarValidade;
    
    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto(Boolean verificarValidade) {
        this.verificarValidade = verificarValidade;
    }

    public abstract boolean verificarValidade();

    public Boolean getVerificarValidade() {
        return verificarValidade;
    }

    public void setVerificarValidade(Boolean verificarValidade) {
        this.verificarValidade = verificarValidade;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", quantidade=" + quantidade + ", verificarValidade=" + verificarValidade
                + "]";
    }
}
