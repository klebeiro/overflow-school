package org.example.Repository;

import org.example.Model.BaseEntity;

import java.util.List;
import java.util.Optional;

public interface IGenericRepository<T extends BaseEntity> {
    T Create(T item);
    T FindById(long id);
    List<T> FindAll();
    T Update(T item);
    void Delete(long id);
}
