package unidade2.exercicio2.mercado_polimorfismo;

public class ProdutoEletronico extends Produto {
    private VOLTAGEM voltagem;

    public ProdutoEletronico(String nome, int quantidade, VOLTAGEM voltagem) {
        super(nome, quantidade);
        this.voltagem = voltagem;
    }

    public VOLTAGEM getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(VOLTAGEM voltagem) {
        this.voltagem = voltagem;
    }

    public boolean verificarValidade() {
        return false;
    }

    @Override
    public String toString() {
        return "ProdutoEletronico [voltagem=" + voltagem + "]";
    }
}
