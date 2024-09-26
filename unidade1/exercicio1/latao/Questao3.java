/**Classe questao3

(0,5) Sabendo que latão é 70% de cobre e 30% de zinco, indique a quantidade de cada um desses componentes para se obter uma certa quantidade de quilos de latão que foi requerida pelo usuário.

Para mais informações sobre tipos de dados em Java, consulte:
https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
@author pauloHenrique
@version 1.0
@since 2024-08-18
@codigo-secreto 1345722089
**/

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
