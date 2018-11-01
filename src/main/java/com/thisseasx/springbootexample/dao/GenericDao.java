package com.thisseasx.springbootexample.dao;

import java.util.List;

public interface GenericDao<T, K> {

    void setType(Class<T> t);

    T getById(K id);

    List<T> getAll();

    T insert(T u);

    T delete(K id);

    T update(T u);
}
