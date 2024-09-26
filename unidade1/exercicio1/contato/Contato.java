/**Classe Contato

Construa e teste com 3 instâncias diferentes a classe a seguir. No toString() exiba todos os valores dos atributos, sendo que o nome deve ser exibido sempre em letra MAIÚSCULA. As 3 instâncias devem ser criadas no método main. O construtor é feito com 2 parâmetros. Os nomes nas instâncias devem ser de pintores 
renascentistas.

Para mais informações sobre tipos de dados em Java, consulte:
https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
@author pauloHenrique
@version 1.0
@since 2024-08-18
@codigo-secreto 1345722089
**/

package contato;

public class Contato {
    String nome;
    String telefone;
    
    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }
    
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
        Contato contato1 = new Contato("", "");
        contato1.setNome("Leonardo Da Vinci");
        contato1.setTelefone("+55 (84) 9985-2785");

        Contato contato2 = new Contato("", "");
        contato2.setNome("Michelangelo Buonarroti");
        contato2.setTelefone("+55 (84) 9983-66850");

        Contato contato3 = new Contato("", "");
        contato3.setNome("Sandro Botticelli");
        contato3.setTelefone("+55 (84) 9982-1265");

        System.out.println(contato1);
        System.out.println(contato2);
        System.out.println(contato3);
    }

}