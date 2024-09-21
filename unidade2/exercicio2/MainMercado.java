package unidade2.exercicio2;

// import unidade2.exercicio2.mercado_polimorfismo.Produto;
import unidade2.exercicio2.mercado_polimorfismo.ProdutoEletronico;
import unidade2.exercicio2.mercado_polimorfismo.ProdutoPerecivel;
import unidade2.exercicio2.mercado_polimorfismo.ProdutoVestuario;
import unidade2.exercicio2.mercado_polimorfismo.VOLTAGEM;

public class MainMercado {
    public static void main(String[] args) {
        // Produto produto = new Produto("cadeira", 1);
        ProdutoPerecivel perecivel = new ProdutoPerecivel("Queijo", 12, null);
        ProdutoEletronico eletronico = new ProdutoEletronico("Telefone", 2, VOLTAGEM.VOLTA_220V);
        ProdutoVestuario vestuario = new ProdutoVestuario("Calcinha", 30, "EXTRA GG");

        // boolean validadeProduto = produto.verificarValidade();
        boolean validadePerecivel = perecivel.verificarValidade();
        boolean validadeEletronico = eletronico.verificarValidade();
        boolean validadeVestuario = vestuario.verificarValidade();

        System.out.println(validadePerecivel);
        System.out.println(validadeEletronico);
        System.out.println(validadeVestuario);
    }
}
