package ir.fa.Payment.Repository.Base.impl;

import ir.fa.Payment.Repository.Base.BaseRepository;
import ir.fa.Payment.entity.base.BaseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Optional;


public abstract class BaseRepositoryImpl<T extends BaseEntity> extends CRUDBaseRepositoryImpl<T> implements BaseRepository<T> {

    private Class<T> clazz;
    public BaseRepositoryImpl(){
        Type t= getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        clazz = (Class) pt.getActualTypeArguments()[0];
    }

}


































    /*@PersistenceContext
    private EntityManager entityManager;*/

//    private Class<T> clazz;


    /*public BaseRepositoryImpl() {

    }*/


   /* public void setClazz(Class<T> clazz) {
        this.clazz = clazz;
    }*/


    /*@Override
    public T save(T entity) {
        if (entityManager.contains(entity)) {
            return entityManager.merge(entity);
        } else {
            entityManager.persist(entity);
            return entity;
        }
    }*/

    /*@Override
    public Optional<T> findById(ID id) {
        T entity = entityManager.find(clazz,id);
        return Optional.ofNullable(entity);
    }

    @Override
    public List<T> findAll() {
        return entityManager.createQuery("SELECT * FROM " + clazz.getName() + clazz)
                .getResultList();
    }

    @Override
    public void deleteById(ID id) {
        Optional<T> entityOpt = findById(id);
        entityOpt.ifPresent(entity -> softDelete(entity));
    }

    @Override
    public void delete(T entity) {
        softDelete(entity);
    }
    @Override
    public void softDelete(T entity) {
        try {
            entityManager.createQuery("UPDATE " + clazz.getName() +
                            " e SET e.dataState = :dataState WHERE e = :entity")
                    .setParameter("dataState", 100)
                    .setParameter("entity", entity)
                    .executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
//}

