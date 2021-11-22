import controller.EnderecoController;
import model.Endereco;

public class App {
    public static void main(String[] args) {
        EnderecoController enderecoController = new EnderecoController();

        // Cadastrar
        var endereco1 = new Endereco(1, "Rua A", "22", "Centro", "Porto Alegre", "RS");

        enderecoController.cadastrar(endereco1);

        // Remover
        enderecoController.remover(1);

        // Buscar
        var buscaEndereco = enderecoController.buscar(1);

        if (buscaEndereco.isPresent()) {
            var obj = buscaEndereco.get();
            System.out.println(obj.getEndereco());
        } else {
            System.out.println("Endereço não existe!!!");
        }
    }
}
