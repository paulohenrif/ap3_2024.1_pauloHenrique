package unidade3.exercicio2;

public class MainEstacionamento {
    public static void main(String[] args) {
        Estacionamento estacionamento = new Estacionamento();
        int quantOperacoes = 984624;

        for (int i = 1; i <= quantOperacoes; i++) {
            String placa = "FABC-" + (i % 1000);
            String modelo = "Modelo " + (i % 10);
            Veiculo oVeiculo = new Veiculo(placa, modelo);
            System.out.println("Adicionando veiculo: " + oVeiculo);
            new Thread(new AdicionarVeiculoThread(estacionamento, oVeiculo)).start();
        }

        for (int i = 1; i <= quantOperacoes; i++) {
            String placa = "FABC-" + (i % 1000);
            System.out.println("Removendo veículo: " + placa);
            new Thread(new RemoverVeiculoThread(estacionamento, placa)).start();
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Erro ao aguardar as threads" + e.getMessage());
        }

    }
}