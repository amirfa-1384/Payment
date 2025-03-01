package ir.fa.Payment.mapper.Base;

import java.io.Serializable;
import java.util.List;

public interface BaseMapper<T , D>  extends Serializable {
    T toEntity(D dto);
    D toDto(T entity);
    List<T> toEntityList(List<D> dtoList);
    List<D> toDtoList(List<T> entityList);
}
