package unidade2.exercicio3;

public class Funcionario {
    private long idFuncionario;
    private String nome;
    private String departamento;
    private double salario;
    
    public Funcionario(long idFuncionario, String nome, String departamento, double salario) {
        this.idFuncionario = idFuncionario;
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "[" + idFuncionario + ";" + " " + nome +  ";" + " " + departamento + ";" + " " + salario + ";" + "]";
    }
}
