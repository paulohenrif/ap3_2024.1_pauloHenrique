package unidade3.exercicio1.estacionamento;

public class VeiculoNaoEncontradoException extends Exception {
    public VeiculoNaoEncontradoException(String message) {
        super("O veículo " + message + " não foi encontrado no estacionamento.");
    }
}