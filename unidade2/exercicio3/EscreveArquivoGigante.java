package unidade2.exercicio3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class EscreveArquivoGigante {
    public static void main(String[] args) {
        String nomeDoArquivo = "funcionarios.csv";

        String[] nomes = {"Paulo", "Henrique", "Felipe", "Fagundes"};
        String[] departamentos = {"Marcketing", "Desenvolvimento", "QA"};

        Random random = new Random();
        boolean append = false;

        try {
            BufferedWriter arquivoCSV = new BufferedWriter(new FileWriter(nomeDoArquivo, append));

            for(long controle = 1; controle <= 8987411; controle++) {
                
                long idFuncionario = controle;
                String nome = nomes[random.nextInt(nomes.length)];
                String departamento = departamentos[random.nextInt(departamentos.length)];
                double salario = 2000 + (20000 - 2000) * random.nextDouble(); 

                Funcionario funcionario = new Funcionario(idFuncionario, nome, departamento, salario);

                arquivoCSV.write(funcionario.toString());
                arquivoCSV.newLine();
                
                if (controle % 1000 == 0) {
                    System.out.println("registro" + controle + " de funcionarios.");
                }
            }  
            arquivoCSV.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Acabo.");
    }
}