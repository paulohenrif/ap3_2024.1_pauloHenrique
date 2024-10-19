package estacionamento;

public class MainEstacionamento {
    public static void main(String[] args) {
        Estacionamento estacionamento = new Estacionamento();
        Veiculo veiculo1 = new Veiculo("BBBB1234", "Ferrari - 458");
        Veiculo veiculo2 = new Veiculo("GHRY3241", "Mercerdes - CLA32");
        Veiculo veiculo3 = new Veiculo("JHIU9342", "BMW - I8");

        try {
            System.out.println("Adicionando...");
            estacionamento.adicionar(veiculo1);
            estacionamento.adicionar(veiculo2);
            estacionamento.adicionar(veiculo3);
            System.out.println("3 veículos adicionados.");

            System.out.println("Removendo...");
            estacionamento.remover("KAKA");
            estacionamento.remover("QTORZE");
            System.out.println("2 veículos removidos.");
            
        } catch (VeiculoNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }
}