package estacionamento;

class RemoverLivroThread extends Thread {
    private Estacionamento estacionamento;
    private String placa;

    public void RemoverVeiculoThread(Estacionamento estacionamento, String placa) {
        this.estacionamento = estacionamento;
        this.placa = placa;
    }

    @Override
    public void run() {
        try {
            estacionamento.remover(placa);
        } catch (VeiculoNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }
}
