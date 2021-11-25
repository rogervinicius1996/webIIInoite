package br.com.andersonchoren.introspring.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.andersonchoren.introspring.model.User;

@Repository
public class UserRepository implements IRepository<User> {

    private List<User> database = new ArrayList<>();

    @Override
    public boolean insert(User entity) {
        return database.add(entity);
    }

    @Override
    public boolean update(User entity) {
        if (entity.getId() < 0)
            return false;

        database.set(entity.getId(), entity);
        return true;
    }

    @Override
    public User findById(int id) {
        return database.get(id);
    }

    @Override
    public List<User> findAll() {
        return database;
    }

    @Override
    public boolean delete(int id) {
        var result = database.remove(id);
        return result != null;
    }

}
