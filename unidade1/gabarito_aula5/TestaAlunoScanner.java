package unidade1.gabarito_aula5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import unidade1.gabarito_aula4.Aluno;

public class TestaAlunoScanner {
    public static void main(String[] args) {
        Aluno umAluno = new Aluno();
        Scanner teclado = new Scanner(System.in);
        System.out.println();

        System.out.println("Digite o nome do aluno: ");
        String nomeDoALuno = teclado.nextLine();

        System.out.println("Digite a nota1");
        double nota1 = teclado.nextDouble();

        System.out.println("Digite a nota2");
        double nota2 = teclado.nextDouble();

        System.out.println("Digite a nota3");
        double nota3 = teclado.nextDouble();

        System.out.println("Digite o nome da mãe");
        String nomeDaMae = teclado.next();

        System.out.println("Digite a data de nascimento");
        
        DateTimeFormatter padrao = DateTimeFormatter.ofPattern("dd-mm-yyyy");
        System.out.println("Digite a data de nascimento (formato dd-mm-yyyy): ");
        String dataNascimentoString = teclado.next();
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoString, padrao);

        umAluno.setNome(nomeDoALuno);
        umAluno.setNota1(nota1);
        umAluno.setNota2(nota2);
        umAluno.setNota3(nota3);
        umAluno.setnomeDaMae(nomeDaMae);
        umAluno.setDataNascimento(dataNascimento);

        // Imprimindo um aluno.
        System.out.println(umAluno);
        teclado.close();
    }
}
