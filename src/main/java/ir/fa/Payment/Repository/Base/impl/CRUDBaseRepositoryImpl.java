package ir.fa.Payment.Repository.Base.impl;

import ir.fa.Payment.Repository.Base.CRUDBaseRepository;
import ir.fa.Payment.entity.CodeType;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

public abstract class CRUDBaseRepositoryImpl<T> implements CRUDBaseRepository<T> {

    private Class<T> clazz;
    @PersistenceContext
    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public CRUDBaseRepositoryImpl() {
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        clazz = (Class) pt.getActualTypeArguments()[0];
    }

    @Override
    public T create(final T entity) {
        this.getEm().persist(entity);
        return entity;
    }

    @Override
    public T update(T entity) {
        T merged = this.getEm().merge(entity);
        return merged;
    }

    @Override
    public boolean delete(T entity) {
        try {
            this.getEm().remove(entity);
            return true;
        }catch (Exception ex){
            return false;
        }
    }

    @Override
    public boolean deleteById(Long id) {
        try {
            T entity = this.findById(id);

            this.getEm().remove(entity);
            return true;
        }catch (Exception ex){
            return false;
        }
    }
    @Override
    public T findById(Long id){
       String query = "SELECT e FROM " + clazz.getSimpleName() + " e WHERE e.dataState = 0 AND e.id =: id";
        List<T> resultList =  this.getEm().createQuery(query).setParameter("id" , id)
                .getResultList();

        if(resultList.size() < 1){
            return null;
        }
        return resultList.get(0);

    }

    @Override
    public List findAll() {

        String query = "SELECT e FROM " + clazz.getSimpleName() + " e WHERE e.dataState = 0";
        return this.getEm().createQuery(query).getResultList();

    }


}
