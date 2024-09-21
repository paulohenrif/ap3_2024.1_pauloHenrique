package unidade2.exercicio2.mercado_polimorfismo;

import java.time.LocalDateTime;

public class ProdutoPerecivel extends Produto {
    private LocalDateTime validade;
    
    public ProdutoPerecivel(String nome, int quantidade, LocalDateTime validade) {
        super(nome, quantidade);
        this.validade = validade;
    }

    public LocalDateTime getValidade() {
        return validade;
    }
    
    public void setValidade(LocalDateTime validade) {
        this.validade = validade;
    }

    public boolean verificarValidade() {
        System.out.println("Sim");
        return false;
    }

    @Override
    public String toString() {
        return "ProdutoPerecivel [validade=" + validade + "]";
    }
}
