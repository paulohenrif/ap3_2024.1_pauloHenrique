package estacionamento;

public class Estacionamento {
    private final int capacidade = 12;
    private final Veiculo[] osVeiculos = new Veiculo[capacidade];
    private int contador = 0;
    
    public synchronized void AdicionarLivroThread(Veiculo veiculos) {
        if (contador < capacidade) {
            osVeiculos[contador] = veiculos;
            contador++;
            System.out.println("Veículo adicionado: " + veiculos.getPlaca());
        } else {
            System.out.println("Capacidade máxima atingida. Não é possível adicionar mais veículos.");
        }
    }
    
    public synchronized void RemoverLivroThread(String message) throws VeiculoNaoEncontradoException {
        for (int i = 0; i < contador; i++) {
            if (osVeiculos[i].getPlaca().equals(message)) {
                osVeiculos[i] = osVeiculos[contador - 1];
                osVeiculos[contador - 1] = null;
                contador--;
                System.out.println("Veículo removido: " + message);
                return;
            }
        }
        throw new VeiculoNaoEncontradoException(message);
    }
}