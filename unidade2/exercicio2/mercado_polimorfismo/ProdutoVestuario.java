package unidade2.exercicio2.mercado_polimorfismo;

public class ProdutoVestuario extends Produto{
    private String tamanho;

    public ProdutoVestuario(String nome, int quantidade, String tamanho) {
        super(nome, quantidade);
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "ProdutoVestuario [tamanho=" + tamanho + "]";
    }

    @Override
    public boolean verificarValidade() {
       System.out.println("SIM");
        return false;
    }

}
