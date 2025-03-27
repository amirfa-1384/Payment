package ir.fa.Payment.service.Base.impl;

import ir.fa.Payment.Repository.Base.BaseRepository;
import ir.fa.Payment.entity.base.BaseEntity;
import ir.fa.Payment.exception.NotFoundException;
import ir.fa.Payment.mapper.Base.BaseMapper;
import ir.fa.Payment.service.Base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Optional;

@Transactional
public abstract class BaseServiceImpl<T extends BaseEntity, D, MPR extends BaseMapper<T, D>> implements BaseService<D> {
    @Autowired
    protected BaseRepository<T> repository;
    protected Class<T> entity;
    protected Class<D> model;
    protected MPR translator;


    public BaseServiceImpl() {
        try {
            Type clazzType = this.getClass().getGenericSuperclass();
            ParameterizedType pt = (ParameterizedType) clazzType;

            entity = (Class<T>) pt.getActualTypeArguments()[0];
            model = (Class<D>) pt.getActualTypeArguments()[1];

            Class<MPR> clazz = (Class<MPR>) pt.getActualTypeArguments()[2];
            translator = (MPR) clazz.getClassLoader().loadClass(clazz.getName() + "Impl").newInstance();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public D save(D dto) {
        T entity = translator.toEntity(dto);
        T created = repository.create(entity);
        return translator.toDto(created);
    }


    @Override
    public D findById(Long id) {
        D dto= translator.toDto(repository.findById(id));
        return dto;
    }

    @Override
    public List<D> findAll() {
        List<T> entities = repository.findAll();
        return translator.toDtoList(entities);
    }

    @Override
    public boolean deleteById(Long id) throws Exception {
        try {
            T entity = repository.findById(id);
            if (entity == null || entity.getId() == null) {
                throw new NotFoundException("NotFound");
            }
            entity.setDataState(100);
            repository.update(entity);
            return true;


        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    public boolean delete(D dto) {
        T entity = translator.toEntity(dto);
        try {
            repository.delete(entity);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

/*    @Override
    public boolean softDelete(D dto){
        T entity = translator.toEntity(dto);
        try {
            repository.softDelete(entity);
            return true;
        }catch (Exception ex){
            return false;
        }
    }*/
}
