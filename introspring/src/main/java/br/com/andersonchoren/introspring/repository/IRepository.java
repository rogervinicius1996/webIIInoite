package br.com.andersonchoren.introspring.repository;

import java.util.List;

public interface IRepository<E> {
    public boolean insert(E entity);

    public boolean update(E entity);

    public E findById(int id);

    public List<E> findAll();

    public boolean delete(int id);
}
