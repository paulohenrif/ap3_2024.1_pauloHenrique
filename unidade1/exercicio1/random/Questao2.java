/**
Exercicio 2/questao 2 = Random e lista lincada
@author pauloHenrique
@version 1.0
@since 2024-08-15
@codigo-secreto 1345722089
*/

package random;

import java.util.LinkedList;
import java.util.Random;

public class Questao2 {
    public static void main(String[] args) {
        LinkedList<Integer> listaLincada = new LinkedList<Integer>();
        Random randomNumber = new Random(); // Xico - corrigindo: por que em ingles?

        for (int i = 0; i <= 9999; i++) {
            int randola = randomNumber.nextInt();
            listaLincada.add(randola); // Xico - corrigindo: por que esse nome?
        }

        int menorPositivo = Integer.MAX_VALUE;
        for (int numeros : listaLincada) { // Xico - corrigindo: lincada?
            if ((numeros > 0) && (numeros < menorPositivo)) {
                menorPositivo = numeros;
            }
        }
        System.out.println(menorPositivo);
    }
}