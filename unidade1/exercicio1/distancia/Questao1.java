/**Classe questao1

(0,5) Corrija os erros do arquivo "Questao1.java" que estão no seu repositório.

Para mais informações sobre tipos de dados em Java, consulte:
https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
@author pauloHenrique
@version 1.0
@since 2024-08-18
@codigo-secreto 1345722089
**/

package distancia;

import java.util.Scanner;

public class Questao1 {
  public double getDistancia() {
    Scanner teclado = new Scanner(System.in);

    double x1, y1, x2, y2, distancia = 1.0;

    System.out.println("Entre com as coordenadas x e y dos pontos nesta ordem:");
    x1 = teclado.nextDouble();
    y1 = teclado.nextDouble();
    x2 = teclado.nextDouble();
    y2 = teclado.nextDouble();

    teclado.close();

    distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

    System.out.println("A distância é: " + distancia);
    return distancia;
  }
  
  public double getAmplitude() {
    double val1 = 5.4;
    double val2 = 2.1;
    double val3 = -3.9;
    double amplitude = val1 - val2;

    System.out.println("A amplitude é: " + (amplitude - val3));
    return amplitude;
  }

  public static void main(String[] args) {
    Questao1 questao1 = new Questao1(); //Xico  - corrigindo: a impressão é aqui, não no método.
    questao1.getDistancia();
    questao1.getAmplitude();
  }
}