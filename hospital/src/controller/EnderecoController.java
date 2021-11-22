package controller;

import java.util.Optional;
import java.util.Set;

import model.Endereco;
import repository.EnderecoRepository;

public class EnderecoController implements Controller<Endereco> {

    private EnderecoRepository enderecoRepository = new EnderecoRepository();

    @Override
    public boolean cadastrar(Endereco entidade) {
        // Processar e validar
        return enderecoRepository.cadastrar(entidade);
    }

    @Override
    public Set<Endereco> listar() {
        return enderecoRepository.listar();
    }

    @Override
    public Optional<Endereco> buscar(int codigo) {
        // Processar e validar
        return enderecoRepository.buscar(codigo);
    }

    @Override
    public boolean atualizar(Endereco entidade) {
        // Processar e validar
        return enderecoRepository.atualizar(entidade);
    }

    @Override
    public boolean remover(int codigo) {
        // Processar e validar
        if (codigo < 1) {
            return false;
        }
        return enderecoRepository.remover(codigo);
    }

}
