package unidade3.exercicio1.estacionamento;

import java.util.Arrays;

public class Estacionamento {
    private int capacidade = 12;
    private Veiculo[] osVeiculos = new Veiculo[capacidade];
    private int contador = 0;

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public Veiculo[] getVeiculos() {
        return osVeiculos;
    }

    public void setVeiculos(Veiculo[] veiculos) {
        this.osVeiculos = veiculos;
    }

    public int getContador() {
        return contador;
    }
    
    public void setContador(int contador) {
        this.contador = contador;
    }
    
    public void adicionar(Veiculo veiculos) {
        if (contador < capacidade) {
            osVeiculos[contador] = veiculos;
            contador++;
            System.out.println("Veículo adicionado: " + veiculos.getPlaca());
        } else {
            System.out.println("Capacidade máxima atingida. Não é possível adicionar mais veículos.");
        }
    }
    
    public void remover(String message) throws VeiculoNaoEncontradoException {
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
    
    @Override
    public String toString() {
        return "Estacionamento [capacidade=" + capacidade + ", osVeiculos=" + Arrays.toString(osVeiculos)
        + ", contador=" + contador + "]";
    }
}