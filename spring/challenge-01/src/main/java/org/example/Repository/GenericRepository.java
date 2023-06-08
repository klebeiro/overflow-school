package org.example.Repository;

import org.example.Model.BaseEntity;

import java.util.List;
import java.util.Optional;

public class GenericRepository<T extends BaseEntity> implements IGenericRepository<T> {
    private final List<T> context;

    public GenericRepository(List<T> _context) {
        this.context = _context;
    }

    @Override
    public T Create(T item) {
        context.add(item);
        return item;
    }

    @Override
    public T FindById(long id) {
        return context.stream()
                .filter(item -> item.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<T> FindAll() {
        return context;
    }

    @Override
    public T Update(T updatedItem) {
        Optional<T> foundItem = context.stream()
                .filter(item -> item.getId() == updatedItem.getId())
                .findFirst();

        if(foundItem.isPresent()) {
            int index = context.indexOf(foundItem.get());
            context.set(index, updatedItem);
            return updatedItem;
        }

        return null;
    }

    @Override
    public void Delete(long id) {
        context.removeIf(item -> item.getId() == id);
    }
}
