package com.thisseasx.springbootexample.dao.impl;

import com.thisseasx.springbootexample.dao.GenericDao;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class GenericDaoImpl<T, K> implements GenericDao<T, K> {

    @PersistenceContext
    protected EntityManager em;

    private Class<T> type;

    @Override
    public void setType(Class<T> t) {
        this.type = t;
    }

    @Override
    public T getById(K id) {
        return em.find(type, id);
    }

    @Override
    public List<T> getAll() {
        return em
                .createQuery("select t from " + type.getSimpleName() + " t", type)
                .getResultList();
    }

    @Override
    public T insert(T u) {
        em.persist(u);
        return u;
    }

    @Override
    public T delete(K id) {
        T u = em.find(type, id);
        em.remove(u);
        return u;
    }

    @Override
    public T update(T u) {
        em.merge(u);
        return u;
    }
}
