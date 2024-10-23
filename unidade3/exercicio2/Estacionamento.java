package unidade3.exercicio2;

public class Estacionamento {
    private final int capacidade = 25;
    private final Veiculo[] osVeiculos = new Veiculo[capacidade];
    private int contador = 0;

    public synchronized void adicionar(Veiculo veiculo) {
        if (contador < capacidade) {
            osVeiculos[contador] = veiculo;
            contador++;
            System.out.println("Veículo adicionado: " + veiculo.getPlaca());
        } else {
            System.out.println("Capacidade máxima atingida. Não é possível adicionar mais veículos.");
        }
    }
    
    public synchronized void remover(String message) throws VeiculoNaoEncontradoException {
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