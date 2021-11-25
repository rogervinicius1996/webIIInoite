package br.com.andersonchoren.introspring.service;

import java.util.List;

public interface IService<E> {
    public boolean insert(E entity);

    public boolean update(E entity);

    public E findById(int id);

    public List<E> findAll();

    public boolean delete(int id);
}
