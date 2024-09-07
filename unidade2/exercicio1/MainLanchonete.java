package unidade2.exercicio1;

import unidade2.exercicio1.lanchonete_heranca.Produto;
import unidade2.exercicio1.lanchonete_heranca.Bebida;

public class MainLanchonete {
    public static void main(String[] args) {
        Produto hamburgao = new Produto("hamburgao", 15.00);
        Bebida refrigerante = new Bebida("Refrigerante", 5.00, 0.5);

        System.out.println(hamburgao);
        System.out.println(refrigerante);
    }
}
