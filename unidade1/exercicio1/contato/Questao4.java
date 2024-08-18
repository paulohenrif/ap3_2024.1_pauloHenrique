/**
Exercicio 1/questao 4 = Classe Contato
@author pauloHenrique
@version 1.0
@since 2024-08-18
@codigo-secreto 1345722089
*/

package contato;

public class Questao4 {

    String nome;
    String telefone;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    @Override
    public String toString() {
        return "Questao4 [NOME = " + nome.toUpperCase() + "]" + " | " + "[TELEFONE = " + telefone + "]";
    }
    public static void main(String[] args) {
        Questao4 contato1 = new Questao4();
        contato1.setNome("Esly do Acredito");
        contato1.setTelefone("+55 (84) 9985-2785");

        Questao4 contato2 = new Questao4();
        contato2.setNome("Tata Werneck");
        contato2.setTelefone("+55 (84) 9983-66850");

        Questao4 contato3 = new Questao4();
        contato3.setNome("Luiza Mel");
        contato3.setTelefone("+55 (84) 9982-1265");

        System.out.println(contato1);
        System.out.println(contato2);
        System.out.println(contato3);
    }
    
}