package unidade1.gabarito_aula4;

import java.util.LinkedList;

public class TestaListaAlunos {
    public static void main(String[] args) {
        LinkedList<Aluno> osQueridos = new LinkedList<Aluno>();

        // for (int i = 0; i <= 89765; i++) {
        //     Aluno umAluno = new Aluno();
        //     umAluno.setNome("Aluno: " + i);
        //     osAlunos.add(umAluno);
        //     System.out.println(umAluno);
        // }

        for (int i = 0; i <= 89765; i++) {
            Aluno umQuerido = new Aluno();
            umQuerido.setNome("AlunoNumero " + i);
            osQueridos.add(umQuerido);
        }

        System.out.println("Imprimindo a lista de queridos");
        for (Aluno aluno : osQueridos) {
            System.out.println(aluno);
        }
    }
}