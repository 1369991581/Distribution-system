package com.example.springboot1.respons;


import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import javax.persistence.EntityManager;

public class IBaseRepositoryImp<T,ID> extends SimpleJpaRepository<T,ID> implements IBaseRepository<T,ID> {

    private EntityManager entityManager;

    public IBaseRepositoryImp(JpaEntityInformation<T, ?> entityInformation, EntityManager entityManager) {
        super(entityInformation, entityManager);
        this.entityManager = entityManager;
    }

    @Override
    public void refresh(T t) {
        entityManager.refresh(t);
    }
}