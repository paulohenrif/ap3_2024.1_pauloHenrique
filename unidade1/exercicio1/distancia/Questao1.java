/**
Exercicio 1/questao 1 = distância e amplitude
@author pauloHenrique
@version 1.0
@since 2024-08-14
@codigo-secreto 1345722089
*/

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
    Questao1 questao1 = new Questao1();
    questao1.getDistancia();
    questao1.getAmplitude();
  }
}