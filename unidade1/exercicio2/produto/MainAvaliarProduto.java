package unidade1.exercicio2.produto;

public class MainAvaliarProduto {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Cadeira gamer");
        Produto produto2 = new Produto("Monitor");

        // produto1.adicionarAvaliacao(new Avaliacao(5, "Ótimo!"));
        // produto1.adicionarAvaliacao(new Avaliacao(3, "Bom, mas caro."));

        // produto2.adicionarAvaliacao(new Avaliacao(4, "Boa performance."));
        // produto2.adicionarAvaliacao(new Avaliacao(-1, "Nota inválida."));

        produto1.listarAvaliacoes();
        produto2.listarAvaliacoes();
    }
}