package repository;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import model.Endereco;

public class EnderecoRepository implements Repository<Endereco> {

    private Set<Endereco> banco = new HashSet<>();

    @Override
    public boolean cadastrar(Endereco entidade) {
        return banco.add(entidade);
    }

    @Override
    public Set<Endereco> listar() {
        return this.banco;
    }

    @Override
    public Optional<Endereco> buscar(int codigo) {
        return this.banco.stream().filter((obj) -> obj.getCodigo() == codigo).findFirst();
    }

    @Override
    public boolean atualizar(Endereco entidade) {
        for (Endereco endereco : this.banco) {
            if (endereco.getCodigo() == entidade.getCodigo()) {
                endereco = entidade;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remover(int codigo) {
        return this.banco.removeIf(obj -> obj.getCodigo() == codigo);
    }
}
