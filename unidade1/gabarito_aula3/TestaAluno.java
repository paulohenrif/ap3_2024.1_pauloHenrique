package unidade1.gabarito_aula3;

public class TestaAluno {
    public static void main(String[] args) {
            
        Aluno paulo = new Aluno();
        paulo.setNome("Paulo Henrique");
        paulo.setNota1(10);
        paulo.setNota2(2);
        paulo.setNota3(6);
        System.out.println();
        System.out.println(paulo);

        if (paulo.aprovadoMedia()) {
            System.out.println("Passou por média!");
        }
        else {
            System.out.println("Se fudeu, tirou " + paulo.getMedia());
        }
    }
}