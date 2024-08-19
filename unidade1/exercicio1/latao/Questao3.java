//Xico  - corrigindo: era pra ser no formato javadoc
/**
Exercicio 3/questao 3 = Latao e Zinco
@author pauloHenrique
@version 1.0
@since 2024-08-15
@codigo-secreto 1345722089
*/

package latao;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a quantidade de quilogramas desejadas: ");
        double kg = teclado.nextDouble();

        double cobre = kg * 0.7;
        double zinco = kg * 0.3;

        System.out.println("Com " + kg + "kg de latão você precisará de: ");
        System.out.println("70% Cobre: " + cobre);
        System.out.println("30% Zinco: " + zinco);

        teclado.close();
    }
}
