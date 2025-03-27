package ir.fa.Payment.Repository.Base;

import javax.transaction.Transactional;
import java.util.List;
@Transactional
public interface CRUDBaseRepository<T> {
    T create (T entity);
    T update (T entity);
    boolean delete (T entity);
    boolean deleteById (Long id);
    T findById (Long id);

    List<T> findAll();

}
