package estacionamento;

public class AdicionarVeiculoThread extends Thread {
    private final Estacionamento estacionamento;
    private final Veiculo veiculo;

    public AdicionarVeiculoThread(Estacionamento estacionamento, Veiculo veiculo) {
        this.estacionamento = estacionamento;
        this.veiculo = veiculo;
    }

    @Override
    public void run() {
        estacionamento.adicionar(veiculo);
    }
}