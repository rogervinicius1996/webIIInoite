package repository;

import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

import model.Medico;

public class MedicoRepository implements Repository<Medico> {

    private Set<Medico> banco = new TreeSet<>();

    @Override
    public boolean cadastrar(Medico entidade) {
        return this.banco.add(entidade);
    }

    @Override
    public Set<Medico> listar() {
        return this.banco;
    }

    @Override
    public Optional<Medico> buscar(int codigo) {
        return this.banco.stream().filter(obj -> obj.getCodigo() == codigo).findFirst();
    }

    @Override
    public boolean atualizar(Medico entidade) {
        for (Medico medico : this.banco) {
            if (medico.getCodigo() == entidade.getCodigo()) {
                medico = entidade;
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
